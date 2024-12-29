/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package state;

import comPadrao.BankAccount;
import semPadrao.BankAccountSem;

/**
 *
 * @author ALUNO
 */
public class State {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Sem padrao
        BankAccountSem account = new BankAccountSem();
        
        account.deposit(100);
        account.displayState();  
        
        account.withdraw(150);
        account.displayState();  

        account.deposit(50);
        account.displayState();
        
        // Com Padrao
        BankAccount accountCom = new BankAccount();
        
        accountCom.deposit(100);
        accountCom.displayState(); 
        
        accountCom.withdraw(150);
        accountCom.displayState();  
        
        accountCom.deposit(50);
        accountCom.displayState();
    }
    
}
