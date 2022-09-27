package com.kaparzh.structural.composite;

public abstract class BookComponent {

    int level;

    void showLevel() {
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
    }

    String getName() {
        throw new UnsupportedOperationException();
    }

    String getAuthor() {
        throw new UnsupportedOperationException();
    }

    void add(BookComponent component) {
        throw new UnsupportedOperationException();
    }

    void remove(BookComponent component) {
        throw new UnsupportedOperationException();
    }

    void print() {
        throw new UnsupportedOperationException();
    }

    void print(int level) {
        this.level = level;
        print();
    }
}
