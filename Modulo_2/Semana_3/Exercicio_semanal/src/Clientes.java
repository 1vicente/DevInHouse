import java.util.List;

public class Clientes {

    private Double peso;
    private Double altura;
    private Integer idade;

    private String nome;

    public Clientes(String nome, Double peso, Double altura, Integer idade){
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
    }

    public Clientes(Double peso, Double altura){
        this.peso = peso;
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getAltura() {
        return altura;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double tratamento(){
        peso -= 5d;
        return this.peso - 5;
    }
}
