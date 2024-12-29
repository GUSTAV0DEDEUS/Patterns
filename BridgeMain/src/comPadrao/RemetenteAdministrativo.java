/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

/**
 *
 * @author Gustavo
 */
public class RemetenteAdministrativo extends Remetente {

    public RemetenteAdministrativo(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar() {
        System.out.print("Remetente Administrativo: ");
        notificacao.enviarNotificacao();
    }
}
