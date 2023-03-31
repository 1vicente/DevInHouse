package org.example.dao;

import jakarta.persistence.EntityManager;
import org.example.models.Produto;

public class ProdutoDAO {
    private EntityManager em;

    public ProdutoDAO(EntityManager em){
        this.em = em;
    }
    public void cadastrar(Produto produto){
        this.em.persist(produto);
    }

    public void atualizar(Produto produto){
        this.em.merge(produto);
    }

    public void excluir(Produto produto){
       produto = this.em.merge(produto);
       this.em.remove(produto);
    }

}
