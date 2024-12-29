/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noPattern;
import java.util.ArrayList;
import java.util.List;
import pattern.Pedido;

/**
 *
 * @author Gustavo
 */
public class ControleDePedidosSemPadrao {

    private List<Pedido> pedidos = new ArrayList<>();

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void processarTodosPedidos() {
        for (Pedido pedido : pedidos) {
            pedido.processar();
        }
    }

    public void cancelarTodosPedidos() {
        for (Pedido pedido : pedidos) {
            pedido.cancelar();
        }
    }
}

