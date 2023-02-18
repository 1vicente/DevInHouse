import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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


//// IMC
//        Imc calculoImc  = new Imc();
//
//        System.out.println("Digite o seu peso");
//        Double peso = scanner.nextDouble();
//        System.out.println("Digite sua altura");
//        Double altura = scanner.nextDouble();
//
//        System.out.println(calculoImc.calculaImc(altura,peso));


        System.out.println("Digite o seu peso");
        Double pesoPessoa = 33.3;
        System.out.println("Digite sua altura");
        Double alturaPessoa = 1.50;
        System.out.println("Digite sua Idade");
        int idadePessoa = 80 ;

        Clientes clientes1 = new Clientes(pesoPessoa, alturaPessoa, idadePessoa);
        Clientes clientes2 = new Clientes(33d, 33d, 33);

        List<Clientes> listaClientes = new ArrayList<>();

        Clinica clinica = new Clinica();

        clinica.setListaClientes(clientes2);
        clinica.setListaClientes(clientes1);

        listaClientes.add(clientes2);

        for (Clientes clientes : clinica.getListaClientes()) {
            System.out.println("Peso: " + clientes.getPeso() + " - Altura: " + clientes.getAltura() + " - Idade: " + clientes.getIdade());
        }

    }
}