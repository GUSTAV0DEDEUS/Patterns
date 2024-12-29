/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semPadrao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class PastaSem {

    private String nome;
    private List<ArquivoSem> arquivos = new ArrayList<>();

    public PastaSem(String nome) {
        this.nome = nome;
    }

    public void adicionarArquivo(ArquivoSem arquivo) {
        arquivos.add(arquivo);
    }

    public void mostrarDetalhes() {
        System.out.println("Pasta: " + nome);
        for (ArquivoSem arquivo : arquivos) {
            arquivo.mostrarDetalhes();
        }
    }

  
}