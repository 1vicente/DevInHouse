package com.exerciciosemanal.exerciciosemanal.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class RequestExceptionHandler {

    @ExceptionHandler(RegistroExistenteException.class)
    public ResponseEntity<Object> handleRegistroExistenteException(RegistroExistenteException e){
        Map<String, String> retorno = new HashMap<>();
        retorno.put("erro", "Registro já cadastrado!");
        return ResponseEntity.status(HttpStatus.CONFLICT).body(retorno);
    }

    @ExceptionHandler(RegistroNaoencontradoException.class)
    public ResponseEntity<Object> handleRegistroNaoEncontradoException(RegistroNaoencontradoException e) {
        Map<String, String> retorno = new HashMap<>();
        retorno.put("erro", "Registro não encontrado!");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(retorno);
    }

    @ExceptionHandler(VeiculoComMultasException.class)
    public ResponseEntity<Object> handleVeiculoComMultasException(VeiculoComMultasException e){
        Map<String, String> retorno = new HashMap<>();
        retorno.put("erro", "Veículo possui multas e não pode ser excluído!");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(retorno);
    }

}
