package com.example.sprintexamplo.service;

import com.example.sprintexamplo.model.Cliente;
import com.example.sprintexamplo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClienteRepository repository;

    public ClientService(ClienteRepository repository) {
        this.repository = repository;
    }

    public boolean createCliente (Cliente cliente) {
        return repository.setClient(cliente);
    }

    public List<Cliente> getClientes() {
        return repository.listClients();
    }

    public Cliente getClientesId(Integer id) {
        return repository.getClientId(id);
    }

    public boolean delClientes(Integer id) {
        return repository.delClientId(id);
    }

    public void updateClienteId(Integer id, Cliente cliente){
        repository.updateClientId(id, cliente);
    }
}
