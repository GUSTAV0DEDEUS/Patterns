/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facademain;

import comPadrao.PedidoFacade;
import semPadrao.EstoqueSem;
import semPadrao.PagamentoSem;
import semPadrao.PedidoSem;

/**
 *
 * @author Gustavo
 */
public class FacadeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sem padrao
        PedidoSem pedido = new PedidoSem();
        EstoqueSem estoque = new EstoqueSem();
        PagamentoSem pagamento = new PagamentoSem();
        pedido.criarPedido();
        estoque.verificarDisponibilidade();
        estoque.reservarItem();
        pagamento.processarPagamento();
        
        // Com Padrao
        PedidoFacade pedidoFacade = new PedidoFacade();
        pedidoFacade.realizarPedido();
    }

}
