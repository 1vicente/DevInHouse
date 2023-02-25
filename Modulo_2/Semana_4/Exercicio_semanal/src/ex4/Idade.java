package ex4;

import java.util.Scanner;

public class Idade {


    public static void main(String[] args) {
        Idade exercicio = new Idade();
        Integer idade = null;
        while (idade == null){
            try {
                idade = exercicio.capturaIdade();
            } catch (IllegalArgumentException e) {
                System.out.println("A idade informada não é válida!");
            }
        }
        System.out.printf("Olá, você tem %d anos de idade", idade);


    }

    public int capturaIdade(){
        System.out.println("Informe a sua idade: ");
        Scanner entrada = new Scanner(System.in);
        int idade = entrada.nextInt();

        if (idade <= 0 || idade > 100) {
            throw new IllegalArgumentException();
        }
        return idade;
    }

}
