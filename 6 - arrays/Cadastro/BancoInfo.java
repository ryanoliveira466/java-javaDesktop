
package Aula09.Cadastro;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class BancoInfo {
    
    
    ArrayList<Veiculo> itensBanco = new ArrayList<>();
    
    //Adicionar itens na ArrayList
    public void inserirItemArray(Veiculo novoItem){
        itensBanco.add(novoItem);
        System.out.println("Item inserido com sucesso!");
    }
    
    //Remove itens da ArrayList
    
    public void removeItemArray(int index){
        itensBanco.remove(index);
        System.out.println("Item removido com sucesso!");
    }
    
    //Apagar todos os itens da ArrayList
    
    public void apagarItensArray(){
        itensBanco.clear();
        System.out.println("Lista apagada com sucesso!");
    }
    
    //Listar os itens contidos na Array para apresentação
    
    public void listarItensArray(){
        for(int i = 0;i <= itensBanco.size() -1; i++){
            System.out.println("Marca: " + itensBanco.get(i).getMarca());
            System.out.println("Modelo: " + itensBanco.get(i).getModelo());
            System.out.println("Combustível: " + itensBanco.get(i).getCombustivel());
            System.out.println("Ano: " + itensBanco.get(i).getAno());
        }
    }
    
    
    //Gravar elas da Array em arquivo TXT
    //ENVIAR OS DADOS DO BANCO DE ITENS PARA GRAVAÇÃO NO ARQUIVO TXT
    public void enviarDadosGravacaoCSV(){
        PersistenciaDadosCSV gravarItens = new PersistenciaDadosCSV();
        gravarItens.gravarDadosArquivoCSV(itensBanco);
    }
    
    //CAPTURAR OS DADOS DO ARQUIVO CSV PARA POPULAR A ARRAYLIST NA MEMÓRIA DO PROGRAMA
    public void carregaTodosDadosArquivoCSV() throws FileNotFoundException{
        itensBanco.clear();
        PersistenciaDadosCSV oper = new PersistenciaDadosCSV();
        itensBanco = oper.leituraDadosCSV();
    }
    
}
