import java.util.Arrays;
import java.util.List;

public class E08 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(0,2,88,56,33,42,67,3,9,0,2);

        numeros.stream().findFirst().isPresent();

        Integer student2 = numeros.stream().filter(s -> {return s >= 50;}).findFirst().orElse(null);

        System.out.println("Primeiro número > 50 -> " + student2);

    }
}
