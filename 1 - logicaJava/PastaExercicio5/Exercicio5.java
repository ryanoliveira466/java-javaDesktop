//Escreva um programa que a partir da informação da idade de um nadador
//informada pelo susário,efetue a classificação,do mesmo em uma das categorias
//especificadas na tabela abaixo,através de um método implementado em classe
//externa
package Aula05.PastaExercicio5;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        int idadeNadador = 0;
        Scanner lerTeclado = new Scanner(System.in);
        classificacaoNadador rank = new classificacaoNadador();
        System.out.println("Digite a idade do nadador: ");
        idadeNadador = lerTeclado.nextInt();
        rank.classificacaoIdade(idadeNadador);

    }

}
