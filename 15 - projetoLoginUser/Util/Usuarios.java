 
package Aula18_Desafio.Util;


public class Usuarios {
    //Atributos
    private String nome;
    private String username;
    private String password;
    
    
    //Métodos Construtores

    public Usuarios() {
    }

    public Usuarios(String nome, String username, String password) {
        this.nome = nome;
        this.username = username;
        this.password = password;
    }
    
    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
    
}
