package com.tsekhanovich.patterns.generative.factory.example1.creators;

import com.tsekhanovich.patterns.generative.factory.example1.products.ConcreteProductB;
import com.tsekhanovich.patterns.generative.factory.example1.products.Product;

public class ConcreteCreatorB extends Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
