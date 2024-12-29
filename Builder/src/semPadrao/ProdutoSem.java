/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semPadrao;

/**
 *
 * @author Gustavo
 */
public class ProdutoSem {

    private String name;
    private String description;
    private double price;
    private boolean inStock;

    public ProdutoSem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public ProdutoSem(String name, String description, double price, boolean inStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "Produto [name=" + name + ", description=" + description + ", price=" + price + ", inStock=" + inStock + "]";
    }

}
