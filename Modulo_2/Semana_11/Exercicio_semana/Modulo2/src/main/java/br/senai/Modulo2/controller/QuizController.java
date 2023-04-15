package br.senai.Modulo2.controller;

import br.senai.Modulo2.model.Pergunta;
import br.senai.Modulo2.model.Quiz;
import br.senai.Modulo2.repository.QuizRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizRepository repository;

    @GetMapping
    public List<Quiz> listaQuiz(){
        return repository.findAll();
    }
    @GetMapping("/{id}")
    public Quiz buscaId(@PathVariable Integer id){
        return repository.findById(id).get();
    }
    @PostMapping
    public Quiz cadastra(@RequestBody Quiz quiz){
        return repository.save(quiz);
    }
    @PutMapping
    public Quiz atualiza(@RequestBody Quiz quiz){
        return repository.save(quiz);
    }
    @DeleteMapping("/{id}")
    public void deleta(@PathVariable Integer id){
        repository.deleteById(id);
    }
}
