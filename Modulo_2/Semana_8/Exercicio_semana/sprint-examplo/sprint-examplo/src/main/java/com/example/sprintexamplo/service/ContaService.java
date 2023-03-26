package com.example.sprintexamplo.service;

import com.example.sprintexamplo.model.Conta;
import com.example.sprintexamplo.repository.ContaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {
    private final ContaRepository repository;

    public ContaService(ContaRepository repository) {

        this.repository = repository;
    }

    public boolean createCount (Conta conta) {

        return repository.setAccount(conta);
    }

    public List<Conta> getACcounts() {

        return repository.listAccounts();
    }

    public Conta getAccountId(Integer id) {

        return repository.getAccountId(id);
    }

    public boolean delAccount(Integer id) {

        return repository.delAccount(id);
    }

    public void updateAccount(Integer id, Conta conta){

        repository.updateAccountId(id, conta);
    }

    public Boolean saqueService (Integer id, Integer valor) {

        Integer saldo = repository.getAccountId(id).getSaldo();
        if (saldo < valor) {
            return false;
        } else {
            Integer saldoAtualizado = saldo - valor;
            repository.getAccountId(id).setSaldo(saldoAtualizado);
            return true;
        }
    }

    public Boolean depositoService (Integer id, Integer valor) {
        Integer saldo = repository.getAccountId(id).getSaldo();
        Integer saldoAtualizado = saldo + valor;
        repository.getAccountId(id).setSaldo(saldoAtualizado);
        return true;

    }
}
