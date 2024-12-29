/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

/**
 *
 * @author Gustavo
 */
public class CarroFlyweight {
    private final String marca;
    private final String modelo;
    private final String motor;

    public CarroFlyweight(String marca, String modelo, String motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void exibirDetalhes(String cor) {
        System.out.println("Carro: " + marca + " " + modelo + " de cor " + cor + " com motor " + motor);
    }
}