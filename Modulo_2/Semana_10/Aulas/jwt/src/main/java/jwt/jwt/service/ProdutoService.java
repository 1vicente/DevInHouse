package jwt.jwt.service;

import jwt.jwt.model.Produto;
import jwt.jwt.repository.ProdutoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public List<Produto> listarProdutos(){
        return repository.findAll();
    }

    public Produto salvarProduto(Produto produto){
        return repository.save(produto);
    }
}
