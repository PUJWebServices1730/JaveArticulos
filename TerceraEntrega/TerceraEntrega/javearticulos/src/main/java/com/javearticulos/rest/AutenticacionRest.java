package com.javearticulos.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javearticulos.entidades.Credenciales;
import com.javearticulos.entidades.UserSession;
import com.javearticulos.entidades.Usuario;
import com.javearticulos.repositorios.EventoRepository;
import com.javearticulos.repositorios.UserReposuitory;
import com.javearticulos.repositorios.UsuarioRepository;
import com.javearticulos.seguridad.Seguridad;

@RestController
@CrossOrigin
@RequestMapping("auth")
public class AutenticacionRest {
	
	@Autowired
	private UserReposuitory sesionRepo;
	
	@Autowired
	private UsuarioRepository usuRepo;
	
	@Autowired
	private EventoRepository eventoRepo;
	
	@RequestMapping(value="/registrar/{idevento}", method=RequestMethod.POST,consumes="application/json")
	public Usuario crearUsuario(@RequestBody Usuario u,@PathVariable("idevento") String idevento){
		u.setEvento(eventoRepo.findOne(new Integer(idevento)));
		return usuRepo.save(u);
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public ResponseEntity<?> login(@RequestBody Credenciales u){
		Usuario user = usuRepo.findByUsernameAndPassword(u.getUsername(),u.getPass());
		if(user != null){
			UserSession us = Seguridad.generateToken(user);
			sesionRepo.save(us);
			return ResponseEntity.status(HttpStatus.OK).body(us.getToken());
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
	}
 }
