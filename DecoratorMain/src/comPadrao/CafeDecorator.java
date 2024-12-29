/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

/**
 *
 * @author Gustavo
 */
public abstract class CafeDecorator implements Cafe {
    protected Cafe cafeDecorado;

    public CafeDecorator(Cafe cafe) {
        this.cafeDecorado = cafe;
    }

    @Override
    public String preparar() {
        return cafeDecorado.preparar();
    }

    @Override
    public double preco() {
        return cafeDecorado.preco();
    }
}
