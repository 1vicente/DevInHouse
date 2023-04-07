package com.exercicio.semanal.controller;


import com.exercicio.semanal.model.Produto;
import com.exercicio.semanal.model.Usuario;
import com.exercicio.semanal.repository.UsuarioRepository;
import com.exercicio.semanal.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<Usuario> getUsers() {
        return service.listarUsuario();
    }

    @PostMapping
    public ResponseEntity addUsers(@RequestBody Usuario usuario){
        service.adicionarUsuario(usuario);
        return new ResponseEntity(HttpStatus.CREATED);
    }

}
