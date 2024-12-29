/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

/**
 *
 * @author ALUNO
 */
public class BankAccount {
    private AccountState state;
    private double balance;

    public BankAccount() {
        this.state = new EmptyState(); // Estado inicial
        this.balance = 0;
    }

    public void deposit(double amount) {
        state.deposit(this, amount);
    }

    public void withdraw(double amount) {
        state.withdraw(this, amount);
    }

    public void displayState() {
        state.displayState();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setState(AccountState state) {
        this.state = state;
    }
}

