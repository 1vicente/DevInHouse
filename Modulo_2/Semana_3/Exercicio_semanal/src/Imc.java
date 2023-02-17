import org.w3c.dom.ls.LSOutput;

public class Imc {


    public String calculaImc (Double altura, Double peso) {

        Double imc = peso / (altura * altura);

        String retornoImc;

        if (imc < 18.5) {
            retornoImc = "Classificação: MAGREZA - IMC " + imc;
        } else if (imc >= 18.5 && imc <= 24.9) {
            retornoImc = "Classificação: NORMAL - IMC " + imc;
        } else if (imc >= 25 && imc <= 29.9) {
            retornoImc = "Classificação: SOBREPESO - IMC " + imc;
        } else if (imc >= 30 && imc <= 39.9) {
            retornoImc = "Classificação: OBESIDADE - IMC " + imc;
        } else {
            retornoImc = "Classificação: OBESIDADE GRAVE - IMC " + imc;
        }

        return retornoImc;


    }

}
