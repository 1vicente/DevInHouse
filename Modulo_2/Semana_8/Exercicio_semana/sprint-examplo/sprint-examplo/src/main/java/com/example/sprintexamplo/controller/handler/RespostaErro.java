package com.example.sprintexamplo.controller.handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.server.ServerErrorException;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespostaErro {
    private String mensagem;
    private Exception excessao;

    public RespostaErro(String mensagem) {
        this.excessao = excessao;
    }
}
