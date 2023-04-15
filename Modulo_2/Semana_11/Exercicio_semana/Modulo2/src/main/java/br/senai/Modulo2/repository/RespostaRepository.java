package br.senai.Modulo2.repository;

import br.senai.Modulo2.model.Resposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespostaRepository extends JpaRepository<Resposta, Integer> {
}
