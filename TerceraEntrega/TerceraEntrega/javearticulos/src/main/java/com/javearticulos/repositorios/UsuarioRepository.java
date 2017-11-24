package com.javearticulos.repositorios;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javearticulos.entidades.Evento;
import com.javearticulos.entidades.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	Usuario findByUsername(String username);
	List<Usuario> findByTipoAndEvento(String tipo,Evento evento);
	Usuario findByUsernameAndPassword(String username,String password);
}
