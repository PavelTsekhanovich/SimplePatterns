package com.tsekhanovich.patterns.behavioral.visitor;

/**
 * @author Pavel Tsekhanovich 26.08.2018
 *
 * Visitor
 * Allows you to add new behavior to all objects of some related structure,
 * without changing the objects themselves, to which this behavior applies.
 *
 * + Simplifies the addition of new operations over the entire related object structure.
 * + Combines related operations in the same class.
 * + A visitor can accumulate a state while traversing a structure.
 *
 * - The pattern is unjustified if the hierarchy of components is often changed.
 * - Violates the encapsulation of components.
 */
public class Main {

    public static void main(String[] args) {
        Point p = new Point2d(1, 2);
        Visitor v = new Chebyshev();
        p.accept(v);
        System.out.println(p.getMetric());
    }
}