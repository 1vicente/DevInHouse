import ex2.Funcionarios;
import ex2.Gerente;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Funcionarios teste = new Funcionarios();

        Gerente teste2 = new Gerente();

        System.out.println(teste.obterCargo());

        System.out.println(teste2.obterCargo());
    }
}