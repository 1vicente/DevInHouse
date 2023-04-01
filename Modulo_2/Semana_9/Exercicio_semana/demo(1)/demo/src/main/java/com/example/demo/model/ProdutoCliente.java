package com.example.demo.model;


import jakarta.persistence.*;

@Entity
@Table(name = "produto_clienteEX")
public class ProdutoCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Produto idProduto;

    @ManyToOne
    private Cliente idCliente;
}
