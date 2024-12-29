/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iterator;

import java.util.ArrayList;
import java.util.List;
import pattern.NameRepository;
import pattern.Iterator;


/**
 *
 * @author Gustavo
 */
public class IteratorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie\n");

        // Percorrendo a lista de maneira direta
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        
        // Pattern
         NameRepository namesRepository = new NameRepository();
        // Obtendo o iterador da coleção
        Iterator iterator = namesRepository.getIterator();

        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            System.out.println(name);
        }
    }
    
}
