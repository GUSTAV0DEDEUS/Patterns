/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

/**
 *
 * @author Gustavo
 */
public class Cliente {
    private ServicoNotificacao servicoNotificacao;

    // Injeção de dependência via construtor
    public Cliente(ServicoNotificacao servicoNotificacao) {
        this.servicoNotificacao = servicoNotificacao;
    }

    public void processar() {
        servicoNotificacao.enviarNotificacao("Bem-vindo ao sistema!");
    }
}
