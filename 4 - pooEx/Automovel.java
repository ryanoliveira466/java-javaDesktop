package Aula07;

public class Automovel {

    //Definição dos atributos
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double potencia;
    private boolean estacionamento;
    private double qdtoCombustivel;
    private double kmOdometro;

    //Métodos
    //Método construtor
    public Automovel() {
    }

    public Automovel(String marca, String modelo, int ano, String cor, double potencia, boolean estacionamento, double qdtoCombustivel, double kmOdometro) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.potencia = potencia;
        this.estacionamento = estacionamento;
        this.qdtoCombustivel = qdtoCombustivel;
        this.kmOdometro = kmOdometro;
    }

    //Estado
    //Métodos Getters e Setters - Acessores e Modificadores
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public boolean getEstacionamento() {
        return estacionamento;
    }

    public void setEstacionamento(boolean estacionamento) {
        this.estacionamento = estacionamento;
    }

    public double getQdtoCombustivel() {
        return qdtoCombustivel;
    }

    public void setQdtoCombustivel(double qdtoCombustivel) {
        this.qdtoCombustivel = qdtoCombustivel;
    }

    public double getKmOdometro() {
        return kmOdometro;
    }

    public void setKmOdometro(double kmOdometro) {
        this.kmOdometro = kmOdometro;
    }

    //Métodos de usuários
    //Estacionamento - Se o carro está estacionado
    //Litros do tanque - Retirada de combustível do tanque
    //Altera odômetro - Modificação do KM do marcador
    public void estacionar() {
        if (this.getEstacionamento() == true) {
            this.setEstacionamento(false);
        } else {
            this.setEstacionamento(true);
        }
    }

    public void consumirCombustivel(double litros) {
        this.setQdtoCombustivel(this.getQdtoCombustivel() - litros);
    }

    public void abastecerCombustivel(double litros) {
        this.setQdtoCombustivel(this.getQdtoCombustivel() + litros);
    }

    public void aumentarKmOdometro(double qtdeKm) {
        this.setKmOdometro(this.getKmOdometro() + qtdeKm);
    }

    public void estadoAtualCarro() {
        System.out.println(" Carro: " + this.getModelo()
                + "\n Marca: " + this.getMarca()
                + "\n Quilometragem: " + this.getKmOdometro()
                + "\n Qtde combustível: " + this.getQdtoCombustivel()
                + "\n Estacionando: " + this.getEstacionamento());
    }

}
