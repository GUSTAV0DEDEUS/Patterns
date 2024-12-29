/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattern;

/**
 *
 * @author Gustavo
 */
public class Pedido {
    private String nomeCliente;

    public Pedido(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void processar() {
        System.out.println("Processando pedido para o cliente: " + nomeCliente);
    }

    public void cancelar() {
        System.out.println("Cancelando pedido para o cliente: " + nomeCliente);
    }
}
