package com.javearticulos.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javearticulos.entidades.Evento;
import com.javearticulos.entidades.Usuario;
import com.javearticulos.repositorios.EventoRepository;
import com.javearticulos.repositorios.UsuarioRepository;

@RestController
@RequestMapping("test")
public class Rest {
	
	@Autowired
	private EventoRepository repo;
	
	@RequestMapping
	public List<Evento> funciona(){
		return repo.findAll();
	}

}
