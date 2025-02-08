
package Aula09.Cadastro;

public class Veiculo {
    
    //Define os atributos
    private String marca;
    private String modelo;
    private String combustivel;
    private String ano;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, String combustivel, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustivel = combustivel;
        this.ano = ano;
    }
  
    
     //Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    
    
    
}
