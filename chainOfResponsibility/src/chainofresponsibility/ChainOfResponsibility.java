/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chainofresponsibility;


/**
 *
 * @author Gustavo
 */
public class ChainOfResponsibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Restaurante restaurante = new Restaurante();

        // Cliente faz pedidos
        System.out.println("Pedido 1: Pizza");
        restaurante.fazerPedido("Pizza");

        System.out.println("\nPedido 2: Massa");
        restaurante.fazerPedido("Massa");

        System.out.println("\nPedido 3: Salada");
        restaurante.fazerPedido("Salada");

        System.out.println("\nPedido 4: Sushi");
        restaurante.fazerPedido("Sushi\n");
        
        
        
        RestauranteSemPadrao restauranteSemPadrao = new RestauranteSemPadrao();

        // Cliente faz pedidos
        System.out.println("Pedido 1: Pizza");
        restauranteSemPadrao.fazerPedido("Pizza");

        System.out.println("\nPedido 2: Massa");
        restauranteSemPadrao.fazerPedido("Massa");

        System.out.println("\nPedido 3: Salada");
        restauranteSemPadrao.fazerPedido("Salada");

        System.out.println("\nPedido 4: Sushi");
        restauranteSemPadrao.fazerPedido("Sushi");
    }
}
