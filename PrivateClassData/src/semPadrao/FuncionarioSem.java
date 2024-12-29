/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semPadrao;

/**
 *
 * @author Gustavo
 */
public class FuncionarioSem {
    private String nome;
    private double salario;
    private String cargo;

    public FuncionarioSem(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Método que exibe os detalhes do funcionário
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + ", Salário: " + salario + ", Cargo: " + cargo);
    }
}