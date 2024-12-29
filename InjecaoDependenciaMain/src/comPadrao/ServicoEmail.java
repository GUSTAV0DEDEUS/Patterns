/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

/**
 *
 * @author Gustavo
 */
public class ServicoEmail implements ServicoNotificacao {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando email com a mensagem: " + mensagem);
    }
}