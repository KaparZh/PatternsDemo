package com.kaparzh.structural.bridge;

public class ShapeConstructor {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        Red red = new Red();
        Green green = new Green();

        triangle.draw(red);
        rectangle.draw(green);
    }
}
