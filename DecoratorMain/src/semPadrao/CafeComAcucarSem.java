/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semPadrao;

import comPadrao.CafeSimples;

/**
 *
 * @author Gustavo
 */
public class CafeComAcucarSem extends CafeSimples {
    @Override
    public String preparar() {
        return super.preparar() + " com Açúcar";
    }

    @Override
    public double preco() {
        return super.preco() + 0.5;
    }
}
