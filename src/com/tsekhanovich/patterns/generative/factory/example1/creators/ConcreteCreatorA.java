package com.tsekhanovich.patterns.generative.factory.example1.creators;

import com.tsekhanovich.patterns.generative.factory.example1.products.ConcreteProductA;
import com.tsekhanovich.patterns.generative.factory.example1.products.Product;

public class ConcreteCreatorA extends Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
