/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsibility;

import semPadrao.Cozinheiro;
import semPadrao.CozinheiroMassa;
import semPadrao.CozinheiroPizza;
import semPadrao.CozinheiroSalada;

/**
 *
 * @author Gustavo
 */
public class RestauranteSemPadrao {
    
    private Cozinheiro cozinheiroPizza;
    private Cozinheiro cozinheiroMassa;
    private Cozinheiro cozinheiroSalada;

    public RestauranteSemPadrao() {
        // Inicializando os cozinheiros
        cozinheiroPizza = new CozinheiroPizza();
        cozinheiroMassa = new CozinheiroMassa();
        cozinheiroSalada = new CozinheiroSalada();
    }

    public void fazerPedido(String prato) {
        if (prato.equalsIgnoreCase("Pizza")) {
            cozinheiroPizza.prepararPrato(prato);
        } else if (prato.equalsIgnoreCase("Massa")) {
            cozinheiroMassa.prepararPrato(prato);
        } else if (prato.equalsIgnoreCase("Salada")) {
            cozinheiroSalada.prepararPrato(prato);
        } else {
            System.out.println("Nenhum cozinheiro disponível para preparar o prato: " + prato);
        }
    }
}

