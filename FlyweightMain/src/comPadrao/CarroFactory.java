/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gustavo
 */
public class CarroFactory {
    private static final Map<String, CarroFlyweight> cacheCarros = new HashMap<>();

    public static CarroFlyweight getCarro(String marca, String modelo, String motor) {
        String chave = marca + modelo + motor;
        CarroFlyweight carro = cacheCarros.get(chave);
        if (carro == null) {
            carro = new CarroFlyweight(marca, modelo, motor);
            cacheCarros.put(chave, carro);
        }
        return carro;
    }
}