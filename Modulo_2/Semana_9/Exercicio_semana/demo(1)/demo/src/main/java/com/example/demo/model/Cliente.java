package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "clientesEX")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    private int cpf;

    @Column(name = "data_nascimento")
    private int dataNascimento;
}
