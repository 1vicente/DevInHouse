package com.example.demo.model;

import jakarta.persistence.*;


@Entity
@Table(name = "produtosEX")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String descricao;

    private float preco;

    @ManyToOne
    private Categoria categoria;


}
