package com.devinhouse.Semana11.service;

import com.devinhouse.Semana11.model.Produto;
import com.devinhouse.Semana11.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto buscar(Integer id){
        return repository.findById(id).get();
    }

    public List<Produto> buscar(String nome){
        return repository.findByNome(nome);
    }

    public void cadastra(Produto produto){
        repository.save(produto);
    }
}
