/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package separarconsultadomodificador.exemplo;

/**
 *
 * @author Gustavo
 */
public class Item {

    private double quantidade;
    private double preco;
    
    // ...
    
    public double calcularValor() {
        if(quantidade > 100) {
            return valorTotal() * 0.8;
        } 
        return valorTotal();
    }
    
    public Boolean temEstoque() {
        return Boolean.TRUE;
    }

    public Double valorTotal() {
        return quantidade * preco;
    }
    
    public double quantidade() {
        return this.quantidade;
    }
    
}
