/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula18_Desafio.Util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class PersistenciaDadosUsuario {
    
    String caminho = "C:\\Users\\Aluno\\Documents\\UC8 - Ryan\\ProgramasUC8\\dadosUsuarios.txt";
    ArrayList<Usuarios> cargaDadosCSV = new ArrayList<>();
    
     public void criarArquivoDados() {
        //Classe File, efetua a criação de arquivos externos
        File arquivo = new File(caminho);

        try {
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado com sucesso!");

            } else {
                System.out.println("Arquivo já existente");
            }

        } catch (Exception e) {
            System.out.println("ERRO AO CRIAR AQUIVO!");
            System.out.println("REVISE O MÉTODO CRIAR ARQUIVO DE DADOS");

        } finally {
        }

    }
     
     //Método de gravação de dados dentro do arquivo CSV
    public void gravarDadosArquivoCSV(ArrayList<Usuarios> listaItens) {

        try {
            FileWriter escitor = new FileWriter(caminho);

            for (int i = 0; i < listaItens.size(); i++) {
                escitor.write(
                        listaItens.get(i).getNome() + ","
                        + listaItens.get(i).getUsername() + ","
                        + listaItens.get(i).getPassword()+ "\n");
            }

            escitor.close();
            System.out.println("Dados inseridos no arquivo com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao escreber dados no arquivo txt");
            System.out.println("Revise o método gravarDadosArquivoCSV");
            e.printStackTrace();
        }

    }
    
    //Método de leitura dos dados do arquivo CSV
    public ArrayList<Usuarios> leituraDadosCSV() throws FileNotFoundException {

        File arquivo = new File(caminho);
        Scanner leitorArquivos = new Scanner(arquivo);

        try {
            while (leitorArquivos.hasNext()) {
                String linhaArquivo = leitorArquivos.nextLine();
                String vector[] = linhaArquivo.split(",");
                String nome = vector[0];
                String username = vector[1];
                String password = vector[2];
                Usuarios novoItem = new Usuarios(nome, username, password);
                cargaDadosCSV.add(novoItem);
            }
            leitorArquivos.close();
            System.out.println("Informações lidas com sucesso!");
            System.out.println("Carga de dados realizada no ArrayList");

        } catch (Exception e) {
            System.out.println("Erro ao realizar a leitura do aqruivo!");
            System.out.println("Revisar o método leituraDadosCSV ");

        }

        return cargaDadosCSV;

    }
     
}
