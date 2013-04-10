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
public class Pedido {
    private ArrayList<Item> itens = new ArrayList<>();
    
    //...
    
    /* if(confereEstoqueEInsereItem(item).equals("Item sem estoque")) {
     *      trata aqui o erro.
     * } else ...
     * 
     * 
     */
    
    public String confereEstoqueEInsereItem(Item item) {
        if(item.temEstoque()) {
            itens.add(item);
            return "Item adicionado!";
        } return "Item sem estoque!";
    }
    
    //...
    
}
