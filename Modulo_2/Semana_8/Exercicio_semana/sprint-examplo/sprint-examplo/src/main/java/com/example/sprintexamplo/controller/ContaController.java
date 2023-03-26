package com.example.sprintexamplo.controller;

import com.example.sprintexamplo.model.Cliente;
import com.example.sprintexamplo.model.Conta;
import com.example.sprintexamplo.service.ContaService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/conta")
@RestController

public class ContaController {
    private final ContaService service;

    public ContaController(ContaService service){
        this.service = service;
    }

    @GetMapping
    public List<Conta> listarContas (){
        return service.getACcounts();
    }

    @PostMapping
    public boolean salvarConta (@RequestBody Conta conta){
        return service.createCount(conta);
    }

    @DeleteMapping("/{id}")
    public boolean deletarCliente(@PathVariable Integer id){
        return service.delAccount(id);
    }

//    @PutMapping("/{id}")
//    public void atualizarCliente (@PathVariable Integer id, @RequestBody @Validated Cliente cliente){
//        service.updateClienteId(id, cliente);
//    }

    @PutMapping
    public void atualziarConta (@RequestParam("id_conta") Integer id, @RequestBody Conta conta){
        service.updateAccount(id, conta);
    }

    @GetMapping("/{id}")
    public Conta listaConta (@PathVariable Integer id){
        return service.getAccountId(id);
    }

    @PostMapping("/saque")
    public Boolean saqueConta (@RequestParam("id_conta") Integer id, @RequestParam("valor") Integer valor){
        return service.saqueService(id, valor);
    }
    @PostMapping("/deposito")
    public Boolean depositoConta (@RequestParam("id_conta") Integer id,  @RequestParam("valor") Integer valor){
       return service.depositoService(id, valor);
    }

}
