/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Gustavo
 */
public class Chat {
    public void showMessage(UserNoPattern user, String message) {
        System.out.println(user.getName() + ": " + message);
    }
}
