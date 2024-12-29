/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pattern;

/**
 *
 * @author Gustavo
 */
// ControleDePedidos.java
import java.util.ArrayList;
import java.util.List;

public class ControleDePedidos {
    private List<Command> filaDeComandos = new ArrayList<>();

    public void adicionarComando(Command comando) {
        filaDeComandos.add(comando);
    }

    public void executarComandos() {
        for (Command comando : filaDeComandos) {
            comando.execute();
        }
        filaDeComandos.clear();
    }
}
