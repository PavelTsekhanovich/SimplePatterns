package com.tsekhanovich.patterns.structural.composite.example1;

/**
 * @author Pavel Tsekhanovich 17.10.2018
 *
 * composite
 * Сombines objects in a tree structure to represent the hierarchy from the particular to the whole.
 * Linker allows clients to access individual objects and groups of objects in the same way.
 *
 * + Simplifies client architecture when working with a complex component tree.
 * + Facilitates the addition of new types of components.
 *
 * - Creates too general class design.
 */
public class Main {

    public static void main(String[] args) {

        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();

        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        graphic2.add(ellipse4);

        graphic.add(graphic1);
        graphic.add(graphic2);

        graphic.print();
    }
}
