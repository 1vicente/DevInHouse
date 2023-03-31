package org.example.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.dao.CategoriaDAO;
import org.example.dao.ProdutoDAO;
import org.example.models.Categoria;
import org.example.models.Produto;

public class CadastraProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setDescricao("Descricao JPA");
        produto.setNome("Nome JPA");
        produto.setPreco(200);
        produto.setQtdEstoque(20);

        Categoria categoria = new Categoria();

        categoria.setNome("Cursos");

        produto.setCategoria(categoria);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernatejpa");
        EntityManager em = factory.createEntityManager();

        ProdutoDAO produtoDAO = new ProdutoDAO(em);
        CategoriaDAO categoriaDAO = new CategoriaDAO(em);

        em.getTransaction().begin();

        categoriaDAO.cadastrar(categoria);
        produtoDAO.cadastrar(produto);


//        em.getTransaction().commit();
//        em.close();

        em.flush();
        em.clear();

        Produto produtoAtualizado = em.merge(produto);

        produtoAtualizado.setPreco(30000);

        em.flush();

        em.getTransaction().commit();


    }
}
