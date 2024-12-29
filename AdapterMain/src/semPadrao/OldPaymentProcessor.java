/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semPadrao;

/**
 *
 * @author ALUNO
 */
public class OldPaymentProcessor implements OldPaymentSystem {
    @Override
    public void processPayment(String accountNumber, double amount) {
        System.out.println("Processing payment of " + amount + " to account " + accountNumber + " using the old system.");
    }
}

