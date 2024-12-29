/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

/**
 *
 * @author Gustavo
 */
public class UsuarioAdminFactory implements usuarioFactory {

    @Override
    public Usuario createUser() {
        return new UsuarioADM();
    }
}
