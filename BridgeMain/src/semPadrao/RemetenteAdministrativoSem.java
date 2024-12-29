/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semPadrao;

/**
 *
 * @author Gustavo
 */
public class RemetenteAdministrativoSem {
    private EmailNotificationSem emailNotification = new EmailNotificationSem();

    public void enviarNotificacao() {
        emailNotification.enviar();
    }
}
