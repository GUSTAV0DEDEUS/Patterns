/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

/**
 *
 * @author ALUNO
 */
public class ShippingVisitor implements Visitor {
    @Override
    public double visit(Book book) {
        // Frete para livros
        return book.getPrice() * 0.05;
    }

    @Override
    public double visit(DVD dvd) {
        // Frete para DVDs
        return dvd.getPrice() * 0.10;
    }
}
