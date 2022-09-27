package com.kaparzh.creational.prototype;

public class Unit implements Copyable {

    private int width;
    private int height;
    private int speed;

    public Unit(int width, int height, int speed) {
        this.width = width;
        this.height = height;
        this.speed = speed;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public Object copy() {
        return new Unit(width, height, speed);
    }

    @Override
    public String toString() {
        return "Unit{" +
                "width=" + width +
                ", height=" + height +
                ", speed=" + speed +
                '}';
    }
}
