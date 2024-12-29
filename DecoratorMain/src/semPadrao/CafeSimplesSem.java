/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semPadrao;

import comPadrao.Cafe;

/**
 *
 * @author Gustavo
 */
public class CafeSimplesSem implements Cafe {
    @Override
    public String preparar() {
        return "Café Simples";
    }

    @Override
    public double preco() {
        return 5.0;
    }
}