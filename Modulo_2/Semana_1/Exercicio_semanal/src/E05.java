import java.util.Arrays;

public class E05 {
    public static void main(String[] args) {
        int[][] arr1 = {{56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47},
                {1},
                {1,-1},
                null,
                {-2,-2,-2,-2},
                {20,10,30}
        };

        for (int i=0; i < arr1.length; i++){
            System.out.println("==================================");
            System.out.printf("Array %d \n", i+1);
            System.out.println(Arrays.toString(arr1[i]));

            if (arr1[i] == null) {
                System.out.println("Não é possível calcular");
            } else {
                if (arr1[i].length > 0) {
                    Arrays.sort(arr1[i]);
                    System.out.println("Maior " + arr1[i][arr1[i].length - 1]);
                    System.out.println("Menor " + arr1[i][0]);
                } else {
                    System.out.println("Impossível calcular");
                }
            }
        }
    }
}
