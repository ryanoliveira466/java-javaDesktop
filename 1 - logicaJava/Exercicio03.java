package Aula04;

import java.util.Scanner;

public class Exercicio03 {
 
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        double tempFah = 0;
        double tempCel = 0;
        System.out.println("Digite tempretatura em Fahreinheit: ");
        tempFah = lerTeclado.nextDouble();
        tempCel = (5 * (tempFah - 32)) / 9;
        System.out.println("Fahreinheit: " + tempFah + "F");
        System.out.println("Conversão para Celcius: " + tempCel + "C");

    }

}
