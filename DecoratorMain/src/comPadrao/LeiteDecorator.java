/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

/**
 *
 * @author Gustavo
 */
public class LeiteDecorator extends CafeDecorator {
    public LeiteDecorator(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String preparar() {
        return super.preparar() + " com Leite";
    }

    @Override
    public double preco() {
        return super.preco() + 1.0;
    }
}

