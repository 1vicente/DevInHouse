package com.exercicio.semanal.service;

import com.exercicio.semanal.model.Produto;
import com.exercicio.semanal.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
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

    public Optional<Produto> procuraProdutoPorId(Produto produto){
        return repository.findById(produto.getId());
    }

    public void revemorProduto(Integer id) {
        repository.deleteById(id);
    }
}
