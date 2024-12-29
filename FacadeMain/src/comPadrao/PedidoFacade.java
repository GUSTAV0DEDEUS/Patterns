/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

import semPadrao.EstoqueSem;
import semPadrao.PagamentoSem;
import semPadrao.PedidoSem;

/**
 *
 * @author Gustavo
 */
public class PedidoFacade {
    private final PedidoSem pedido;
    private final EstoqueSem estoque;
    private final PagamentoSem pagamento;

    public PedidoFacade() {
        this.pedido = new PedidoSem();
        this.estoque = new EstoqueSem();
        this.pagamento = new PagamentoSem();
    }

    public void realizarPedido() {
        pedido.criarPedido();
        estoque.verificarDisponibilidade();
        estoque.reservarItem();
        pagamento.processarPagamento();
        System.out.println("Pedido realizado com sucesso!");
    }
}
