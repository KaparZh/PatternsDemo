package com.kaparzh.behavioral.memento;

public class SaveCharacterRunner {

    public static void main(String[] args) {
        Repo repo = new Repo();
        Character character = new Character("User", 44, 100, 75);
        System.out.println(character);

        repo.setSave(character.save());
        character.setLevel(50);
        System.out.println(character);

        character.load(repo.getSave());
        System.out.println(character);
    }
}
