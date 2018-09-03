package com.tsekhanovich.patterns.generative.abstractfactory.example1.products;

public class ProductB2 implements AbstractProductB {

    public void interact(AbstractProductA productA) {
        System.out.println(this.getClass().getName() + " interact with " + productA.getClass().getName());
    }
}
