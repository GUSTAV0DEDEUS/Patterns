/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

/**
 *
 * @author Gustavo
 */
public class ServicoProxy implements Servico {
    private ServicoReal servicoReal;

    @Override
    public void executar() {
        if (servicoReal == null) {
            servicoReal = new ServicoReal();  // Instancia o Serviço Real apenas quando necessário
        }
        servicoReal.executar();
    }
}