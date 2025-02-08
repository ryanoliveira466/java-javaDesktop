package Aula04;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        //Declarar variáveis
        double base = 0;
        double altura = 0;
        double area = 0;
        Scanner lerTeclado = new Scanner(System.in);
        //Adquirir informações do usuário
        System.out.println("Digite o valor da base em cm: ");
        base = lerTeclado.nextDouble();
        System.out.println("Agora, digite o valor da altura: ");
        altura = lerTeclado.nextDouble();

        //Processar informações
        area = base * altura;
        //Apresentar o resultado ao usuário
        System.out.println("A área do retângulo em cm2 é de: " + area + "cm2");
    }

}
