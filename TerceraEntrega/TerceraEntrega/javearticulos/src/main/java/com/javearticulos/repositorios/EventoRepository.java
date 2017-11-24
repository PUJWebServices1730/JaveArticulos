package com.javearticulos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javearticulos.entidades.Evento;

public interface EventoRepository extends JpaRepository<Evento, Integer> {

}
