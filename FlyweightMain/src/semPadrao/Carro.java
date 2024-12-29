/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semPadrao;

/**
 *
 * @author Gustavo
 */
public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private String motor;

    public Carro(String marca, String modelo, String cor, String motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
    }

    public void exibirDetalhes() {
        System.out.println("Carro: " + marca + " " + modelo + " de cor " + cor + " com motor " + motor);
    }
}
