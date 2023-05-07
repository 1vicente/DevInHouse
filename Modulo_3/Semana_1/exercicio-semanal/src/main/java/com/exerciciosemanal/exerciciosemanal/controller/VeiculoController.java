package com.exerciciosemanal.exerciciosemanal.controller;

import com.exerciciosemanal.exerciciosemanal.dto.MultasRequestDTO;
import com.exerciciosemanal.exerciciosemanal.dto.VeiculoRequestDTO;
import com.exerciciosemanal.exerciciosemanal.dto.VeiculoResponseDTO;
import com.exerciciosemanal.exerciciosemanal.model.Veiculo;
import com.exerciciosemanal.exerciciosemanal.service.VeiculoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService service;
    private ModelMapper modelMapper = new ModelMapper();
    @GetMapping
    public ResponseEntity<List<VeiculoResponseDTO>> lista(){
        List<Veiculo> veiculos = service.listaTodos();
        List<VeiculoResponseDTO> veiculosResp = veiculos.stream()
                .map(v -> modelMapper.map(v, VeiculoResponseDTO.class)).toList();
        return ResponseEntity.ok(veiculosResp);
    }

    @GetMapping("/{placa}")
    public ResponseEntity<VeiculoResponseDTO> listaPlaca(@PathVariable("placa") String placa){
        Veiculo veiculo = service.encontraPlaca(placa);
        VeiculoResponseDTO response = modelMapper.map(veiculo, VeiculoResponseDTO.class);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<VeiculoResponseDTO> cadastra(@RequestBody VeiculoRequestDTO request){
        System.out.println(request);
        Veiculo veiculo = modelMapper.map(request, Veiculo.class);
        veiculo = service.cadastra(veiculo);
        VeiculoResponseDTO response = modelMapper.map(veiculo, VeiculoResponseDTO.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping("/{placa}")
    public ResponseEntity<?> deleta(@PathVariable("placa") String placa){
        service.deleta(placa);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Deletado");
    }

    @PutMapping("/{placa}/multas")
    public ResponseEntity<Veiculo> atualiza(@RequestBody MultasRequestDTO request, @PathVariable("placa") String placa){
        Veiculo veiculo = service.atualiza(request, placa);
        return ResponseEntity.ok(veiculo);
    }


}
