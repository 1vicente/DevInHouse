package com.exercicio.semanal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "es_produtos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String descricao;

    @Column(name="data_lancamento")
    private Date dataLançamento;

    private Double valor;

    @ManyToMany(fetch = FetchType.EAGER)
    @Column(name="id_usuario")
    private List<Usuario> usuarios = new ArrayList<>();

}
