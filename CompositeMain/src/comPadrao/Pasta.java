/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Pasta implements Componente {
    private String nome;
    private List<Componente> componentes = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionarComponente(Componente componente) {
        componentes.add(componente);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Pasta: " + nome);
        for (Componente componente : componentes) {
            componente.mostrarDetalhes();
        }
    }
}
