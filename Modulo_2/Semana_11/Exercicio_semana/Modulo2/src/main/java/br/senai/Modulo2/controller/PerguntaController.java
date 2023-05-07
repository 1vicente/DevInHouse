package br.senai.Modulo2.controller;

import br.senai.Modulo2.model.Pergunta;
import br.senai.Modulo2.model.Quiz;
import br.senai.Modulo2.repository.PerguntaRepository;
import br.senai.Modulo2.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.convert.PeriodUnit;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/pergunta")
public class PerguntaController {

    @Autowired
    private PerguntaRepository repository;

    @GetMapping
    public List<Pergunta> listaQuiz(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Pergunta buscaId(@PathVariable Integer id){
        return repository.findById(id).get();
    }
    @PostMapping
    public ResponseEntity<?> cadastra(@RequestBody Pergunta pergunta, UriComponentsBuilder uriBuilder){
        repository.save(pergunta);
        URI uri = uriBuilder.path("/pergunta/{id}").buildAndExpand(pergunta.getId()).toUri();
        System.out.println(uri);
        return ResponseEntity.created(uri).body(pergunta);
    }

    @PutMapping
    public Pergunta atualiza(@RequestBody Pergunta pergunta){
        return repository.save(pergunta);
    }
    @DeleteMapping("/{id}")
    public void deleta(@PathVariable Integer id){
        repository.deleteById(id);
    }

}
