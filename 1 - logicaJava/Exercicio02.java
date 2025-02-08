package Aula04;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        double salarioAtual = 0;
        double valorAumento = 0;
        double salarioAtualizado = 0;
        
        System.out.println("Digite o seu salário atual");
        salarioAtual = lerTeclado.nextDouble();
        valorAumento = salarioAtual * 22/100;
        salarioAtualizado = salarioAtual + valorAumento;
        System.out.println("Salário atualizado bruto igual a: " + salarioAtualizado);
        System.out.println("Valor aumentado: " + valorAumento);

    }

}
