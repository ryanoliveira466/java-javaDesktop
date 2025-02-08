
package Aula07.Desafio;

public class Main
{
	public static void main(String[] args) {
      
      RadioBolso radio = new RadioBolso(true, true, 40, 86, "FM");
      
      //radio.play();
      //radio.pause();
     radio.dialDiminui(86);
      //radio.dialAumenta(89);
      //radio.volumeDiminui();
      //radio.volumeAumenta();
      radio.trocarFaixaSintonia();
      radio.estado();
       
       
      
    
      
	}
}
