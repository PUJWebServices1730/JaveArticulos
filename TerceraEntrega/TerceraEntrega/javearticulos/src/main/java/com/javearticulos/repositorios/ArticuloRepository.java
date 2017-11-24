package com.javearticulos.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javearticulos.entidades.Articulo;
import com.javearticulos.entidades.Usuario;

public interface ArticuloRepository extends JpaRepository<Articulo, Integer>{
	List<Articulo> findByUsuario(Usuario usuario);
}
