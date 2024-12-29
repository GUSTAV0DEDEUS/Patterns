/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comPadrao;

/**
 *
 * @author Gustavo
 */
public class LoggerC {
    private static LoggerC instance;

    private LoggerC() {}

    public static LoggerC getInstance() {
        if (instance == null) {
            instance = new LoggerC();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
