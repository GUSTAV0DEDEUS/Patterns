/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package comPadrao;

/**
 *
 * @author ALUNO
 */
public interface Visitor {
    double visit(Book book);
    double visit(DVD dvd);
}

