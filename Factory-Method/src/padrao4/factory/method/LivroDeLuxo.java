/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padrao4.factory.method;

import semPadrao.Livro;

/**
 *
 * @author Aluno
 */
public class LivroDeLuxo extends Livro{
    
    private int numeroDeCapas;
    private String extras;

    public LivroDeLuxo(String titulo, String autor, int numeroDePaginas, int numeroDeCapas, String extras) {
        super(titulo, autor, numeroDePaginas);
        this.numeroDeCapas = numeroDeCapas;
        this.extras = extras;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de Capas: " + numeroDeCapas + " - Extras: " + extras);
    }
}

