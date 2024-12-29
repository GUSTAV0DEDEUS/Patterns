/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

/**
 *
 * @author Gustavo
 */
public class Funcionario {
    private final FuncionarioData dados;

    public Funcionario(String nome, double salario, String cargo) {
        this.dados = new FuncionarioData(nome, salario, cargo);
    }

    // Método que exibe os detalhes do funcionário
    public void exibirDetalhes() {
        System.out.println("Nome: " + dados.getNome() + ", Salário: " + dados.getSalario() + ", Cargo: " + dados.getCargo());
    }
}
