
package br.com.auladb.business;

import br.com.auladb.dao.DProduto;
import br.com.auladb.entidades.Produto;


public class BProduto {
    
    public boolean cadastrar(Produto prod){
        return new DProduto().cadastrar(prod);
    }
    
    public boolean consultar(Produto prod){
        return new DProduto().consultar(prod);
    }
    public boolean excluir(Produto prod){
        return new DProduto().excluir(prod);
    }
}
