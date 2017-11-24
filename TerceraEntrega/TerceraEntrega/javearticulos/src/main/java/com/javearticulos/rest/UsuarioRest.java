package com.javearticulos.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("usuario")
public class UsuarioRest {
	
	@Autowired
	private UserReposuitory sesionrepo;
	
	@Autowired
	private UsuarioRepository usuRepo;
	
	@Autowired
	private EventoRepository eventoRepo;
	
	@RequestMapping(value="revisores",method=RequestMethod.GET,produces="application/json")
	public ResponseEntity<List<Usuario>> revisores(@RequestHeader("Authorization") String token){
		System.out.println(token);
		UserSession u = sesionrepo.findByToken(token);
		Usuario usu = usuRepo.findByUsername(u.getUsername());
		if(u != null){
			if(Seguridad.validateToken(token, u.getSecretKey())){
				List<Usuario> revisores = usuRepo.findByTipoAndEvento("revisor", usu.getEvento());
				return ResponseEntity.status(HttpStatus.OK).body(revisores);
			}
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
			
		
	}
	
	@RequestMapping(value="/actual",method=RequestMethod.GET,produces="application/json")
	public ResponseEntity<Usuario> usuarioActual(@RequestHeader("Authorization") String token){
		System.out.println(token);
		UserSession u = sesionrepo.findByToken(token);
		if(u != null){
			if(Seguridad.validateToken(token, u.getSecretKey())){
				Usuario usu = usuRepo.findByUsername(u.getUsername());
				return ResponseEntity.status(HttpStatus.OK).body(usu);
			}
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
			
		
	}

}
