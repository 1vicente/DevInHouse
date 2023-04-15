package br.senai.Modulo2.controller;

import br.senai.Modulo2.model.Pergunta;
import br.senai.Modulo2.model.Quiz;
import br.senai.Modulo2.model.Resposta;
import br.senai.Modulo2.repository.QuizRepository;
import br.senai.Modulo2.repository.RespostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resposta")
public class RespostaController {

    @Autowired
    private RespostaRepository repository;

    @GetMapping
    public List<Resposta> listaQuiz(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Resposta buscaId(@PathVariable Integer id){
        return repository.findById(id).get();
    }
    @PostMapping
    public Resposta cadastra(@RequestBody Resposta resposta){
        return repository.save(resposta);
    }
    @PutMapping
    public Resposta atualiza(@RequestBody Resposta resposta){
        return repository.save(resposta);
    }
    @DeleteMapping("/{id}")
    public void deleta(@PathVariable Integer id){
        repository.deleteById(id);
    }
}
