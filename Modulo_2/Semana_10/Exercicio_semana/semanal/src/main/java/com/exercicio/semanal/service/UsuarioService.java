package com.exercicio.semanal.service;


import com.exercicio.semanal.model.Usuario;
import com.exercicio.semanal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<Usuario> listarUsuario() {
        return repository.findAll();
    }

    public Usuario adicionarUsuario(Usuario usuario) {
        return repository.save(usuario);
    }


}
