
package Aula15_Desafio;


public class CalculadoraFinanciamento {
    
    public double calculoFinanciamento(double numMeses, double taxaJurosMensal, double valorPrestacao){
        
        String valorFinanciadoString;
        double valorFinanciadoNumber;
        double valorFinanciado;
        
        valorFinanciado = (1 - Math.pow(1 + (taxaJurosMensal/100), -numMeses)) / (taxaJurosMensal/100) * valorPrestacao;
        
        valorFinanciadoString = String.format("%.2f", valorFinanciado);
        valorFinanciadoString = valorFinanciadoString.replace(",", ".");
        valorFinanciadoNumber = Double.parseDouble(valorFinanciadoString);
        valorFinanciado = valorFinanciadoNumber;
        return valorFinanciado;
        
    }
    
}
