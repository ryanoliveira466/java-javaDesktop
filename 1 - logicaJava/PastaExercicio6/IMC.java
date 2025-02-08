package Aula05.PastaExercicio6;

public class IMC {

    public void indice(double a) {
        if (a < 16) {
            System.out.println("Magreza grave");
        } 
        else if (a >= 16 && a <= 16.9) {
            System.out.println("Magreza moderada");
        } 
        else if (a >= 17 && a <= 18.4) {
            System.out.println("Magreza leve");
        } 
        else if (a >= 18.5 && a <= 24.9) {
            System.out.println("Peso adequado");
        } 
        else if (a >= 25 && a <= 29.9) {
            System.out.println("Pré-obesidade");
        } 
        else if (a >= 30 && a <= 34.9) {
            System.out.println("Obesidade leve");
        } 
        else if (a >= 35 && a <= 39.9) {
            System.out.println("Obesidade severa");
        } 
        else {
            System.out.println("Obesidade mórbida");
        }
    }

}
