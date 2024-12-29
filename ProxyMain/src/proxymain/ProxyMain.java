/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proxymain;

import comPadrao.Servico;
import comPadrao.ServicoProxy;
import semPadrao.Service;

/**
 *
 * @author Gustavo
 */
public class ProxyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sem padrao
        Service servico = new Service();
        servico.executar();
        
        // com padrao
        Servico servico2 = new ServicoProxy();  
        System.out.println("Proxy criado. O serviço real ainda não foi carregado.");
        
        servico2.executar();
        servico2.executar(); 
    }
    
}
