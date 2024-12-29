/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handlers;

/**
 *
 * @author Gustavo
 */
public abstract class Cozinheiro {
    protected Cozinheiro proximoCozinheiro;

    public void setProximoCozinheiro(Cozinheiro proximoCozinheiro) {
        this.proximoCozinheiro = proximoCozinheiro;
    }

    public void prepararPrato(String prato) {
        if (possoPreparar(prato)) {
            System.out.println(getClass().getSimpleName() + " está preparando o prato: " + prato);
        } else if (proximoCozinheiro != null) {
            proximoCozinheiro.prepararPrato(prato);
        } else {
            System.out.println("Nenhum cozinheiro disponível para preparar o prato: " + prato);
        }
    }

    protected abstract boolean possoPreparar(String prato);
}
