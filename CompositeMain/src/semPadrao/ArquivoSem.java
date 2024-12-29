/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semPadrao;

/**
 *
 * @author Gustavo
 */
public class ArquivoSem {

    private String nome;

    public ArquivoSem(String nome) {
        this.nome = nome;
    }

    public void mostrarDetalhes() {
        System.out.println("Arquivo: " + nome);
    }
}
