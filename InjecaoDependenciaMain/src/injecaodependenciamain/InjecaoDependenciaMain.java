/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package injecaodependenciamain;

import comPadrao.Cliente;
import comPadrao.ServicoEmail;
import comPadrao.ServicoNotificacao;
import semPadrao.ClienteSem;

/**
 *
 * @author Gustavo
 */
public class InjecaoDependenciaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sem padrao
        ClienteSem cliente = new ClienteSem();
        cliente.processar();
        // Com padrao
        ServicoNotificacao servico = new ServicoEmail(); 
        Cliente cliente2 = new Cliente(servico);
        cliente2.processar();
    }
    
}
