/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

/**
 *
 * @author Gustavo
 */
public abstract class Remetente {
    protected Notificacao notificacao;

    public Remetente(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public abstract void enviar();
}