package Aula08.Desafio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculo {

    Scanner lerTeclado = new Scanner(System.in);

    public void calculo() {

        try {
            //resultado final
            String mString = "";
            double m = 0;
            //juros
            double i = 0;
            //tempo aplicado
            int n = 0;
            //capital aplicado
            double c = 0;
            // confirmação
            String confirmacao = "";

            System.out.println("Digite o valor do empréstimo: " + "");
            c = lerTeclado.nextDouble();

            if (c == 0 || c < 0) {
                System.out.println("Valor do empréstimo não pode ser 0 ou negativo");
            } if (c > 0) {
                System.out.println("Digite a quantidade de meses: " + "");
                n = lerTeclado.nextInt();
            } if (n < 1 || n > 24) {
                System.out.println("Valor de meses não pode ser menor que 1 ou maior que 24");
            } else {

                if (n >= 1 || n <= 12) {
                    i = (2.5 / 100);
                    n = n;
                } else if (n >= 13 || n <= 24) {
                    i = (3.5 / 100);
                    n = n;
                }

                
                

                m = c * Math.pow((1 + i), n);
                //parcela mensal
                double j = (m - c) / n;
                String jString = String.format("%.2f", j);
                mString = String.format("%.2f", m);
                
                System.out.println("Valor do empréstimo no final do contrato:" + "" + mString + "R$");
                System.out.println("Valor parcela mensal: " + "" + jString + "R$");
                
                System.out.println("Você deseja realizar essa operação S/N/: ");
                confirmacao = lerTeclado.next();
                
                if(confirmacao.toUpperCase().equals("S")){
                    System.out.println("Empréstimo confirmado");
                }
                else{
                    System.out.println("Empréstimo cancelado");
                }
                
                

            }

        } catch (InputMismatchException e) {
            System.out.println("Valor inválido para número");
            e.printStackTrace();
        } catch (Exception E) {
            System.out.println("Erro inesperado");
        } finally {
        }
    }

}
