/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semPadrao;

/**
 *
 * @author ALUNO
 */
public class BankAccountSem {
     private String state; // Estado como string ("Active", "Overdrawn", etc.)
    private double balance;

    public BankAccountSem() {
        this.state = "Active"; // Estado inicial
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
        checkState(); 
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
        checkState(); 
    }

    public void checkState() {
        if (balance < 0) {
            state = "Overdrawn";
        } else if (balance == 0) {
            state = "Empty";
        } else {
            state = "Active";
        }
    }

    public void displayState() {
        System.out.println("Account State: " + state);
    }
}
