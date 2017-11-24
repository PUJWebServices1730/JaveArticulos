package com.javearticulos.rest;

import java.awt.PageAttributes.MediaType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.javearticulos.entidades.Articulo;
import com.javearticulos.entidades.Revision;
import com.javearticulos.entidades.Submision;
import com.javearticulos.entidades.UserSession;
import com.javearticulos.entidades.Usuario;
import com.javearticulos.javearticulos.Utils;
import com.javearticulos.repositorios.ArticuloRepository;
import com.javearticulos.repositorios.EventoRepository;
import com.javearticulos.repositorios.RevisionRepository;
import com.javearticulos.repositorios.SubmisionRepository;
import com.javearticulos.repositorios.UserReposuitory;
import com.javearticulos.repositorios.UsuarioRepository;
import com.javearticulos.seguridad.Seguridad;
import javax.ws.rs.QueryParam;

@RestController
@CrossOrigin
@RequestMapping("articulo")
public class ArticuloRest {
	
	@Autowired
	private UserReposuitory sesionrepo;
	
	@Autowired
	private RevisionRepository reviRepo;
	
	@Autowired
	private ArticuloRepository articuloRepo;
	
	@Autowired
	private UsuarioRepository usuRepo;
	
	@Autowired
	private SubmisionRepository subRepo;
	
	@Autowired
	private EventoRepository eventoRepo;
	
	@RequestMapping(method=RequestMethod.POST,consumes="application/json")
	public Articulo crear(@RequestHeader("Authorization") String token,@RequestBody Articulo a){
		UserSession u = sesionrepo.findByToken(token);
		if(u != null){
			if(Seguridad.validateToken(token, u.getSecretKey())){
				a.setUsuario(usuRepo.findByUsername(u.getUsername()));
				return articuloRepo.save(a);
			}
			return null;
		}
		return null;
	}
	
	@RequestMapping(value="articulosusu",method=RequestMethod.GET)
	public ResponseEntity<?> articulosUsuario(@RequestHeader("Authorization") String token){
		UserSession u = sesionrepo.findByToken(token);
		if(u != null){
			if(Seguridad.validateToken(token, u.getSecretKey())){
				Usuario usu = usuRepo.findByUsername(u.getUsername());
				List<Articulo> arts = articuloRepo.findByUsuario(usu);
				return ResponseEntity.status(HttpStatus.OK).body(arts);
			}
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
		
	}
	
	@RequestMapping(value="/submision/{idart}/{idevento}",method=RequestMethod.POST)
	public ResponseEntity<Submision> crearSubmision(@RequestHeader("Authorization") String token,
			@RequestBody Submision s,@PathVariable("idevento") String idevento,
			@PathVariable("idart") String idart){
		UserSession sesion = sesionrepo.findByToken(token);
		if(sesion!=null){
			if(Seguridad.validateToken(token, sesion.getSecretKey())){
				Articulo arti = articuloRepo.findOne(new Integer(idart));
				s.setArticulo(arti);
				s.setUsuario(usuRepo.findByUsername(sesion.getUsername()));
				s.setEvento(eventoRepo.findOne(new Integer(idevento)));
				Submision submi = subRepo.save(s);
				List<Submision> list = arti.getSubmisionList();
				list.add(submi);
				articuloRepo.save(arti);
				return ResponseEntity.status(HttpStatus.OK).body(submi);
			}
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
		}
		
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
	}
	
	@RequestMapping(value="/revision/{idRevisor}/{idSubmision}",method=RequestMethod.POST)
	public ResponseEntity<Revision> asignarRevisor(@RequestHeader("Authorization") String token,@PathVariable("idRevisor") String revisor, @PathVariable("idSubmision") String submi){
		UserSession sesion = sesionrepo.findByToken(token);
		if(sesion!=null){
			if(Seguridad.validateToken(token, sesion.getSecretKey())){
				Revision r = new Revision();
				r.setCalificacion(new Integer("-1"));
				r.setComentarios(new String());
				Submision s = subRepo.findOne(new Integer(submi));
				r.setUsuario(usuRepo.findOne(new Integer(revisor)));
				r.setSubmision(s);
				r = reviRepo.save(r);
				List<Revision> revisiones;
				if(s.getRevisionList() == null){
					revisiones = new ArrayList<>();
					revisiones.add(r);
				}else{
					revisiones = s.getRevisionList();
					revisiones.add(r);
				}
				s.setRevisionList(revisiones);
				return ResponseEntity.status(HttpStatus.OK).body(r);
			}
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
		}
		
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
	}
	
	@RequestMapping(value="calificar",method=RequestMethod.PUT)
	public Revision calificarArticulo(@RequestHeader("Authorization") String token,
			@RequestBody Revision r){
		UserSession sesion = sesionrepo.findByToken(token);
		if(sesion!=null){
			if(Seguridad.validateToken(token, sesion.getSecretKey())){
				return reviRepo.save(r);
			}
		}
		return null;
		
	}
	
	@RequestMapping(value="revisiones/{id}",method=RequestMethod.GET)
	public ResponseEntity<List<Revision>> revisiones(@RequestHeader("Authorization") String token,@PathVariable("id") String id){
		//return subRepo.findOne(new Integer(id)).getRevisionList();
		UserSession u = sesionrepo.findByToken(token);
//		Usuario usu = usuRepo.findByUsername(u.getUsername()).getRevisionList();
		if(u!=null){
			if(Seguridad.validateToken(token, u.getSecretKey())){
				List<Revision> revisiones = subRepo.findOne(new Integer(id)).getRevisionList();
				return ResponseEntity.status(HttpStatus.OK).body(usuRepo.findByUsername(u.getUsername()).getRevisionList());
			}
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
	}
	
	@RequestMapping(value="revisionesusu",method=RequestMethod.GET,produces="application/json")
	public ResponseEntity<List<Revision>> revisionesUsu(@RequestHeader("Authorization") String token){
		UserSession u = sesionrepo.findByToken(token);
		Usuario usu = usuRepo.findByUsername(u.getUsername());
		if(u!=null){
			if(Seguridad.validateToken(token, u.getSecretKey())){
				List<Revision> revisiones = reviRepo.findByUsuario(usu);
				return ResponseEntity.status(HttpStatus.OK).body(revisiones);
			}
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
	}
	
	@RequestMapping(value="submisionesevento",method=RequestMethod.GET)
	public ResponseEntity<List<Submision>> submisiones(@RequestHeader("Authorization") String token){
		UserSession u = sesionrepo.findByToken(token);
		Usuario usu = usuRepo.findByUsername(u.getUsername());
		if(u!=null){
			if(Seguridad.validateToken(token, u.getSecretKey())){
				List<Submision> submisiones = subRepo.findByEvento(usu.getEvento());
				return ResponseEntity.status(HttpStatus.OK).body(submisiones);
			}
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
	}
	
	@RequestMapping(value="submisionesev/{id}",method=RequestMethod.GET)
	public ResponseEntity<List<Submision>> submisionesev(@RequestHeader("Authorization") String token,@PathVariable("id")String id){
		UserSession u = sesionrepo.findByToken(token);
		Usuario usu = usuRepo.findByUsername(u.getUsername());
		if(u!=null){
			if(Seguridad.validateToken(token, u.getSecretKey())){
				List<Submision> submisiones = subRepo.findByEvento(eventoRepo.findOne(new Integer(id)));
				return ResponseEntity.status(HttpStatus.OK).body(submisiones);
			}
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
	}
	
	@RequestMapping(value="upload/{id}", method=RequestMethod.POST)
	public Articulo asignarArchivo( @QueryParam(value = "pdfFile") MultipartFile pdfFile,@PathVariable("id")String id){
		//Articulo articulo = articuloRepo.findOne(new Integer(id));
                Articulo articulo = new Articulo();
                articulo.setIdarticulo(Integer.parseInt(id));
                System.out.println("./"+pdfFile.getOriginalFilename());
		articulo.setArchivo("./"+pdfFile.getOriginalFilename());
		try {
			Utils.guardarPfd(pdfFile);
			articuloRepo.save(articulo);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return articulo;
	}
}
