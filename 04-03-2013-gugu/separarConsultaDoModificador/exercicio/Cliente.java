/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package separarconsultadomodificador.exercicio;

import separarconsultadomodificador.exemplo.Pedido;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Gustavo
 */
public class Cliente {
    
    private Date ultimaCompra;
    private Pedido ultimoPedido;
    
    /* Temos no sistema uma feature, executada regularmente
     * que envia por e-mail uma sugestão de compra baseada 
     * nas compras anteriores e interesses do cliente.
     * Há alguns critérios para sugestão ser enviada:
     * - Cliente há mais de 10 dias sem efetuar nenhuma compra.
     * - Produtos que podem complementar o último pedido efetuado
     * - Cliente que se cadastrou, navegou mas não comprou nada.
     */
    
    public String tentaEnviaEmail() {
        try {
            return enviarEmail();
        } catch (Exception e) {
            return "Erro ao enviar email: " + e.getMessage();
        }
    }
    
    private String enviarEmail() throws Exception {
        if(clienteElegivelParaEmail()) {
            enviaEmailSugestao();
            return "Email Enviado";
        } else
            return "Email não enviado, cliente não elegível";
    }
    
    public void enviaEmailSugestao() throws Exception{
        //...
    }
    
    public Boolean temComplementoNoPedido(Pedido pedido) {
        return Boolean.TRUE;
    }
    
    //...

    private boolean aindaNaoComprou() {
        return ultimaCompra == null;
    }

    private boolean dezDiasSemComprar() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, -10);
        return cal.after(ultimaCompra);
    }

    private boolean clienteElegivelParaEmail() {
        return dezDiasSemComprar() || temComplementoNoPedido(ultimoPedido) || aindaNaoComprou();
    }

}
