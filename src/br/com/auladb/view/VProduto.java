
package br.com.auladb.view;

import br.com.auladb.business.BProduto;
import br.com.auladb.entidades.Produto;

public class VProduto {
    
    public boolean cadastrar(Produto prod){
        return new BProduto().cadastrar(prod);
    }
     public boolean consultar(Produto prod){
        return new BProduto().consultar(prod);
    }
    public boolean excluir(Produto prod){
        return new BProduto().excluir(prod);
    }
}
