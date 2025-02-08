
package Aula07;


public class Principal {
    
    public static void main(String[] args) {
        
        
        
        
        Automovel carro = new Automovel();
        carro.setMarca("VolksWagen");
        carro.setModelo("Gol");
        carro.setAno(2024);
        carro.setCor("Branco");
        carro.setEstacionamento(true);
        carro.setKmOdometro(25000.0);
        carro.setPotencia(1.6);
        carro.setQdtoCombustivel(45);
        carro.estadoAtualCarro();
        
        
        carro.consumirCombustivel(10);
        carro.aumentarKmOdometro(222.5);
        
        carro.estadoAtualCarro();
        
        Automovel carro2 = new Automovel("GM", "Onix", 2024, "Vermelho", 1.0, true, 45, 10);
        carro2.estadoAtualCarro();
        
        Automovel carro3 = new Automovel("GM", "Onix", 2024, "Vermelho", 1.0, true, 45, 10);
        carro2.estadoAtualCarro();
        
        System.out.println(carro);
        System.out.println(carro2);
        System.out.println(carro3);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //Programa de execução
        //Instanciar um objeto - classe Automovel
        //Automovel carro = new Automovel("Toyota", "Corolla", 2024, "Branca", 2.0);
        //Automovel carro2 = new Automovel("Ford", "Corcel", 1999, "Prata", 1.6);
        //Sem private
        //System.out.println(carro.marca);
        //System.out.println(carro.modelo);
        
        //System.out.println(carro2.marca + " " + carro2.modelo);
        
        
        
        //carro2.setModelo("Corcel 2 Belina");
        
        //System.out.println(carro2.getModelo());
        
    }
    
}
