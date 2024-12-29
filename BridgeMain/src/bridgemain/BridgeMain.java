/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bridgemain;

import comPadrao.EmailNotification;
import comPadrao.Notificacao;
import comPadrao.Remetente;
import comPadrao.RemetenteAdministrativo;
import comPadrao.RemetenteMarketing;
import comPadrao.SMSNotification;
import semPadrao.RemetenteAdministrativoSem;
import semPadrao.RemetenteMarketingSem;

/**
 *
 * @author ALUNO
 */
public class BridgeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Sem Padrao
         RemetenteAdministrativoSem remetenteAdminSem = new RemetenteAdministrativoSem();
        remetenteAdminSem.enviarNotificacao(); 

        RemetenteMarketingSem remetenteMarketingSem = new RemetenteMarketingSem();
        remetenteMarketingSem.enviarNotificacao();
        
        // Com padrao
        Notificacao email = new EmailNotification();
        Remetente remetenteAdmin = new RemetenteAdministrativo(email);
        remetenteAdmin.enviar();

        Notificacao sms = new SMSNotification();
        Remetente remetenteMarketing = new RemetenteMarketing(sms);
        remetenteMarketing.enviar();
       
        Remetente adminComSms = new RemetenteAdministrativo(sms);
        adminComSms.enviar();
    }
    
}
