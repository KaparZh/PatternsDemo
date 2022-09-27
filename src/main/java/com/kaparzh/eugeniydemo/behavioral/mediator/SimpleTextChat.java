package com.kaparzh.eugeniydemo.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat {

    private User admin;
    private final List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public void addUserToChat(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        users.stream().filter(u -> u != user).forEach(u -> u.getMessage(message));
        admin.getMessage(message);
    }
}
