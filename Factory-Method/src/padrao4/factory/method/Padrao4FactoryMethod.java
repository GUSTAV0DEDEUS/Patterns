/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padrao4.factory.method;

import comPadrao.FabricaDeLivros;
import comPadrao.FabricaDeLivrosLuxo;
import semPadrao.Livro;

/**
 *
 * @author Aluno
 */
public class Padrao4FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // sem padrao
        LivroDeLuxo livroDeLuxo = new LivroDeLuxo("Aventuras Fantásticas", "John Doe", 300, 2, "Pôster");
        livroDeLuxo.exibirDetalhes();
        // com padrao
        FabricaDeLivros fabrica = new FabricaDeLivrosLuxo();
        Livro livro = fabrica.criarLivro();
        livro.exibirDetalhes();
    }
    
}
