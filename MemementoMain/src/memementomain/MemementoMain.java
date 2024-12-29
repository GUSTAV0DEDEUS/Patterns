/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package memementomain;

import Pattern.Caretaker;
import Pattern.Editor;
import noPattern.EditorNoPattern;

/**
 *
 * @author Gustavo
 */
public class MemementoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EditorNoPattern editorNoPattern = new EditorNoPattern();
        
        // Definindo o conteúdo inicial
        editorNoPattern.setContent("Versão 1");
        System.out.println("Conteúdo atual: " + editorNoPattern.getContent());
        
        // Salvando o estado manualmente
        String savedState = editorNoPattern.getContent();

        // Modificando o conteúdo
        System.out.println("Conteúdo atual: " + editorNoPattern.getContent());

        // Restaurando o estado anterior manualmente
        editorNoPattern.setContent(savedState);
        System.out.println("Conteúdo restaurado: " + editorNoPattern.getContent());
        
        // Pattern
        Editor editor = new Editor();
        Caretaker caretaker = new Caretaker();

        // Definindo o conteúdo inicial
        editor.setContent("Versão 1");
        System.out.println("Conteúdo atual: " + editor.getContent());

        // Salvando o estado atual
        caretaker.saveState(editor);

        // Modificando o conteúdo
        editor.setContent("Versão 2");
        System.out.println("Conteúdo atual: " + editor.getContent());

        // Restaurando o estado anterior
        caretaker.restoreState(editor);
        System.out.println("Conteúdo restaurado: " + editor.getContent());
    }
}
    
