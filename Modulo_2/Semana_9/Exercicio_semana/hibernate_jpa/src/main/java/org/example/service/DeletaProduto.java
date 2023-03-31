package org.example.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.dao.ProdutoDAO;
import org.example.models.Produto;

public class DeletaProduto {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernatejpa");
        EntityManager em = factory.createEntityManager();

        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        em.getTransaction().begin();

        Produto produto = em.find(Produto.class, 22);

//        em.remove(produto);

        produtoDAO.excluir(produto);

        em.getTransaction().commit();
        em.close();
    }
}
