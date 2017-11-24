package com.javearticulos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javearticulos.entidades.UserSession;

public interface UserReposuitory extends JpaRepository<UserSession, Integer>{
	
	UserSession findByToken(String token);
}
