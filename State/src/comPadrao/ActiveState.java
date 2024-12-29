/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

/**
 *
 * @author ALUNO
 */
public class ActiveState implements AccountState {
    @Override
    public void deposit(BankAccount account, double amount) {
        account.setBalance(account.getBalance() + amount);
        checkState(account);
    }

    @Override
    public void withdraw(BankAccount account, double amount) {
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
        } else {
            System.out.println("Insufficient balance.");
        }
        checkState(account);
    }

    @Override
    public void displayState() {
        System.out.println("Account State: Active");
    }

    private void checkState(BankAccount account) {
        if (account.getBalance() < 0) {
            account.setState(new OverdrawnState());
        } else if (account.getBalance() == 0) {
            account.setState(new EmptyState());
        }
    }
}

