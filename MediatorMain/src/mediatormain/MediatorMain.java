/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediatormain;

import model.Chat;
import model.UserNoPattern;
import pattern.User;
import pattern.ChatMediator;
import pattern.ChatRoom;
import pattern.ConcreteUser;

/**
 *
 * @author Gustavo
 */
public class MediatorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // No pattern
        Chat chat = new Chat();

        UserNoPattern joao = new UserNoPattern("Joao");
        UserNoPattern maria = new UserNoPattern("Maria");

        joao.sendMessage(chat, "Olá, Bob!");
        maria.sendMessage(chat, "Oi, Alice!\n");

        // Pattern
        ChatMediator chatMediator = new ChatRoom();

        User alice = new ConcreteUser(chatMediator, "Alice");
        User bob = new ConcreteUser(chatMediator, "Bob");
        User charlie = new ConcreteUser(chatMediator, "Charlie");

        chatMediator.addUser(alice);
        chatMediator.addUser(bob);
        chatMediator.addUser(charlie);

        alice.sendMessage("Oi, pessoal!");
        bob.sendMessage("Olá, Alice!");
    }

}
