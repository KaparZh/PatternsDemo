package com.kaparzh.behavioral.command;

public class OpenTextFileOperation implements Command{

    private final TextFile textFile;

    public OpenTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.open();
    }
}
