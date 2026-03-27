package com.usuariosdgg.usuarios_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usuariosdgg.usuarios_api.model.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long> {
	
}