package com.example.sprintexamplo.controller;

import com.example.sprintexamplo.model.Cliente;
import com.example.sprintexamplo.service.ClientService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cliente")
@RestController
public class ClienteController {

    private final ClientService service;

    public ClienteController(ClientService service){
        this.service = service;
    }
    @GetMapping
    public List<Cliente> listarClientes (){
        return service.getClientes();
    }

    @PostMapping
    public boolean salvarCliente (@RequestBody @Validated Cliente cliente){
        return service.createCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public boolean deletarCliente(@PathVariable Integer id){
       return service.delClientes(id);
    }

//    @PutMapping("/{id}")
//    public void atualizarCliente (@PathVariable Integer id, @RequestBody @Validated Cliente cliente){
//        service.updateClienteId(id, cliente);
//    }

    @PutMapping
    public void atualizarCliente (@RequestParam("id_cliente") Integer id, @RequestBody @Validated Cliente cliente){
        service.updateClienteId(id, cliente);
    }

    @GetMapping("/{id}")
    public Cliente listarClientes (@PathVariable Integer id){
        return service.getClientesId(id);
    }


}
