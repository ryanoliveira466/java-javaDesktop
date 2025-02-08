package Aula08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExeções {

    public static void main(String[] args) {
        //exemplo2();
        exemplo3();

        String senha = null;

        try {
            System.out.println(senha.length());
            System.out.println("Próxima linha do programa");
        } catch (NullPointerException e) {
            System.out.println("Exeção executada");
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Execução do bloco finally");
        }

    }

    public static void exemplo2() {
        int[] vector = {1, 2, 3, 4, 5};

        try {
            System.out.println("Valor: " + vector[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro ao acessar valor do vetor");
            e.printStackTrace();
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Execução não verificada!");

        } finally {
            System.out.println("Segue programa");
            System.out.println("Finaliza programa");
        }

    }

    private static void exemplo3() {
        int valor1 = 0;
        int valor2 = 0;
        int resultado = 0;
        //Função que divide dois valores
        try {
            Scanner lerTeclado = new Scanner(System.in);

            System.out.println("Digite o primerio valor: ");
            valor1 = lerTeclado.nextInt();

            System.out.println("Digite o segundo valor: ");
            valor2 = lerTeclado.nextInt();

            resultado = valor1 / valor2;

            System.out.println("A soma é: " + "" + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Valor indevido para operação!");
        } catch (ArithmeticException e) {
            System.out.println("Usuário digitou o denominador 0");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro inesperado");
        } finally {
        }

        
        
        
        
        
    }
}
