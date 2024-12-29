/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

import padrao4.factory.method.LivroDeLuxo;
import semPadrao.Livro;

/**
 *
 * @author Aluno
 */
public class FabricaDeLivrosLuxo implements FabricaDeLivros {
   @Override
    public Livro criarLivro() {
        return new LivroDeLuxo("Aventuras Fantásticas", "John Doe", 300, 2, "Pôster");
    }
}

