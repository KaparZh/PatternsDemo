package com.kaparzh.structural.composite;

public class BookFolderRunner {

    public static void main(String[] args) {
        Book book1 = new Book("LoTR", "Tolkien");
        Book book2 = new Book("fantasyBook", "FantasyAuthor");
        Book book3 = new Book("SciFiBook1", "SciFiAuthor");
        Book book4 = new Book("DciFiBook2", "SciFiAuthor2");

        BookFolder sciFi = new BookFolder("Sci-fi");
        sciFi.add(book3);
        sciFi.add(book4);

        BookFolder fantasy = new BookFolder("Fantasy");
        fantasy.add(book1);
        fantasy.add(book2);
        fantasy.add(sciFi);

        BookFolder mainFolder = new BookFolder("Main folder");
        mainFolder.add(fantasy);

        mainFolder.print();
    }
}
