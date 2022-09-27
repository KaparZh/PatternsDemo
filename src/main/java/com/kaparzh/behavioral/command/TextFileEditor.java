package com.kaparzh.behavioral.command;

public class TextFileEditor {

    private final Command open;
    private final Command save;

    public TextFileEditor(Command open, Command save) {
        this.open = open;
        this.save = save;
    }

    public void openFile() {
        open.execute();
    }

    public void saveFile() {
        save.execute();
    }
}
