package Aula10_Desafio;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CadastroVeiculo {

    //Banco de dados em memoria de execução de programa!
    ArrayList<Veiculo> bancoItens = new ArrayList<>();

    //inserir novos itens
    public void inserirItensArray(Veiculo item) {
        bancoItens.add(item);
        System.out.println("Item inserido na array com sucesso!");
    }

    //remover itens / apagar itens indexados
    public void removerItemArray(int index) {
        bancoItens.remove(index);
        System.out.println("Item removido com sucesso!");
    }

    //apagar todos itens 
    public void apagarTodosItensArray() {
        bancoItens.clear();
        System.out.println("Todos itens removidos do array!");
    }

    //listar todos itens da array
    public void listarTodosItens() {
        for (int i = 0; i < bancoItens.size(); i++) {
            System.out.println("Marca: " + bancoItens.get(i).getMarca()
                    + " \nModelo: " + bancoItens.get(i).getModelo()
                    + " \nAno: " + bancoItens.get(i).getAno()
                    + " \nCombustivel: " + bancoItens.get(i).getCombustivel()
            );
        }
    }

    //ENVIAR OS DADOS DO BANCO DE ITENS PARA GRAVAÇÃO NO ARQUIVO TXT
    public void enviarDadosGravacaoCSV() {
        PersistenciaDadosCSV gravarItens = new PersistenciaDadosCSV();
        gravarItens.gravarDadosArquivoCSV(bancoItens);
    }

    //CAPTURAR OS DADOS DO ARQUIVO CSV PARA POPULAR A ARRAYLIST DA MEMORIA DO PROGRAMA
    public void carregaTodosDadosArquivoCSV() throws FileNotFoundException {
        bancoItens.clear();
        PersistenciaDadosCSV oper = new PersistenciaDadosCSV();
        bancoItens = oper.leituraDadosCSV();
    }

}
