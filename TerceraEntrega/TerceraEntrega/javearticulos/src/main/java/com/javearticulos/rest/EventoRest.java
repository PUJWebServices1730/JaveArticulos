package com.javearticulos.rest;

import java.awt.PageAttributes.MediaType;
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
import org.springframework.web.bind.annotation.RestController;

import com.javearticulos.entidades.Evento;
import com.javearticulos.entidades.UserSession;
import com.javearticulos.entidades.Usuario;
import com.javearticulos.repositorios.EventoRepository;
import com.javearticulos.repositorios.UserReposuitory;
import com.javearticulos.repositorios.UsuarioRepository;
import com.javearticulos.seguridad.Seguridad;

@RestController
@CrossOrigin
@RequestMapping("evento")
public class EventoRest {
	
	@Autowired
	private UserReposuitory sesionrepo;
	
	@Autowired
	private EventoRepository eventoRepo;
	
	@Autowired
	private UsuarioRepository usuarioRepo;
	
	@RequestMapping(method = RequestMethod.POST,produces="application/json")
	public ResponseEntity<Evento> crearEvento(@RequestHeader("Authorization") String token,@RequestBody Evento e){
		//System.out.println(username);
		UserSession sesion = sesionrepo.findByToken(token);
		if(sesion != null){
			if(Seguridad.validateToken(token, sesion.getSecretKey())){
				Usuario u = usuarioRepo.findByUsername(sesion.getUsername());
				List<Usuario> list = new ArrayList<>();
				list.add(u);
				e.setUsuarioList(list);
				Evento ev = eventoRepo.save(e);
				u.setEvento(ev);
				usuarioRepo.save(u);
				return ResponseEntity.status(HttpStatus.OK).body(ev);
			}
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Evento> eventos(){
		return eventoRepo.findAll();
	}
}
