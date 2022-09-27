package com.kaparzh.structural.bridge;

public class Rectangle extends Shape {

    @Override
    public void draw(Color color) {
        System.out.println("Rectangle drawn");
        color.fill();
    }
}
