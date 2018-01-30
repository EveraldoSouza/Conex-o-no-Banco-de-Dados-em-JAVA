package br.com.auladb.business;


 import br.com.auladb.dao.DUsuario;
 import br.com.auladb.entidades.Usuario;


    public class BUsuario {

        public boolean logar(Usuario usu){
            return new DUsuario().logar(usu);
        }
        
        public boolean cadastrar(Usuario usu){
            return new DUsuario().cadastrar(usu);
        }
        
        public boolean consultar(Usuario usu){
            return new DUsuario().consultar(usu);
        }
        
        public boolean excluir(Usuario usu){
            return new DUsuario().excluir(usu);
        }
       
    }
