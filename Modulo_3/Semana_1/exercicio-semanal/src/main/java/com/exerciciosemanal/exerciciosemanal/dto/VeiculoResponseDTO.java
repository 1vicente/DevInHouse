package com.exerciciosemanal.exerciciosemanal.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VeiculoResponseDTO {
    private Integer id;
    private String placa;
    private String tipo;
    private String cor;
    private Integer anoDeFabricacao;
    private Integer qtdMultas;
}
