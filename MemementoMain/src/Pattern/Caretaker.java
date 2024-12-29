/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pattern;

import java.util.Stack;

/**
 *
 * @author Gustavo
 */
public class Caretaker {
    private Stack<Memento> mementoStack = new Stack<>();

    public void saveState(Editor editor) {
        mementoStack.push(editor.save());
    }

    public void restoreState(Editor editor) {
        if (!mementoStack.isEmpty()) {
            editor.restore(mementoStack.pop());
        }
    }
}
