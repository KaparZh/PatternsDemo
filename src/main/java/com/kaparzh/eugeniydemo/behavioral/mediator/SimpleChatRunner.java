package com.kaparzh.eugeniydemo.behavioral.mediator;

public class SimpleChatRunner {

    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        Admin admin = new Admin(chat, "admin");
        User user1 = new SimpleUser(chat, "User1");
        User user2 = new SimpleUser(chat, "User2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello, I'm User1");
        admin.sendMessage("I'm admin!!!");
    }
}
