package com.devinhouse.Semana11.controller;

import com.devinhouse.Semana11.model.Produto;
import com.devinhouse.Semana11.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping("/{id}")
    public Produto listaProduto(@PathVariable Integer id){
        return service.buscar(id);
    }

    @PostMapping
    public HttpStatus cadastraProduto(@RequestBody Produto produto){
        try {
            service.cadastra(produto);
            return HttpStatus.CREATED;
        } catch (Exception e){
            return HttpStatus.BAD_REQUEST;
        }
    }
}
