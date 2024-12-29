/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

/**
 *
 * @author Gustavo
 */
public class RemetenteMarketing extends Remetente {

    public RemetenteMarketing(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar() {
        System.out.print("Remetente de Marketing: ");
        notificacao.enviarNotificacao();
    }
}