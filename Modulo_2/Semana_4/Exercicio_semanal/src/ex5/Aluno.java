package ex5;

public class Aluno extends Pessoa{

    private String matricula="33";

    public String registrar(){
        String nomeCompleto = obterNomeCompleto();
        return "Sou o " + nomeCompleto + " e minha matrícula é " + matricula;
    }
}
