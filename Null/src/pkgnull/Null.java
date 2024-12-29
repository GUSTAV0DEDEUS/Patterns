/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgnull;

/**
 *
 * @author ALUNO
 */
public class Null {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Animal dog = getAnimal(true);
        dog.makeSound(); 

       
        Animal noAnimal = getAnimal(false);
        noAnimal.makeSound(); 
    }

   
    public static Animal getAnimal(boolean hasDog) {
        if (hasDog) {
            return new Dog();
        }
        return new NullAnimal(); 
    }
    
}
