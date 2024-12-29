/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

import interfaces.Builder;

/**
 *
 * @author Gustavo
 */
public class Produto {
    private final String name;
    private final String description;
    private final double price;
    private final boolean inStock;

    private Produto(ProductBuilder builder) {
        this.name = builder.name;
        this.description = builder.description;
        this.price = builder.price;
        this.inStock = builder.inStock;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", description=" + description + ", price=" + price + ", inStock=" + inStock + "]";
    }

    public static class ProductBuilder implements Builder<Produto> {
        private String name;
        private String description;
        private double price;
        private boolean inStock;

        public ProductBuilder(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public ProductBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder setInStock(boolean inStock) {
            this.inStock = inStock;
            return this;
        }

        @Override
        public Produto build() {
            return new Produto(this);
        }
    }
}

