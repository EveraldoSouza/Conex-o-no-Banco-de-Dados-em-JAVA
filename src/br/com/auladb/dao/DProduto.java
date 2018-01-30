
package br.com.auladb.dao;

import br.com.auladb.entidades.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DProduto extends Dao{
    
    public boolean cadastrar(Produto prod){
        String comando = "INSERT INTO PRODUTO (DESCRICAO, QUANTIDADE, VALOR) VALUES (?,?,?)";
        try{
        this.Conectar();
        this.stnt = this.conn.prepareStatement(comando);
        this.stnt.setString(1, prod.getDescricao());
        this.stnt.setString(2, String.valueOf(prod.getQuantidade()));
        this.stnt.setString(3, String.valueOf(prod.getValor()));
        this.stnt.execute();
        
        return true;
        
        }catch(SQLException ex){
            System.out.println("ERRO NA FUNÇÃO CADASTRAR (PRODUTO) "+ ex.getMessage());
        }
        return false;
    }
    
    public boolean consultar(Produto prod){
        String comando = "SELECT * FROM PRODUTO WHERE ID = ?";
        try{
            this.Conectar();
            this.stnt = this.conn.prepareStatement(comando);
            this.stnt.setString(1, String.valueOf(prod.getId()));
            ResultSet rs = this.stnt.executeQuery();
            if(rs.next()){
                prod.setDescricao(rs.getString("descricao"));
                prod.setQuantidade(Integer.valueOf(rs.getString("quantidade")));
                prod.setValor(Double.valueOf(rs.getString("valor")));
                
                return true;
            } else{
                JOptionPane.showMessageDialog(null, "ID DO PRODUTO NÃO ENCONTRADO.");
            }
        }catch(SQLException ex){
            System.out.println("Erro na funçao consultar (produto) "+ ex.getMessage());
        }
        return false;
    }
    
    public boolean excluir(Produto prod){
        String comando = "DELETE FROM PRODUTO WHERE ID = ?";
        
        try{
            this.Conectar();
            
            this.stnt = this.conn.prepareStatement(comando);
            this.stnt.setString(1, String.valueOf(prod.getId()));
            this.stnt.execute();
            
            return true;
            
        }catch(SQLException ex){
            System.out.println("Problemas na função excluir (produto)"+ ex.getMessage());
        }
        return false;
    }
}
