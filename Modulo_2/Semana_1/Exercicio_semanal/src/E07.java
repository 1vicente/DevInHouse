import java.util.Arrays;
import java.util.List;

public class E07 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("kirk", "spock", "scott", "mccoy", "sulu");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("For tradicional -> " + nomes.get(i));
        }

        nomes.forEach(item->System.out.println("ForEach -> " + item));

        int i =0;
        while ( i < nomes.size() ) {
            System.out.println("While -> " + nomes.get(i));
            i++;
        }
    }
}
