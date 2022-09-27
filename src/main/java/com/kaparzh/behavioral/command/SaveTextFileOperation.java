package com.kaparzh.behavioral.command;

public class SaveTextFileOperation implements Command{

    private final TextFile textFile;

    public SaveTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.save();
    }
}
