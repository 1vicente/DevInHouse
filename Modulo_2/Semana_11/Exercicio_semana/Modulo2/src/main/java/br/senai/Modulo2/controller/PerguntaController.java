package br.senai.Modulo2.controller;

import br.senai.Modulo2.model.Pergunta;
import br.senai.Modulo2.model.Quiz;
import br.senai.Modulo2.repository.PerguntaRepository;
import br.senai.Modulo2.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.convert.PeriodUnit;
import org.springframework.web.bind.annotation.*;

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
    public Pergunta cadastra(@RequestBody Pergunta pergunta){
        return repository.save(pergunta);
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
