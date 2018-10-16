package com.tsekhanovich.patterns.structural.bridge.example1;

/**
 * @author Pavel Tsekhanovich 16.10.2018
 * <p>
 * bridge
 * Separates the abstraction from the implementation independently change both.
 */
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
