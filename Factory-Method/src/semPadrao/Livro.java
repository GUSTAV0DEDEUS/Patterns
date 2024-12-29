package semPadrao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public void exibirDetalhes() {
        System.out.println("Livro: " + titulo + " - Autor: " + autor + " - Páginas: " + numeroDePaginas);
    }

}
