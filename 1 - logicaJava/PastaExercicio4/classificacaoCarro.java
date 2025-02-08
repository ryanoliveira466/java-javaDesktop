
package Aula05;


public class classificacaoCarro {
    
    public void classificacao(double media){
        if (media >= 15) {
            System.out.println("Carro econômico!");
        } else if (media >= 8 && media < 15) {
            System.out.println("Carro razoável!");
        } else {
            System.out.println("Consumo não econômico!");
        }
    }
    
}
