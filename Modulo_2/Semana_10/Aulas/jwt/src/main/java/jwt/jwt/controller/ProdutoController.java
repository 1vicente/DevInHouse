package jwt.jwt.controller;

import jwt.jwt.model.Produto;
import jwt.jwt.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

   private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @GetMapping("/todos")
    public List<Produto> listarProdutos(){
       return service.listarProdutos();
   }

   @PostMapping
    public Produto salvarProduto(@RequestBody Produto produto){
       return service.salvarProduto(produto);
   }

}
