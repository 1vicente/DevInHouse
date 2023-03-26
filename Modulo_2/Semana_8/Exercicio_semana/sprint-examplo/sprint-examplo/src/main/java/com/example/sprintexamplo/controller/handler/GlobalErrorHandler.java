package com.example.sprintexamplo.controller.handler;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ServerErrorException;

@ControllerAdvice
@ResponseBody
public class GlobalErrorHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public RespostaErro naoEncontrado (Exception e){
        return new RespostaErro(e.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ServerErrorException.class)
    public RespostaErro naoEncontrado (ServerErrorException e){
        return new RespostaErro("Deu merda",e);
    }

}
