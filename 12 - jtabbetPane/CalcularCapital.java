
package Aula15_Desafio;


public class CalcularCapital {
    
    public double calcularCapital(double numMeses, double taxaJurosMensal, double capitalAtual){
        
        
        String valorObtidoFinalString;
        double valorObtidoFinalNumber;
        double valorObtidoFinal;
      
        
        valorObtidoFinal = Math.pow((1 + taxaJurosMensal/100), numMeses) * capitalAtual;
        
        valorObtidoFinalString = String.format("%.2f", valorObtidoFinal);
        valorObtidoFinalString = valorObtidoFinalString.replace(",", ".");
        valorObtidoFinalNumber = Double.parseDouble(valorObtidoFinalString);
        valorObtidoFinal = valorObtidoFinalNumber;
        
        return valorObtidoFinal;
        
    }
    
}
