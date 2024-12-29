/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pattern;

/**
 *
 * @author Gustavo
 */
public class Editor {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    // Cria um memento com o estado atual
    public Memento save() {
        return new Memento(content);
    }

    // Restaura o estado do memento
    public void restore(Memento memento) {
        this.content = memento.getState();
    }
}

