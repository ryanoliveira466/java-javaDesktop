
package Aula09.Cadastro;

import java.io.FileNotFoundException;


public class Principal {
    
    public static void main(String[] args) throws FileNotFoundException {
        
//        Veiculo c1 = new Veiculo("Fiat", "Idea", "Gasolina", "2015");
//        Veiculo c2 = new Veiculo("Toyota", "Corolla", "Gasolina", "2020");
//        Veiculo c3 = new Veiculo("Ford", "Focus", "Gasolina", "2009");
//        Veiculo c4 = new Veiculo("GM", "Onix", "Alcool/Gasolina", "2017");
//        Veiculo c5 = new Veiculo("Mazda", "RX-8", "Alcool/Gasolina", "2005");
//        
//        //Popular o arrayList
//        BancoInfo op = new BancoInfo();
//        op.inserirItemArray(c1);
//        op.inserirItemArray(c2);
//        op.inserirItemArray(c3);
//        op.inserirItemArray(c4);
//        op.inserirItemArray(c5);
////        
////        
////        
////        op.removeItemArray(1);
////        
////        op.listarItensArray();
////        
////        op.apagarItensArray();
////        
//        op.listarItensArray();
////        
//
//PersistenciaDadosCSV oper = new PersistenciaDadosCSV();
////Já executado //oper.criarArquivoDados();
//        
//op.enviarDadosGravacaoCSV();



BancoInfo oper = new BancoInfo();
oper.carregaTodosDadosArquivoCSV();

oper.listarItensArray();
        
        
    }
    
}
