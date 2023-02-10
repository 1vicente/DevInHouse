public class E03 {
    public static void main(String[] args) {
        int[] extrato = { 100, -35, -15, -5, 55, -20 };

        for (int i=0; i < extrato.length; i++) {
            System.out.println("Valores -> " + extrato[i]);
        }

        for (int i=0; i < extrato.length; i++) {
            System.out.println("Valores invertidos -> " + extrato[(extrato.length-1) - i]);
        }

        int saldo = 0;
        for (int i=0; i < extrato.length; i++) {
            saldo += extrato[i];
        }
        System.out.println("Saldo da conta do Luke -> " + saldo);

        if (saldo >= 0) {
            System.out.println("Luke está com saldo positivo");
        } else {
            System.out.println("Luke está com saldo negativo");
        }
    }
}
