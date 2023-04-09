package com.exercicio.semanal.controller;

import com.exercicio.semanal.model.Usuario;
import com.exercicio.semanal.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }


    @GetMapping
    public List<Usuario> getUsers() {
        return service.listarUsuario();
    }

    @PostMapping
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario) {
        usuario.setPassword(usuario.getPassword());
        return ResponseEntity.ok(service.adicionarUsuario(usuario));
    }

}
