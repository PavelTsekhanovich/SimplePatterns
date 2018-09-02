package com.tsekhanovich.patterns.generative.factory.creators;

import com.tsekhanovich.patterns.generative.factory.products.ConcreteProductB;
import com.tsekhanovich.patterns.generative.factory.products.Product;

public class ConcreteCreatorB extends Creator{

    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
