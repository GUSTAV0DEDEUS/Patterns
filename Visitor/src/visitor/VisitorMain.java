/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package visitor;

import comPadrao.Book;
import comPadrao.DVD;
import comPadrao.ItemElement;
import comPadrao.ShippingVisitor;
import comPadrao.Visitor;
import semPadrao.BookSem;
import semPadrao.DVDSem;

/**
 *
 * @author ALUNO
 */
public class VisitorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sem padrao
        BookSem book = new BookSem("The Great Gatsby", 30.0);
        DVDSem dvd = new DVDSem("Inception", 40.0);

        System.out.println(book.getTitle() + " Shipping: " + book.calculateShipping());
        System.out.println(dvd.getTitle() + " Shipping: " + dvd.calculateShipping());
    
        // Com padrao
        ItemElement[] items = new ItemElement[] {
            new Book("The Great Gatsby", 30.0),
            new DVD("Inception", 40.0)
        };

        Visitor shippingVisitor = new ShippingVisitor();

        for (ItemElement item : items) {
            System.out.println(item.accept(shippingVisitor));
        }
    }
    
}
