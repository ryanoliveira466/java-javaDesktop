package Aula10_Desafio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PersistenciaDadosCSV {

    //Onde deverá ser criado o arquivo para gravação dos dados.
    String caminho = "C:\\Users\\Professor.SLEX25\\Documents\\UC8_Programas\\ProgramasUC8\\dados.txt";
    ArrayList<Veiculo> cargaDadosCSV = new ArrayList<>();

    //Método de criação de arquivos
    public void criarArquivoDados() {
        //Classe File, efetua a criação de arquivos externos
        File arquivo = new File(caminho);

        try {
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado com sucesso!");
            } else {
                System.out.println("Arquivo já existente!");
            }

        } catch (Exception e) {
            System.out.println("\n ERRO AO CRIAR ARQUIVO!");
            System.out.println("\n REVISE O MÈTODO CRIAR ARQUIVO DADOS!");
        }

    }

    //Método de gravação de dados dentro do arquivo CSV;
    public void gravarDadosArquivoCSV(ArrayList<Veiculo> listaItens) {

        try {
            FileWriter escritor = new FileWriter(caminho);

            for (int i = 0; i < listaItens.size(); i++) {
                escritor.write(
                        listaItens.get(i).getMarca() + ","
                        + listaItens.get(i).getModelo() + ","
                        + listaItens.get(i).getAno() + ","
                        + listaItens.get(i).getCombustivel() + "\n");
            }
            escritor.close();
            System.out.println("Dados inseridos no arquivo com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao escrever dados no arquivo txt");
            System.out.println("Revise o método de gravarDadosArquivoCSV");
            e.printStackTrace();
        }

    }

    //Método de leitura dos dados do arquivo CSV;
    public ArrayList<Veiculo> leituraDadosCSV() throws FileNotFoundException {

        File arquivo = new File(caminho);
        Scanner leitorArquivos = new Scanner(arquivo);

        try {
            while (leitorArquivos.hasNext()) {
                String linhaArquivo = leitorArquivos.nextLine();
                String vector[] = linhaArquivo.split(",");
                String marca = vector[0];
                String modelo = vector[1];
                String ano = vector[2];
                String combustivel = vector[3];
                Veiculo novoItem = new Veiculo(marca, modelo, ano, combustivel);
                cargaDadosCSV.add(novoItem);
            }
            leitorArquivos.close();
            System.out.println("Informações lidas com sucesso!");
            System.out.println("carga de dados realizada no arraylist!");

        } catch (Exception e) {
            System.out.println("Erro ao realizar a leitura do arquivo!");
            System.out.println("Verifique o método leituraDadosCSV");
            e.printStackTrace();

        }

        return cargaDadosCSV;

    }

}
