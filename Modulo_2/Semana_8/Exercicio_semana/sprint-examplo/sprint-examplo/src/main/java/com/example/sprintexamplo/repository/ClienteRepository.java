package com.example.sprintexamplo.repository;

import com.example.sprintexamplo.model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteRepository {
    private static List<Cliente> clienteList = new ArrayList<>();

    public Cliente getClientId(Integer id){
        return clienteList.get(id);
    }

    public boolean setClient(Cliente cliente){
        return clienteList.add(cliente);
    }

    public boolean delClientId(Integer id){
        return clienteList.remove(getClientId(id));
    }

    public void updateClientId(Integer id, Cliente cliente){
        clienteList.add(id,cliente);
    }

    public List<Cliente> listClients(){
        return clienteList;
    }

}
