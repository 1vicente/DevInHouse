package ex5;

public abstract class Pessoa {
    protected String nome="vicente";
    protected String sobreNome="neto";

    protected String obterNomeCompleto(){
        return nome + " " + sobreNome;
    }
}
