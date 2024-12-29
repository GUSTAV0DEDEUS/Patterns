/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

/**
 *
 * @author Gustavo
 */
public class EmailNotification implements Notificacao {
    @Override
    public void enviarNotificacao() {
        System.out.println("Enviando notificação por Email...");
    }
}

