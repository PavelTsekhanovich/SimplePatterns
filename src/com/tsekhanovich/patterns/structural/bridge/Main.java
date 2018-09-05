package com.tsekhanovich.patterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5, 10, 10, new LargeCircleDrawer()),
                new Circle(20, 30, 100, new SmallCircleDrawer())};

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
