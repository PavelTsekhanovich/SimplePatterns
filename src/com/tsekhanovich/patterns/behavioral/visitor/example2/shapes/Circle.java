package com.tsekhanovich.patterns.behavioral.visitor.example2.shapes;

public class Circle extends Dot {

    private int radius;

    public Circle(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}