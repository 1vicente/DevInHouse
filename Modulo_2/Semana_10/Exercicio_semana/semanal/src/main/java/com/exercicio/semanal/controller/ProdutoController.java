package com.exercicio.semanal.controller;


import com.exercicio.semanal.model.Produto;
import com.exercicio.semanal.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @PutMapping
    public Produto updateProduct(@RequestBody Produto produto){
        Produto update = service.procuraProdutoPorId(produto).get();

        update.setNome(produto.getNome());
        update.setValor(produto.getValor());
        update.setDescricao(produto.getDescricao());
        update.setDataLançamento(produto.getDataLançamento());

        return service.adicionarProduto(update);
    }

    @DeleteMapping
    public ResponseEntity removeProduct(@RequestBody Produto produto) {
        service.revemorProduto(produto.getId());
        return new ResponseEntity(HttpStatus.OK);
    }
}
