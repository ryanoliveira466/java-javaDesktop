package Aula05.PastaExercicio6;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        double peso = 0.0;
        double altura = 0.0;
        double media = 0.0;
        
        Scanner lerTeclado = new Scanner(System.in);
        IMC rank = new IMC();

        System.out.println("Digite seu peso em KG: ");
        peso = lerTeclado.nextDouble();
        
        System.out.println("Digite sua altura em M: ");
        altura = lerTeclado.nextDouble();
        
        media = peso / Math.pow(altura, 2);
        
        System.out.println("Média igual a: " + media);
        
        rank.indice(media);

    }

}
