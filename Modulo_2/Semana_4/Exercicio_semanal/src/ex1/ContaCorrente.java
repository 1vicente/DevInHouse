package ex1;

public class ContaCorrente extends Conta implements Operavel {

    @Override
    protected double obterSaldoAtual() {
        return saldo;
    }

    @Override
    public double depositar(double valor) {
        return saldo + valor;
    }

    @Override
    public double sacar(double valor) {
        return saldo - valor;
    }
}
