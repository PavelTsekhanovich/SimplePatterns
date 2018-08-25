package com.tsekhanovich.patterns.behavioral.visitor;

public interface Visitor {

    void visit(Point2d p);

    void visit(Point3d p);
}
