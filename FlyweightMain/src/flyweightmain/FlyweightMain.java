/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flyweightmain;

import comPadrao.CarroFactory;
import comPadrao.CarroFlyweight;
import semPadrao.Carro;

/**
 *
 * @author Gustavo
 */
public class FlyweightMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sem padrao
        Carro carro1 = new Carro("Ford", "Mustang", "Vermelho", "V8");
        Carro carro2 = new Carro("Ford", "Mustang", "Preto", "V8");
        Carro carro3 = new Carro("Chevrolet", "Camaro", "Vermelho", "V8");

        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
        carro3.exibirDetalhes();
        
        // Com padrao
        CarroFlyweight carro4 = CarroFactory.getCarro("Ford", "Mustang", "V8");
        carro4.exibirDetalhes("Vermelho");

        CarroFlyweight carro5 = CarroFactory.getCarro("Ford", "Mustang", "V8");
        carro5.exibirDetalhes("Preto");

        CarroFlyweight carro6 = CarroFactory.getCarro("Chevrolet", "Camaro", "V8");
        carro6.exibirDetalhes("Vermelho");
    }
    
}
