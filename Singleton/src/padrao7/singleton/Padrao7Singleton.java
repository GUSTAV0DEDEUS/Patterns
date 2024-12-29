/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package padrao7.singleton;

import semPadrao.LoggerS;
import comPadrao.LoggerC;

/**
 *
 * @author Gustavo
 */
public class Padrao7Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sem padrao
        LoggerS logger1 = new LoggerS();
        LoggerS logger2 = new LoggerS();

        logger1.log("Primeira mensagem");
        logger2.log("Segunda mensagem");
        System.out.println(logger1 == logger2);

        // Com padrao
        LoggerC logger3 = LoggerC.getInstance();
        LoggerC logger4 = LoggerC.getInstance();

        logger3.log("Terceira mensagem");
        logger4.log("Quarta mensagem");

        System.out.println(logger3 == logger4);
    }

}
