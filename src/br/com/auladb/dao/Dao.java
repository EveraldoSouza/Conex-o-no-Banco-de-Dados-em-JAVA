package br.com.auladb.dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

// CONECTOR


public class Dao {
    private String servidor;
    private String Banco;
    private String Usuario;
    private String Senha;
    protected PreparedStatement stnt;
    protected Connection conn;
    
    
    public Dao(){
        this.servidor = "localhost:3306";
        this.Banco = "BancoAula";
        this.Usuario = "root";
        this.Senha = "";
    }
    
    public void Conectar(){
        String url = "jdbc:mysql://" + servidor + "/" + Banco;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            try {
                conn = (Connection)DriverManager.getConnection(url,Usuario,Senha);
            } catch (SQLException ex) {
                Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Verifique importação de biblioteca. Erro:" + ex.getMessage());
        }
        
    }
}
