package com.exercicio.semanal.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "es_produtos")
@Getter
@Setter
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String descricao;

    @Column(name="data_lancamento")
    private Date dataLançamento;

    private Double valor;

    public Produto(Integer id, String nome, String descricao, Date dataLançamento, Double valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataLançamento = dataLançamento;
        this.valor = valor;
    }

    public Produto(){}
}
