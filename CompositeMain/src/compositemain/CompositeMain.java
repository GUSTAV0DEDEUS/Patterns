/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compositemain;

import comPadrao.Arquivo;
import comPadrao.Componente;
import comPadrao.Pasta;
import semPadrao.ArquivoSem;
import semPadrao.PastaSem;

/**
 *
 * @author Gustavo
 */
public class CompositeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Sem padrao
        ArquivoSem arquivo1 = new ArquivoSem("Documento1.txt");
        ArquivoSem arquivo2 = new ArquivoSem("Imagem1.jpg\n");

        PastaSem pasta = new PastaSem("Meus Documentos");
        pasta.adicionarArquivo(arquivo1);
        pasta.adicionarArquivo(arquivo2);

        pasta.mostrarDetalhes();
        
        // Com padrao
        Componente arquivo3 = new Arquivo("Documento1.txt");
        Componente arquivo4 = new Arquivo("Imagem1.jpg");

        Pasta pasta1 = new Pasta("Meus Documentos");
        pasta1.adicionarComponente(arquivo3);
        pasta1.adicionarComponente(arquivo4);

        Componente arquivo5 = new Arquivo("Apresentacao.pptx");
        Pasta pasta2 = new Pasta("Projetos");
        pasta2.adicionarComponente(arquivo5);
        pasta2.adicionarComponente(pasta1);

        pasta2.mostrarDetalhes();
    }
    
}
