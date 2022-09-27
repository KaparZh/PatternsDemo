package com.kaparzh.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class BookFolder extends BookComponent {

    private final List<BookComponent> bookComponents = new ArrayList<>();
    private final String description;

    public BookFolder(String description) {
        this.description = description;
    }

    @Override
    protected void add(BookComponent component) {
        bookComponents.add(component);
    }

    @Override
    protected void remove(BookComponent component) {
        bookComponents.remove(component);
    }

    @Override
    void print() {
        showLevel();
        System.out.println("---" + description + "---");
        bookComponents.forEach(component -> component.print(level + 1));
    }
}
