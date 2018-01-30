
package br.com.auladb.view;

import br.com.auladb.business.BCliente;
import br.com.auladb.entidades.Cliente;

public class VCliente {
    public boolean cadastrar(Cliente cli){
        return new BCliente().cadastrar(cli);
    }
    public boolean consultar(Cliente cli){
        return new BCliente().consultar(cli);
    }
    public boolean excluir(Cliente cli){
        return new BCliente().excluir(cli);
    }
}
