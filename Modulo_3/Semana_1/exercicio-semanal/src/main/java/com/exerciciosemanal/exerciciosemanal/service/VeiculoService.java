package com.exerciciosemanal.exerciciosemanal.service;

import com.exerciciosemanal.exerciciosemanal.dto.MultasRequestDTO;
import com.exerciciosemanal.exerciciosemanal.exception.RegistroExistenteException;
import com.exerciciosemanal.exerciciosemanal.exception.RegistroNaoencontradoException;
import com.exerciciosemanal.exerciciosemanal.exception.VeiculoComMultasException;
import com.exerciciosemanal.exerciciosemanal.model.Veiculo;
import com.exerciciosemanal.exerciciosemanal.repository.VeiculoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    public List<Veiculo> listaTodos(){
        return repository.findAll();
    }

    public Veiculo encontraPlaca(String placa) {
        Optional<Veiculo> veiculoeEncontrado = repository.findByPlaca(placa);
        if (veiculoeEncontrado.isEmpty()){
            throw new RegistroNaoencontradoException();
        }
        return veiculoeEncontrado.get();
    }

    public Veiculo cadastra(Veiculo veiculo) {
        boolean existe = repository.existsByPlaca(veiculo.getPlaca());
        if (existe){
            throw new RegistroExistenteException();
        }
        return repository.save(veiculo);
    }

    public Veiculo atualiza(MultasRequestDTO multas, String placa){
        Veiculo veiculo = encontraPlaca(placa);
        veiculo.setQtdMultas(multas.getQtdMultas());
        return repository.save(veiculo);
    }

    @Transactional
    public void deleta(String placa) {
        Optional<Veiculo> veiculoEncontrado = repository.findByPlaca(placa);
        if (veiculoEncontrado.isEmpty()) {
            throw new RegistroNaoencontradoException();
        } else if (veiculoEncontrado.get().getQtdMultas() > 0){
            throw new VeiculoComMultasException();
        }
        System.out.println(placa);
        repository.deleteByPlaca(placa);
    }
}
