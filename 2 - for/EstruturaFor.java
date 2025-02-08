
package Aula06;

import java.util.Scanner;


public class EstruturaFor {
    
    //FOR: utilizado quando operação finita de repetições
    //WHILE: número infinito de reprições, até que a condição
    //deverificação gere um valor true
    
    public static void main(String[] args) {
        
        int i = 0;
        String opcao = "";
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Executar programa? S - Sim / N - Não");
        opcao = lerTeclado.next().toUpperCase();
        
        //equals.IgnoreCase
        while(opcao.equals("S")) {
            i++;
            System.out.println("Execução do programa n: " + i);
            //Condição de saída do looping while, deve estar
            //contida dentro do bloco de código!
            System.out.println("Executar programa? S - Sim / N - Não");
            opcao = lerTeclado.next().toUpperCase();       
        }
        
        
        
        //for(i=0; i<10; i++){
            //System.out.println("Repetição n: " + i);
            //if(i == 6){
           //     break; // Interrupção da estrutura de repetição
           // }
       // }
        
        //while(true){
            //System.out.println("Repetição: " + i);
            //i++;
            //Condição de saída do looping while, deve estar
            //contida dentro do bloco de código!
        //}
    
        
 
        
    }
    
}