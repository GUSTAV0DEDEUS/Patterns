/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package comPadrao;

/**
 *
 * @author ALUNO
 */
public interface AccountState {
    void deposit(BankAccount account, double amount);
    void withdraw(BankAccount account, double amount);
    void displayState();
}
