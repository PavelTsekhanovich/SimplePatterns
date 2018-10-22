package com.tsekhanovich.patterns.behavioral.visitor.example2.shapes;

public interface Shape {

    void move(int x, int y);

    void draw();

    String accept(Visitor visitor);
}