package com.devinhouse.Semana11.model;

import jakarta.persistence.*;

@Entity
@Table(name = "S11_clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    @Column(name = "data_aniversario")
    private String dataAniversario;
}
