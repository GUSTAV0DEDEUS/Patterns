/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semPadrao;

/**
 *
 * @author ALUNO
 */
public class DVDSem {

    private String title;
    private double price;

    public DVDSem(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public double calculateShipping() {
        return this.price * 0.10; // Frete diferente para DVDs
    }

    public String getTitle() {
        return title;
    }
}
