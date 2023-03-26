package com.example.sprintexamplo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @CPF
    private String cpf;
    private String nome;
    private Integer idade;



}
