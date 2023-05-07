package com.exerciciosemanal.exerciciosemanal.controller;

import com.exerciciosemanal.exerciciosemanal.dto.MultasRequestDTO;
import com.exerciciosemanal.exerciciosemanal.dto.VeiculoRequestDTO;
import com.exerciciosemanal.exerciciosemanal.exception.RegistroExistenteException;
import com.exerciciosemanal.exerciciosemanal.exception.RegistroNaoencontradoException;
import com.exerciciosemanal.exerciciosemanal.exception.VeiculoComMultasException;
import com.exerciciosemanal.exerciciosemanal.model.Veiculo;
import com.exerciciosemanal.exerciciosemanal.service.VeiculoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest
class VeiculoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    private ModelMapper modelMapper = new ModelMapper();

    @MockBean
    private VeiculoService service;

    @Nested
    class Listar {
        @Test
        @DisplayName("Quando tem veículos cadastrados, retornar lista")
        void listar_sucesso() throws Exception {
            List<Veiculo> registros = List.of(
                    new Veiculo(1, "ABCD-1234", "Carro", "preto", 2012, 0),
                    new Veiculo(2, "FGH-5678", "Caminhao", "Branco", 2020, 3));
            Mockito.when(service.listaTodos()).thenReturn(registros);
            mockMvc.perform(MockMvcRequestBuilders.get("/api/veiculos")
                            .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$", hasSize(2)));
        }

        @Test
        @DisplayName("Quando listado veículo por placa, retornar veiculo")
        void listar_placa_sucesso() throws Exception {
            Veiculo registros = new Veiculo(2, "FGH-5678", "Caminhao", "Branco", 2020, 3);
            Mockito.when(service.encontraPlaca(Mockito.anyString())).thenReturn(registros);
            mockMvc.perform(MockMvcRequestBuilders.get("/api/veiculos/{placa}", registros.getPlaca())
                            .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.placa", Matchers.is(registros.getPlaca())));
        }

        @Test
        @DisplayName("Quando listado veículo por placa que nao existe, retorna Exception")
        void listar_placa_erro() throws Exception{
            Mockito.when(service.encontraPlaca(Mockito.anyString())).thenThrow(RegistroNaoencontradoException.class);
            mockMvc.perform(MockMvcRequestBuilders.get("/api/veiculos/{placa}", "FGH-5678")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isNotFound());
        }
    }

    @Nested
    class Adicionar{
        @Test
        @DisplayName("Quando veiculo é cadastrado sem duplicidade, retornar veiculo cadastrado")
        void adicionar_sucesso() throws Exception{
            VeiculoRequestDTO request = new VeiculoRequestDTO("ABCD-1234", "Carro", "preto", 2012, 0);
            Veiculo veiculo = modelMapper.map(request, Veiculo.class);
            String requestJson = objectMapper.writeValueAsString(request);
            Mockito.when(service.cadastra(Mockito.any(Veiculo.class))).thenReturn(veiculo);
            mockMvc.perform(MockMvcRequestBuilders.post("/api/veiculos")
                            .content(requestJson)
                            .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isCreated())
                    .andExpect(jsonPath("$.placa", is(notNullValue())))
                    .andExpect(jsonPath("$.placa", is("ABCD-1234")));
        }

        @Test
        @DisplayName("Quando veículo é cadastrado com duplicidade, retornar Exception")
        void adicionar_erro() throws Exception{
            Mockito.when(service.cadastra(Mockito.any(Veiculo.class))).thenThrow(RegistroExistenteException.class);
            VeiculoRequestDTO request = new VeiculoRequestDTO("ABCD-1234", "Carro", "preto", 2012, 0);
            String requestJson = objectMapper.writeValueAsString(request);
            mockMvc.perform(MockMvcRequestBuilders.post("/api/veiculos")
                    .content(requestJson)
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isConflict())
                    .andExpect(jsonPath("$.erro", containsStringIgnoringCase("Registro já cadastrado!")));
        }
    }

    @Nested
    class Deletar {
        @Test
        @DisplayName("Quando deletar veículo existente sem multas, então deleta veículo")
        void deletar_sucesso() throws Exception {
            mockMvc.perform(MockMvcRequestBuilders.delete("/api/veiculos/{placa}", "ABCD-1234")
                    .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isNoContent());
        }

        @Test
        @DisplayName("Quando deletar veículo existente com multas, então retorna Exception")
        void deletar_erro_multas() throws Exception {
            Mockito.doThrow(VeiculoComMultasException.class).when(service).deleta(Mockito.anyString());
            mockMvc.perform(MockMvcRequestBuilders.delete("/api/veiculos/{placa}", "ABCD-1234")
                            .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isBadRequest());
        }

        @Test
        @DisplayName("Quando deletar veículo não existente, então deleta veículo")
        void deletar_erro() throws Exception {
            Mockito.doThrow(RegistroNaoencontradoException.class).when(service).deleta(Mockito.anyString());
            mockMvc.perform(MockMvcRequestBuilders.delete("/api/veiculos/{placa}", "ABCD-1234")
                            .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isNotFound());
        }
    }

    @Nested
    class Atualizar {
        @Test
        @DisplayName("Quando atualizar veiculo existente, retornar veiculo atualizado")
        void atualizar_sucesso() throws Exception {
            Veiculo registro = new Veiculo(2, "FGH-5678", "Caminhao", "Branco", 2020, 3);
            MultasRequestDTO multas = new MultasRequestDTO(100);
            String request = objectMapper.writeValueAsString(multas);
            Mockito.when(service.atualiza(Mockito.any(MultasRequestDTO.class),Mockito.anyString())).thenReturn(registro);
            mockMvc.perform(MockMvcRequestBuilders.put("/api/veiculos/{placa}/multas", registro.getPlaca())
                            .content(request)
                            .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isOk());
        }


        @Test
        @DisplayName("Quando atualizar veiculo não existente, retornar Exception")
        void atualizar_erro() throws Exception {
            Mockito.doThrow(RegistroNaoencontradoException.class).when(service).atualiza(Mockito.any(MultasRequestDTO.class),Mockito.anyString());
            MultasRequestDTO multas = new MultasRequestDTO(100);
            String request = objectMapper.writeValueAsString(multas);
            mockMvc.perform(MockMvcRequestBuilders.put("/api/veiculos/{placa}/multas", "ABCD-123466")
                            .content(request)
                            .contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().isNotFound());
        }
    }
}