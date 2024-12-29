/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padrao3;

import builder.Produto;
import semPadrao.ProdutoSem;

/**
 *
 * @author Gustavo
 */
public class Padrao3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Produto produto1 = new Produto.ProductBuilder("Laptop", 1500.00)
                .setDescription("laptop de alta performace")
                .setInStock(true)
                .build();

        Produto produto2 = new Produto.ProductBuilder("Celular", 800.00)
                .setDescription("Celular de ultima geracao")
                .setInStock(false)
                .build();

        Produto produto3 = new Produto.ProductBuilder("Fones de ouvido", 100.00)
                .build();
        
        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        
        ProdutoSem produto4 = new ProdutoSem("Produto 4", 100.0);
        produto4.setDescription("Descrição do Produto 4");
        produto4.setInStock(true);
        System.out.println(produto4);

        // Criação de um produto com todos os campos
        ProdutoSem produto5 = new ProdutoSem("Produto 5", "Descrição do Produto 5", 200.0, false);
        System.out.println(produto5);
    }
    
}
