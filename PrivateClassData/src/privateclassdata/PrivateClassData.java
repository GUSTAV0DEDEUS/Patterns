/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package privateclassdata;

import comPadrao.Funcionario;
import semPadrao.FuncionarioSem;

/**
 *
 * @author Gustavo
 */
public class PrivateClassData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sem padrao
        FuncionarioSem funcionario = new FuncionarioSem("Gustavo", 5000.0, "Desenvolvedor");
        funcionario.exibirDetalhes();
        
        // Cliente pode alterar diretamente os dados do funcionário
        funcionario.setSalario(6000.0);
        funcionario.exibirDetalhes();
        
        // Com padrao
        Funcionario funcionario2 = new Funcionario("Gustavo", 5000.0, "Desenvolvedor");
        funcionario2.exibirDetalhes();
    }
    
}
