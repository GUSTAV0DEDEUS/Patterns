/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semPadrao;

/**
 *
 * @author Gustavo
 */
public class CozinheiroSalada implements Cozinheiro {
    @Override
    public void prepararPrato(String prato) {
        System.out.println("Cozinheiro de Salada está preparando: " + prato);
    }
}