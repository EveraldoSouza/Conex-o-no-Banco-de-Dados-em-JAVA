
package br.com.auladb.entidades;

public class Cliente {
    private String nome;
    private int id;
    private String Endereço;
    private String Email;

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public String getEndereço() {
        return Endereço;
    }

    public String getEmail() {
        return Email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public Cliente(String nome, int id, String endereço, String Email){
        this.nome = nome;
        this.id = id;
        this.Endereço = endereço;
        this.Email = Email;
        
    }
}
