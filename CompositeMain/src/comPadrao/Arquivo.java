/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

/**
 *
 * @author Gustavo
 */
public class Arquivo implements Componente {
    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Arquivo: " + nome);
    }
}
