package com.kaparzh.behavioral.command;

public class TextFileEditorRunner {

    public static void main(String[] args) {
        TextFileEditor textFileEditor = new TextFileEditor(
                new OpenTextFileOperation(new TextFile("reports.txt")),
                new SaveTextFileOperation(new TextFile("reports.txt"))
        );

        textFileEditor.openFile();
        textFileEditor.saveFile();
    }
}
