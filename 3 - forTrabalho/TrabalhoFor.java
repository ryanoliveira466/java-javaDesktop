package Trabalho1;

import java.util.Scanner;

public class TrabalhoFor {

    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);

        Boolean menuInicial = true;
        String nome = "";
        int valor = 0;
        int valorTotal = 0;

        System.out.println("Qual o seu nome?");
        nome = lerTeclado.next();
        System.out.println("Bem vindo: " + nome);
        System.out.println("Cupuaçu (CP)");
        System.out.println("Tamanhos P = 10,00R$/ M= 15,00R$ /G = 19,00R$");
        System.out.println("Açai (AC)");
        System.out.println("Tamanhos P = 12,00R$/ M= 17,00R$ /G = 21,00R$");

        while (menuInicial) {

            String sabor = "";
            String tamanho = "";
            String cupuacu = "CP";
            String acai = "AC";
            String p = "P";
            String m = "M";
            String g = "G";
            String perguntaFinal = "";
            Boolean menuSabor = true;
            Boolean menuTamanho = true;
            Boolean menuFinal = true;

            while (menuSabor) {

                // || !sabor.equals("CP")
                // || sabor.equals("CP")
                System.out.println("Qual sabor?(CP / AC)");
                sabor = lerTeclado.next().toUpperCase();
                //System.out.println("Sabor escolhido: " + sabor);

//        if(sabor.equals(cupuacu) || sabor.equals(acai)){
//            System.out.println("Sabor escolhido corretamente dentro das opções");
//        }else
                if (sabor.equals(cupuacu)) {
                    System.out.println("Sabor escolhido: " + sabor);
                    sabor = cupuacu;
                    menuSabor = false;
                } else if (sabor.equals(acai)) {
                    System.out.println("Sabor escolhido: " + sabor);
                    sabor = acai;
                    menuSabor = false;
                } else {
                    System.out.println("Sabor fora do catalogo!");
                    menuSabor = true;
                }

            }

            while (menuTamanho) {

                System.out.println("Qual tamanho?(P / M / G)");
                tamanho = lerTeclado.next().toUpperCase();

                if (tamanho.equals(p)) {
                    System.out.println("Tamanho escolhido: " + p);
                    tamanho = p;
                    menuTamanho = false;
                } else if (tamanho.equals(m)) {
                    System.out.println("Tamanho escolhido: " + m);
                    tamanho = m;
                    menuTamanho = false;
                } else if (tamanho.equals(g)) {
                    System.out.println("Tamanho escolhido: " + g);
                    tamanho = g;
                    menuTamanho = false;
                } else {
                    System.out.println("Sabor fora do catalogo!");
                    menuTamanho = true;
                }

            }

            if (sabor.equals(cupuacu) && tamanho.equals(p)) {
                valor = 10;
            } else if (sabor.equals(cupuacu) && tamanho.equals(m)) {
                valor = 15;
            } else if (sabor.equals(cupuacu) && tamanho.equals(g)) {
                valor = 19;
            } else if (sabor.equals(acai) && tamanho.equals(p)) {
                valor = 12;
            } else if (sabor.equals(acai) && tamanho.equals(m)) {
                valor = 17;
            } else if (sabor.equals(acai) && tamanho.equals(g)) {
                valor = 21;
            }

            valorTotal += valor;

            System.out.println("Você pediu: " + sabor);
            System.out.println("Tamanho:  " + tamanho);
            System.out.println("Por:  " + valor + "R$");
               

            System.out.println("Deseja finalizar ou pedir algo mais? S/N");
            perguntaFinal = lerTeclado.next().toUpperCase();

            while (menuFinal) {
                if (perguntaFinal.equals("S")) {
                    System.out.println("Valor total: " + valorTotal + "R$");
                    menuInicial = false;
                    menuFinal = false;
                } else if (perguntaFinal.equals("N")) {
                    menuInicial = true;
                    menuFinal = false;
                } else {
                    System.out.println("Opção inválida");
                    menuFinal = true;
                }
            }

//
//        if (!sabor.equals("AC") || !sabor.equals("CP")) {
//
//            System.out.println("Sabor inválido");
//
//        } else if (sabor.equals("AC") || sabor.equals("CP")) {
//
//            System.out.println("Acabou");
//
//        }
        }

    }
}
