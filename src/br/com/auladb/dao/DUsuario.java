
package br.com.auladb.dao;

import br.com.auladb.entidades.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DUsuario extends Dao{
    
    
    
    public boolean logar(Usuario usu){
        String comando = "select * from usuario where login=? and senha=?";
        try{
           this.Conectar(); //chamando conectar
           
           this.stnt = this.conn.prepareStatement(comando);
           
           this.stnt.setString(1,usu.getLogin());
           this.stnt.setString(2,usu.getSenha());
           
           ResultSet rs = this.stnt.executeQuery();
          
           if(rs.next()){
               return true;
           } else {
               JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos");
           }
        }catch(SQLException ex){
            System.out.println("Problemas na função logar"+ ex.getMessage());
        }
        return false;
    }
      
    public boolean cadastrar(Usuario usu){
        String comando = "INSERT INTO usuario(nome, cpf, login, senha) values( ?, ?, ?, ?)";
       
        try{
           this.Conectar();
           this.stnt = this.conn.prepareStatement(comando);
           this.stnt.setString(1,usu.getNome());
           this.stnt.setString(2,usu.getCPF());
           this.stnt.setString(3,usu.getLogin());
           this.stnt.setString(4,usu.getSenha());
           this.stnt.execute();
           
           return true;
           
        }catch(SQLException ex){
            System.out.println("Problemas na função cadastrar " + ex.getMessage());
        }
        return false;
    }
    
    public boolean consultar(Usuario usu){
        String comando = "select * from usuario where id = ?";
        
        try{
            this.Conectar();
            this.stnt = this.conn.prepareStatement(comando);
            this.stnt.setString(1,String.valueOf(usu.getId()));
            ResultSet rs = this.stnt.executeQuery();
            if(rs.next()){
                usu.setLogin(rs.getString("login"));
                usu.setSenha(rs.getString("senha"));
                usu.setCPF(rs.getString("CPF"));
                usu.setNome(rs.getString("nome"));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "ID NÃO ENCONTRADO");
            }
        } catch(SQLException ex){
            System.out.println("Problemas na função (cadastrar) "+ ex.getMessage());
        }
        return false;
    }
    
    public boolean excluir(Usuario usu){
        String comando = "DELETE FROM USUARIO WHERE ID = ?";
        try{
            this.Conectar();
            
            this.stnt = this.conn.prepareStatement(comando);
            this.stnt.setString(1,String.valueOf(usu.getId())); 
            this.stnt.execute();
            
            return true;
            
        } catch(SQLException ex){
            System.out.println("Problemas na função (excluir) "+ ex.getMessage());
        }
        return false;
    }
    
    
}
