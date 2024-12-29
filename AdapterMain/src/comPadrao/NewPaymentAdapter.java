/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;


/**
 *
 * @author ALUNO
 */
public class NewPaymentAdapter implements OldPaymentSystemCom{
    private NewPaymentSystemCom newPaymentSystem;

    public NewPaymentAdapter(NewPaymentSystemCom newPaymentSystem) {
        this.newPaymentSystem = newPaymentSystem;
    }

    @Override
    public void processPayment(String accountNumber, double amount) {
        // Adaptando a interface antiga para usar o novo sistema
        newPaymentSystem.makePayment(amount, accountNumber);
    }
}
