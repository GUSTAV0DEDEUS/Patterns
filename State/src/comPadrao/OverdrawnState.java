/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

/**
 *
 * @author ALUNO
 */
public class OverdrawnState implements AccountState {
    @Override
    public void deposit(BankAccount account, double amount) {
        account.setBalance(account.getBalance() + amount);
        checkState(account);
    }

    @Override
    public void withdraw(BankAccount account, double amount) {
        System.out.println("Cannot withdraw. Account is overdrawn.");
    }

    @Override
    public void displayState() {
        System.out.println("Account State: Overdrawn");
    }

    private void checkState(BankAccount account) {
        if (account.getBalance() >= 0) {
            account.setState(new ActiveState());
        }
    }
}
