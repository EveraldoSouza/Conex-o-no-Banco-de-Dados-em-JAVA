
package br.com.auladb.view;

import br.com.auladb.business.BUsuario;
import br.com.auladb.entidades.Usuario;


    public class VUsuario {

        public boolean logar(Usuario usu){

            return new BUsuario().logar(usu);
        }
        
        public boolean cadastrar(Usuario usu){
            
            return new BUsuario().cadastrar(usu);
            
        }
        
        public boolean consultar(Usuario usu){
            return new BUsuario().consultar(usu);
            
        }
        
        public boolean excluir(Usuario usu){
            return new BUsuario().excluir(usu);
        }
     
       

    }
