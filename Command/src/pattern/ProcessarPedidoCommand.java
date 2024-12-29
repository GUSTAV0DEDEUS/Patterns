/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattern;

/**
 *
 * @author Gustavo
 */
public class ProcessarPedidoCommand implements Command {
    private Pedido pedido;

    public ProcessarPedidoCommand(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void execute() {
        pedido.processar();
    }
}