
package br.com.auladb.entidades;


public class Produto {
    private String descricao;
    private int id;
    private int quantidade;
    private double valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
   public Produto(String descricao, int id, int quantidade, double valor){
       this.descricao = descricao;
       this.id = id;
       this.quantidade = quantidade;
       this.valor = valor;
       
   }
}
