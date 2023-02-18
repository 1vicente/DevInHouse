public class Clientes {

    private Double peso;
    private Double altura;
    private Integer idade;

    public Clientes(Double peso, Double altura, Integer idade){
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;

    }

    public Double getPeso() {
        return peso;
    }

    public Double getAltura() {
        return altura;
    }

    public Integer getIdade() {
        return idade;
    }
}
