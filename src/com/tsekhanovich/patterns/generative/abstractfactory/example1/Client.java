package com.tsekhanovich.patterns.generative.abstractfactory.example1;

import com.tsekhanovich.patterns.generative.abstractfactory.example1.factories.AbstractFactory;
import com.tsekhanovich.patterns.generative.abstractfactory.example1.products.AbstractProductA;
import com.tsekhanovich.patterns.generative.abstractfactory.example1.products.AbstractProductB;

public class Client {

    private AbstractProductA productA;
    private AbstractProductB productB;

    public Client(AbstractFactory factory) {
        productA = factory.createProductA();
        productB = factory.createProductB();
    }

    public void execute() {
        productB.interact(productA);
    }
}
