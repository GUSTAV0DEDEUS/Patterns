/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattern;

/**
 *
 * @author Gustavo
 */
public class NameRepository implements Container {
    public String[] names = {"Alice", "Bob", "Charlie", "David"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    // Classe interna para implementar o Iterator
    private class NameIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}

