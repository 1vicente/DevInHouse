import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//
//        Clinica clinicaMain = new Clinica();
//
//        System.out.println("Cadastro da Clínica");
//        System.out.printf("CNPJ.........:");
//        clinicaMain.setCnpj(scanner.next());
//        System.out.printf("Nome.........:");
//        scanner.nextLine();
//        clinicaMain.setNome(scanner.nextLine());
//        System.out.printf("Código.......:");
//        clinicaMain.setCodigo(scanner.next());
//        System.out.printf("Logradouro...:");
//        scanner.nextLine();
//        clinicaMain.setLogradouro(scanner.nextLine());
//
//        System.out.println(clinicaMain.getLogradouro());


// IMC
        Imc calculoImc  = new Imc();

        System.out.println("Digite o seu peso");
        Double peso = scanner.nextDouble();
        System.out.println("Digite sua altura");
        Double altura = scanner.nextDouble();

        System.out.println(calculoImc.calculaImc(altura,peso));


    }




}