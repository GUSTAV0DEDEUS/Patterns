/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package handlers;

/**
 *
 * @author Gustavo
 */
public class CozinheiroSalada extends Cozinheiro {
    @Override
    protected boolean possoPreparar(String prato) {
        return prato.equalsIgnoreCase("Salada");
    }
}