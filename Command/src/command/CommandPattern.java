/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package command;

import noPattern.ControleDePedidosSemPadrao;
import pattern.CancelarPedidoCommand;
import pattern.ControleDePedidos;
import pattern.Pedido;
import pattern.ProcessarPedidoCommand;
import pattern.Command;
/**
 *
 * @author Gustavo
 */
public class CommandPattern {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("Cliente A");
        Pedido pedido2 = new Pedido("Cliente B");
        Command processarPedido1 =  new ProcessarPedidoCommand(pedido1);
        Command cancelarPedido2 = new CancelarPedidoCommand(pedido2);

        ControleDePedidos controle = new ControleDePedidos();
        ControleDePedidosSemPadrao controleSemPadrao = new ControleDePedidosSemPadrao();
        
        // Adiciona os comandos na fila
        controle.adicionarComando(processarPedido1);
        controle.adicionarComando(cancelarPedido2);
        
        
        //Sem padrao
        controleSemPadrao.adicionarPedido(pedido1);        
        controleSemPadrao.adicionarPedido(pedido2);
        
        
        
        // Executa os comandos
        controle.executarComandos();
        
        // Sem padrao
        controleSemPadrao.processarTodosPedidos();
        controleSemPadrao.cancelarTodosPedidos();
        
    }

    
}
