/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padrao6.prototype;

import comPadrao.CarroC;
import semPadrao.CarroS;

/**
 *
 * @author Gustavo
 */
public class Padrao6Prototype {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // sem Padrao
        CarroS carro1 = new CarroS("SUV", "Vermelho");
        CarroS carro2 = new CarroS("SUV", "Vermelho");

        System.out.println(carro1);
        System.out.println(carro2);
        // com Padrao
        CarroC carroPrototype = new CarroC("SUV", "Vermelho");
        CarroC carro3 = carroPrototype.clone();
        CarroC carro4 = carroPrototype.clone();

        System.out.println(carro3);
        System.out.println(carro4);
    }
    
}
