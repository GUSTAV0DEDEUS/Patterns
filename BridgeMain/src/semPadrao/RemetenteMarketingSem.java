/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semPadrao;

/**
 *
 * @author Gustavo
 */
public class RemetenteMarketingSem {
    private SMSNotificationSem smsNotification = new SMSNotificationSem();

    public void enviarNotificacao() {
        smsNotification.enviar();
    }
}
