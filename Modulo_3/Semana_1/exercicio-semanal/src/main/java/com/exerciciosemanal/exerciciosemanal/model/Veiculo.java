package com.exerciciosemanal.exerciciosemanal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name ="placas")
@AllArgsConstructor
@NoArgsConstructor
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String placa;
    private String tipo;
    private String cor;
    @Column(name = "ANO_DE_FABRICACAO")
    private Integer anoDeFabricacao;
    @Column(name = "QTD_MULTAS")
    private Integer qtdMultas;

}
