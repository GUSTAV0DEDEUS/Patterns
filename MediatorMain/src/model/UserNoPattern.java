/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Gustavo
 */
public class UserNoPattern {
    private String name;

    public UserNoPattern(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(Chat chat, String message) {
        chat.showMessage(this, message);
    }
}