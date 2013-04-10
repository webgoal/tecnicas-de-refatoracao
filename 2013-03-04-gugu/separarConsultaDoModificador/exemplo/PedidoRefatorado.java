/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package separarconsultadomodificador.exemplo;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class PedidoRefatorado {
    private ArrayList<Item> itens = new ArrayList<>();
    
    //...
    
    /* if(podeAdicionarItem(item)) {
     *      insereItem(item);
     * } else {
     *      alerta, etc...
     * }
     */
    
    public void insereItem(Item item) {
        itens.add(item);
    }
    
    public Boolean podeAdicionarItem(Item item) {
        return item.temEstoque();
    }
    
    //...
}
