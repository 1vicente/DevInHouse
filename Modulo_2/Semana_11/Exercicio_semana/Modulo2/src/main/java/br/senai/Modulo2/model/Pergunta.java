package br.senai.Modulo2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "perguntas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pergunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String texto;

    @ManyToOne
    private Quiz quiz;
}
