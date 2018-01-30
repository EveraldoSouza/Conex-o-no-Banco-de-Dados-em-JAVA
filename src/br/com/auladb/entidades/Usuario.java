
package br.com.auladb.entidades;

/* POJO */

// ATRIBUTOS PRIVADOS
// GET AND SET
// CONSTRUTOR PADRÃO




public class Usuario {
    private int id;
    private String nome;
    private String CPF;
    private String login;
    private String senha;

    public String getCPF() {
        return CPF;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Usuario(int id, String nome, String cpf, String login, String senha){
        this.id = id;
        this.nome = nome;
        this.CPF = cpf;
        this.login = login;
        this.senha = senha;
    }

   
    
}
