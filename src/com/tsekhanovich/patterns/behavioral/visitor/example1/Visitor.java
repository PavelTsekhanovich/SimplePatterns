package com.tsekhanovich.patterns.behavioral.visitor.example1;

public interface Visitor {

    void visit(Point2d p);

    void visit(Point3d p);
}
