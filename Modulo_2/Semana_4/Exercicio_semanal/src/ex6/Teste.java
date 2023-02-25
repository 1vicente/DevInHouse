package ex6;

public class Teste {

    public static void main(String[] args) throws TamanhoInvalidoException {
        Teste teste = new Teste();

        teste.validar("vicente",6);
    }

    public void validar (String valorCampo, Integer tamanhoMaximo) throws TamanhoInvalidoException {
        try {
            if (valorCampo == null || tamanhoMaximo == null || tamanhoMaximo < 0) {
                throw new IllegalArgumentException();
            } else if (valorCampo.length() > tamanhoMaximo){
                throw new TamanhoInvalidoException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (TamanhoInvalidoException e) {
            System.out.println(e);
        }
    }
}
