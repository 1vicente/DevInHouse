package com.exercicio.semanal.controller;


import com.exercicio.semanal.model.Produto;
import com.exercicio.semanal.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public List<Produto> getProtuct() {
        return service.listarProdutos();
    }

    @PostMapping
    public ResponseEntity addProduct(@RequestBody Produto produto) {
        service.adicionarProduto(produto);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
