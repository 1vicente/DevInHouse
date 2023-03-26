package com.example.sprintexamplo.repository;

import com.example.sprintexamplo.model.Conta;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class ContaRepository {

    private static List<Conta> contaList = new ArrayList<>();

    public Conta getAccountId(Integer id){

        return contaList.get(id);
    }

    public boolean setAccount(Conta conta){

        return contaList.add(conta);
    }

    public boolean delAccount(Integer id){

        return contaList.remove(getAccountId(id));
    }

    public void updateAccountId(Integer id, Conta conta){

        contaList.add(id,conta);
    }

    public List<Conta> listAccounts(){

        return contaList;
    }

}
