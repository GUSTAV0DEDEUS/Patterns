/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package comPadrao;

/**
 *
 * @author Gustavo
 */
public class ServicoReal implements Servico {
    public ServicoReal() {
        carregarArquivoPesado();  // Simula uma tarefa pesada
    }

    private void carregarArquivoPesado() {
        System.out.println("Carregando arquivo pesado...");
    }

    @Override
    public void executar() {
        System.out.println("Serviço Real executado.");
    }
}