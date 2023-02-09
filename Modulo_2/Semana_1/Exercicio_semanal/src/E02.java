import java.util.Arrays;

public class E02 {
    public static void main(String[] args) {
        double[][] notas = {
                {10, 8.5, 5.5, 9.5},
                {8.5, 7, 7.5, 6},
                {8, 9, 10, 7.5},
                {9, 9.5, 10, 8}
        };

        System.out.println("Valor da nota do primeiro elemento do terceiro array de notas - " + notas[0][2]);
        System.out.println("Valor da nota do segundo elemento do quarto array de notas - " + notas[1][3]);
        double[] novoNotas = new double[4];
        for (int i=0; i < notas.length ;i++ ) {
            novoNotas[i] = notas[i][0];
        }
        System.out.println("Valor da soma das quatro primeiras notas de cada array - " + Arrays.stream(novoNotas).sum());
    }
}
