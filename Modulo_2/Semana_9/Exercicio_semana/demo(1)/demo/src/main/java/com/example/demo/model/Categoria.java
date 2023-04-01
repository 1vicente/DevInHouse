package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "categoriasEX")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

}
