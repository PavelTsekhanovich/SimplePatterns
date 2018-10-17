package com.tsekhanovich.patterns.generative.factory.creators;

import com.tsekhanovich.patterns.generative.factory.products.ConcreteProductA;
import com.tsekhanovich.patterns.generative.factory.products.Product;

public class ConcreteCreatorA extends Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
