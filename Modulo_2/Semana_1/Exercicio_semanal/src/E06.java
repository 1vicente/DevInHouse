import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E06 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4);
        System.out.println(lista);

        List<Integer> listaTriplo = new ArrayList<>();

        for (int i=0; i < lista.size();i++) {
            listaTriplo.add(lista.get(i) * 3);
        }
        System.out.println(listaTriplo);
    }
}
