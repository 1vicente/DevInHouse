package org.example.dao;

import jakarta.persistence.EntityManager;
import org.example.models.Categoria;

public class CategoriaDAO {
    private EntityManager em;

    public CategoriaDAO(EntityManager em){
        this.em = em;
    }

    public void cadastrar(Categoria categoria){
        this.em.persist(categoria);
    }


}
