package Aula05;

import java.util.Scanner;

/*
Estruturas condicionais
Implemente um programa que ao receber as informações de consumo de combustível
(em litro) e distância percorrida por um automóvel, faça a classificação de
acordo com a classificação abaixo:
Média de consumo maior ou igual a  15km/l - 'Carro econômico';
Média de consumo maior que 8 e menor que 15km/l - 'Carro razoável';
Média de consumo menor que 8 km/l - 'Venda o carro';



 */
public class Exercicio04 {

    public static void main(String[] args) {

        //Declara variáveis
        double distancia = 0.0;
        double consumo = 0.0;
        double media = 0.0;
        Scanner lerTeclado = new Scanner(System.in);
        ApresentadorResultados apresenta = new ApresentadorResultados();
        classificacaoCarro rank = new classificacaoCarro();

        //Adquirir dados do usuário
        System.out.println("Informe a distância percorrida (km): ");
        distancia = lerTeclado.nextDouble();
        System.out.println("Informe o consumo (litros): ");
        consumo = lerTeclado.nextDouble();

        //Processamento das informações - método criado pelo usuário
        
        //Acesso aos métodos de classes internas
        media = calculaMediaConsumo(distancia, consumo);
        
        
        //Acesso aos métodos de classes externas
        apresenta.apresentaConsumoCarro(media);
        
        //Classificação carro classe externa
        rank.classificacao(media);
        
        
        //Apresentar os dados ao usuário -
        //Método para apresentar resultados
        //criado em uma classe separada do programa principal
        
        //Desafio !
        //Implemente um método externo para classificação da média de
        //consumo do carro,conforme a estrutura condinonal abaixo
        
        //System.out.println("Consumo médio do veículo é: " + media + "km/l");
        //if (media >= 15) {
        //    System.out.println("Carro econômico");
        //} else if (media >= 8 && media < 15) {
        //    System.out.println("Carro razoável");
        //} else {
        //    System.out.println("Consumo não econômico");
        //}

    }

    
    
    
    
    
    
    
    
    //Função que está dentro da classe do programa principal
    private static double calculaMediaConsumo(double distancia, double consumo){
        double mediaConsumo = 0.0;
        mediaConsumo = distancia / consumo;
        return mediaConsumo;
    }

}
