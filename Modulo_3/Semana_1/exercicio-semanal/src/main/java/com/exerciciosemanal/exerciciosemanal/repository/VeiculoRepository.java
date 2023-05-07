package com.exerciciosemanal.exerciciosemanal.repository;

import com.exerciciosemanal.exerciciosemanal.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {
    Optional<Veiculo> findByPlaca(String placa);
    Optional<Veiculo> deleteByPlaca(String placa);
    boolean existsByPlaca(String placa);
}
