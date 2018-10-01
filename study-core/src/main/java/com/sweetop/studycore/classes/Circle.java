package com.sweetop.studycore.classes;

public class Circle {
    private int x, y, radius;

    Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setOrigin(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}