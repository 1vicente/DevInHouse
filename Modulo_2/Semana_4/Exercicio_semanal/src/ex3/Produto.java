package ex3;

public class Produto implements Tributavel {

    private double valor;
    private double valorImposto;
    @Override
    public double calcularValorcomImposto() {
        return valor + valorImposto;
    }
}
