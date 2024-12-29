/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semPadrao;

/**
 *
 * @author Gustavo
 */
public class ClienteSem {
     private final ServicoEmailSem servicoEmail;

    public ClienteSem() {
       
        this.servicoEmail = new ServicoEmailSem();
    }

    public void processar() {
        servicoEmail.enviarEmail("Bem-vindo ao sistema!");
    }
}
