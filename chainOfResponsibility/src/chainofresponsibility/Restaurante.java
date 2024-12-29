/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chainofresponsibility;

import handlers.Cozinheiro;
import handlers.CozinheiroMassa;
import handlers.CozinheiroPizza;
import handlers.CozinheiroSalada;

/**
 *
 * @author Gustavo
 */
public class Restaurante {
    private Cozinheiro primeiroCozinheiro;

    public Restaurante() {
        // Criando os cozinheiros
        Cozinheiro cozinheiroPizza = new CozinheiroPizza();
        Cozinheiro cozinheiroMassa = new CozinheiroMassa();
        Cozinheiro cozinheiroSalada = new CozinheiroSalada();

        // Definindo a cadeia de responsabilidade
        cozinheiroPizza.setProximoCozinheiro(cozinheiroMassa);
        cozinheiroMassa.setProximoCozinheiro(cozinheiroSalada);

        // O primeiro da cadeia será o cozinheiro de pizza
        this.primeiroCozinheiro = cozinheiroPizza;
    }

    public void fazerPedido(String prato) {
        primeiroCozinheiro.prepararPrato(prato);
    }
    
}
