/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

/**
 *
 * @author Gustavo
 */
public abstract class RelatorioTemplate {

    public final void gerarRelatorio() {
        carregarDados();
        formatarRelatorio();
        imprimirRelatorio();
    }

    private void carregarDados() {
        System.out.println("Carregando dados...");
    }

    protected abstract void formatarRelatorio();

    private void imprimirRelatorio() {
        System.out.println("Imprimindo relatório.");
    }
}
