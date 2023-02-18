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


        String nomePessoa = "vicente";
        System.out.println("Digite o seu peso");
        Double pesoPessoa = 33.3;
        System.out.println("Digite sua altura");
        Double alturaPessoa = 1.50;
        System.out.println("Digite sua Idade");
        int idadePessoa = 80 ;

        Clientes clientes1 = new Clientes(nomePessoa, pesoPessoa, alturaPessoa, idadePessoa);
        Clientes clientes2 = new Clientes("Vicente2", 33d, 33d, 33);


        Clinica clinica = new Clinica("Nome do dono", clientes1);

        clinica.setListaClientes(clientes2);
        clinica.setListaClientes(clientes1);

        clinica.listaClientes();

        System.out.println("Tratamento");
        System.out.println("Tramento CLiente 1: " + clientes2.tratamento());

        clinica.listaClientes();

        System.out.println(clinica.tratamentoCliente(0,10d));

        clinica.listaClientes();
    }


}