package com.exercicio.semanal.service;

import com.exercicio.semanal.model.Produto;
import com.exercicio.semanal.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public List<Produto> listarProdutos() {
        return repository.findAll();
    }

    public Produto adicionarProduto(Produto produto){
        return repository.save(produto);
    }
}
