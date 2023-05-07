package com.exerciciosemanal.exerciciosemanal.service;

import com.exerciciosemanal.exerciciosemanal.dto.MultasRequestDTO;
import com.exerciciosemanal.exerciciosemanal.exception.RegistroExistenteException;
import com.exerciciosemanal.exerciciosemanal.exception.RegistroNaoencontradoException;
import com.exerciciosemanal.exerciciosemanal.exception.VeiculoComMultasException;
import com.exerciciosemanal.exerciciosemanal.model.Veiculo;
import com.exerciciosemanal.exerciciosemanal.repository.VeiculoRepository;
import com.sun.source.tree.ModuleTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class VeiculoServiceTest {

    @Mock
    private VeiculoRepository repository;

    @InjectMocks VeiculoService service;

    @Nested
    class Listar {
        @Test
        @DisplayName("Quando solicitado para listar todos o veículos, retorna lista de veículos")
        void lista_todos_sucesso() {
            List<Veiculo> registros = List.of(
                    new Veiculo(1, "ABCD-1234", "Carro", "preto", 2012, 0),
                    new Veiculo(2, "FGH-5678", "Caminhao", "Branco", 2020, 3));
            Mockito.when(repository.findAll()).thenReturn(registros);
            List<Veiculo> resultado = service.listaTodos();
            assertFalse(resultado.isEmpty());
            assertEquals(registros.size(), resultado.size());
        }

        @Test
        @DisplayName("Quando procurar por placa existente, retornar veículo")
        void encontrarPlaca_sucesso() {
            Veiculo veiculo = new Veiculo(2, "FGH-5678", "Caminhao", "Branco", 2020, 3);
            Mockito.when(repository.findByPlaca(Mockito.anyString())).thenReturn(Optional.of(veiculo));
            Veiculo resultado = service.encontraPlaca("FGH-5678");
            assertNotNull(resultado);
            assertEquals(veiculo.getPlaca(), resultado.getPlaca());
        }

        @Test
        @DisplayName("Quando procurar por placa não existente, retornar Exception")
        void encontrarPlaca_erro() {
            Mockito.when(repository.findByPlaca(Mockito.anyString())).thenReturn(Optional.empty());
            assertThrows(RegistroNaoencontradoException.class, () -> service.encontraPlaca("AAA2222"));
        }
    }

    @Nested
    class Cadastro {
        @Test
        @DisplayName("Quando cadastrar veículo sem duplicidade, retornar veículo cadastrado")
        void cadastrar_sucesso(){
            Veiculo veiculo = new Veiculo(2, "FGH-5678", "Caminhao", "Branco", 2020, 3);
            Mockito.when(repository.existsByPlaca(Mockito.anyString())).thenReturn(false);
            Mockito.when(repository.save(Mockito.any(Veiculo.class))).thenReturn(veiculo);
            Veiculo resultado = service.cadastra(veiculo);
            assertNotNull(resultado);
        }

        @Test
        @DisplayName("Quando cadastrar veículo com duplicidade, retornar Exception")
        void cadastrar_erro() {
            Veiculo veiculo = new Veiculo(2, "FGH-5678", "Caminhao", "Branco", 2020, 3);
            Mockito.when(repository.existsByPlaca(Mockito.anyString())).thenReturn(true);
            assertThrows(RegistroExistenteException.class, () -> service.cadastra(veiculo));
        }
    }

    @Nested
    class Atualiza {
        @Test
        @DisplayName("Quando inserir novo numero de multas com veículo existente, então retorna veículo atualizado")
        void atualizaMulta_sucesso() {
            Veiculo veiculo = new Veiculo(2, "FGH-5678", "Caminhao", "Branco", 2020, 3);
            Veiculo veiculoAtualizado = new Veiculo(2, "FGH-5678", "Caminhao", "Branco", 2020, 0);
            MultasRequestDTO multasDTO = new MultasRequestDTO(0);
//            Mockito.when(repository.existsByPlaca(Mockito.anyString())).thenReturn(true);
            Mockito.when(repository.findByPlaca(Mockito.anyString())).thenReturn(Optional.of(veiculo));
            Mockito.when(repository.save(Mockito.any(Veiculo.class))).thenReturn(veiculoAtualizado);
            Veiculo resultado = service.atualiza(multasDTO, "FGH-5678");
            assertEquals(resultado.getQtdMultas(), veiculo.getQtdMultas());
        }

        @Test
        @DisplayName("Quando inserir novo numero de multas sem veiculo existente, então retorna Exception")
        void atualizaMulta_erro() {
//            Mockito.when(repository.existsByPlaca(Mockito.anyString())).thenReturn(false); //// Retorna False por padrão
            assertThrows(RegistroNaoencontradoException.class, () -> service.atualiza(new MultasRequestDTO(0),"FGH-5678"));
        }
    }

    @Nested
    class Deleta {
        @Test
        @DisplayName("Quando deleta veículo sem multa e existente, então retorna vazio")
        void deleta_sucesso(){
            Veiculo veiculo = new Veiculo(2, "FGH-5678", "Caminhao", "Branco", 2020, 0);
            Mockito.when(repository.findByPlaca(Mockito.anyString())).thenReturn(Optional.of(veiculo));
            assertDoesNotThrow( () -> service.deleta(veiculo.getPlaca()));
        }

        @Test
        @DisplayName("Quando deleta veículo inexistente, então retorna Exception")
        void deleta_erro_inexistente(){
            Mockito.when(repository.findByPlaca(Mockito.anyString())).thenReturn(Optional.empty());
            assertThrows(RegistroNaoencontradoException.class, () -> service.deleta(Mockito.anyString()));
        }

        @Test
        @DisplayName("Quando deleta veículo existente com multas, então retorna Exception")
        void deleta_erro_multa(){
            Veiculo veiculo = new Veiculo(2, "FGH-5678", "Caminhao", "Branco", 2020, 10);
            Mockito.when(repository.findByPlaca(Mockito.anyString())).thenReturn(Optional.of(veiculo));
            assertThrows(VeiculoComMultasException.class, () -> service.deleta(Mockito.anyString()));
        }
    }
}