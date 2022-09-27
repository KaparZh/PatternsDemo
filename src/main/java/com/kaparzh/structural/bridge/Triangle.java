package com.kaparzh.structural.bridge;

public class Triangle extends Shape {

    @Override
    public void draw(Color color) {
        System.out.println("Square drawn.");
        color.fill();
    }
}
