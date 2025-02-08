
package Aula10_Desafio;

import java.io.FileNotFoundException;


public class Principal {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        CadastroVeiculo oper = new CadastroVeiculo();
        oper.carregaTodosDadosArquivoCSV();
        
        oper.listarTodosItens();
      
        
    }
    
}
