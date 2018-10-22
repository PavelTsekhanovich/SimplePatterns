package com.tsekhanovich.patterns.behavioral.visitor.example2.shapes;

import com.tsekhanovich.patterns.generative.prototype.example2.shapes.Circle;

public interface Visitor {

    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}