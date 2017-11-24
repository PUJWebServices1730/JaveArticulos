package com.javearticulos.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javearticulos.entidades.Evento;
import com.javearticulos.entidades.Submision;

public interface SubmisionRepository extends JpaRepository<Submision, Integer> {
	
	List<Submision> findByEvento(Evento evento);
}
