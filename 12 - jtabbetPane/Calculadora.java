
package Aula15_Desafio;


public class Calculadora {
    
    public double calcAplicDepositosReg(double numMeses, double taxaJurosMensal, double valorDepRegular){
        
        String valorObtidoFinalString;
        double valorObtidoFinalNumber;
        double valorObtidoFinal;
        
        valorObtidoFinal = (1 + (taxaJurosMensal/100)) * (((Math.pow((1 +(taxaJurosMensal/100)), numMeses)) - 1) / (taxaJurosMensal/100)) * valorDepRegular;
        valorObtidoFinalString = String.format("%.2f", valorObtidoFinal);
        valorObtidoFinalString = valorObtidoFinalString.replace(",", ".");
        valorObtidoFinalNumber = Double.parseDouble(valorObtidoFinalString);
        valorObtidoFinal = valorObtidoFinalNumber;
        return valorObtidoFinal;
        
    }
    
}
