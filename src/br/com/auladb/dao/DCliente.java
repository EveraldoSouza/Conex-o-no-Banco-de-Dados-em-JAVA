
package br.com.auladb.dao;

import br.com.auladb.entidades.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;




public class DCliente extends Dao{
    public boolean cadastrar(Cliente cli){
        String comando = "INSERT INTO cliente(Nome, Endereço, Email) VALUES (?,?,?)";
        try{
            this.Conectar();
            this.stnt = this.conn.prepareStatement(comando);
            this.stnt.setString(1, cli.getNome());
            this.stnt.setString(2, cli.getEndereço());
            this.stnt.setString(3, cli.getEmail());
            this.stnt.execute();
            return true;
            
        } catch (SQLException ex) {
            System.out.println("Erro na funcao cadastrar(Cliente) " + ex.getMessage());
        }
        return false;
    }
    
    public boolean consultar(Cliente cli){
        String comando = "SELECT * FROM cliente WHERE ID = ?";
        try{
            this.Conectar();
            this.stnt = this.conn.prepareStatement(comando);
            this.stnt.setString(1, String.valueOf(cli.getId()));
            ResultSet rs = this.stnt.executeQuery();
            if(rs.next()){
                cli.setNome(rs.getString("Nome"));
                cli.setEndereço(rs.getString("Endereço"));
                cli.setEmail(rs.getString("Email"));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "ID NAO ENCONTRADO");
            }
            
        } catch(SQLException ex){
            System.out.println("Erro na funcao consultar (cliente) "+ ex.getMessage());
        }
        return false;
    }
    
    public boolean excluir(Cliente cli){
        String comando = "DELETE FROM CLIENTE WHERE ID = ?";
        try{
            this.Conectar();
            
            this.stnt = this.conn.prepareStatement(comando);
            this.stnt.setString(1,String.valueOf(cli.getId()));
            this.stnt.execute();
            
            return true;
            
        }catch(SQLException ex){
           System.out.println("Erro na funcao excluir (cliente) "+ ex.getMessage());
        }
        return false;
    }
    
}
