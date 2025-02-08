package Aula10_Desafio;

public class Veiculo {

    //Atributos
    private String marca;
    private String modelo;
    private String ano;
    private String combustivel;

    //Contrutores
    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, String ano, String combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.combustivel = combustivel;
    }

    //Getters e Setter
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

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", combustivel=" + combustivel + '}';
    }

    
    
}
