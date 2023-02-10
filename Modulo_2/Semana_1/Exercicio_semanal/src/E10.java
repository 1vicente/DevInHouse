import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {

        System.out.println("Digite uma palavra para verificar se é um palíndromo");
        Scanner scanner = new Scanner(System.in);
        String digitado = scanner.next();

        String digitadoInverco = new StringBuilder(digitado).reverse().toString();

        if (digitado.equals(digitadoInverco)) {
            System.out.println("É um palíndromo -> " + digitado);
        } else {
            System.out.println("Não é um palíndromo -> " + digitado);
        }
    }
}
