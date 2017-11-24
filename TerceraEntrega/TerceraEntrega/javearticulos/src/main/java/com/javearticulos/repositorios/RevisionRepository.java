package com.javearticulos.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javearticulos.entidades.Revision;
import com.javearticulos.entidades.Usuario;

public interface RevisionRepository extends JpaRepository<Revision, Integer> {
	List<Revision> findByUsuario(Usuario usuario);
}
