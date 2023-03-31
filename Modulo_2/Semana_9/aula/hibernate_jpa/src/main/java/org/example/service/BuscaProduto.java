package org.example.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.dao.ProdutoDAO;
import org.example.models.Categoria;
import org.example.models.Produto;

import javax.sound.midi.Soundbank;

public class BuscaProduto {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernatejpa");
        EntityManager em = factory.createEntityManager();

        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        em.getTransaction().begin();

        Produto produto = em.find(Produto.class, 21);

        Categoria categoria = em.find(Categoria.class, 1);

        produto.setCategoria(categoria);

        em.getTransaction().commit();
        em.close();

    }


}
