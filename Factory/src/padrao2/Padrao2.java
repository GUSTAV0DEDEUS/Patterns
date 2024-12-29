/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padrao2;

import comPadrao.UsuarioAdminFactory;
import comPadrao.UsuarioComumFactory;
import comPadrao.Usuario;
import comPadrao.usuarioFactory;
import semPadrao.UsuarioAdminSem;
import semPadrao.UsuarioComumSem;
import semPadrao.UsuarioSem;
/**
 *
 * @author Gustavo
 */
public class Padrao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        usuarioFactory usuarioAdminFactory = new UsuarioAdminFactory();
        usuarioFactory usuarioComumFactory = new UsuarioComumFactory();

        Usuario usuarioAdmin = usuarioAdminFactory.createUser();
        Usuario usuarioComum = usuarioComumFactory.createUser();

        System.out.println("papel do Usuario admin: " + usuarioAdmin.getRole());
        System.out.println("papel do Usuario Comum: " + usuarioComum.getRole());
        
        UsuarioSem usuarioAdmin2 = new UsuarioAdminSem();
        UsuarioSem usuarioComum2 = new UsuarioComumSem();

        // Exibição dos papéis dos usuários
        System.out.println("Papel do Usuário Admin: " + usuarioAdmin2.getRole());
        System.out.println("Papel do Usuário Comum: " + usuarioComum2.getRole());
    }

}
