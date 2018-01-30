
package br.com.auladb.business;

import br.com.auladb.dao.DCliente;
import br.com.auladb.entidades.Cliente;


public class BCliente {
    public boolean cadastrar(Cliente cli){
        return new DCliente().cadastrar(cli);
    }
    public boolean consultar(Cliente cli){
        return new DCliente().consultar(cli);
    }
    public boolean excluir(Cliente cli){
        return new DCliente().excluir(cli);
    }
}
