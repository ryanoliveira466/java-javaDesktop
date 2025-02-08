
package Aula09;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;


public class RevArrays {
    
    public static void main(String[] args) {
        
        //Declaração da ArrayList
        String nome = null;
        ArrayList<String> nomeAluno = new ArrayList<>(); 
        Scanner lerTeclado = new Scanner(System.in);
        boolean processo = true;
        String opcao = null;
        
        while(processo == true){
            System.out.println("Digite o nome do aluno: ");
            nome = lerTeclado.next();
            //Armazenar o nome dentro da ArrayList
            nomeAluno.add(nome);
            System.out.println("Incluir novo nome> (S/N) ");
            opcao = lerTeclado.next().toLowerCase();
            
            if(!opcao.equalsIgnoreCase("s")){
                processo = false;
            }
            
            
            
        }
        
        
        //Organizar informações da ArrayList
        Collections.sort(nomeAluno);
        
        
        //Apresentar dados para o usuário
        System.out.println(nomeAluno);
        
        for(int i = 0; i <= nomeAluno.size() - 1; i++){
            System.out.println("Nome:" + "" + nomeAluno.get(i) + "" + "Index:" + "" + i);
        }
        
        
        
    }
    
}
