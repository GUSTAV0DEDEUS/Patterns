/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adaptermain;

import comPadrao.NewPaymentAdapter;
import comPadrao.NewPaymentSystemCom;
import comPadrao.OldPaymentProcessorCom;
import comPadrao.OldPaymentSystemCom;
import semPadrao.NewPaymentSystem;
import semPadrao.OldPaymentProcessor;
import semPadrao.OldPaymentSystem;

/**
 *
 * @author ALUNO
 */
public class AdapterMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OldPaymentSystem oldPayment = new OldPaymentProcessor();
        oldPayment.processPayment("12345", 250.0); 

        NewPaymentSystem newPayment = new NewPaymentSystem();
        
        
        // Com padrao
        OldPaymentSystemCom oldPaymentCom = new OldPaymentProcessorCom();
        oldPaymentCom.processPayment("12345", 250.0); 
        
       
        NewPaymentSystemCom newPaymentCom = new NewPaymentSystemCom();
        OldPaymentSystemCom adaptedPayment = new NewPaymentAdapter(newPaymentCom);
        adaptedPayment.processPayment("12345", 250.0);
    }
    
}
