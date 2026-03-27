package com.usuariosdgg.usuarios_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.usuariosdgg.usuarios_api.exception.ResourceNotFoundException;
import com.usuariosdgg.usuarios_api.model.Usuario;
import com.usuariosdgg.usuarios_api.repository.UserRepository;
@Service
public class UsuarioService {

    private final UserRepository repository;

    public UsuarioService(UserRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> obtenerTodos() {
        return repository.findAll();
    }

    public Usuario guardar(Usuario usuario) {
        return repository.save(usuario);
    }

    public Usuario obtenerPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    public void eliminar(Long id) {

        if (!repository.existsById(id)) {
        	throw new ResourceNotFoundException("Usuario no encontrado con id: " + id);
        }

        repository.deleteById(id);
    }
}