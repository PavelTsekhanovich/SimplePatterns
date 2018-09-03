package com.tsekhanovich.patterns.generative.abstractfactory.example1.factories;

import com.tsekhanovich.patterns.generative.abstractfactory.example1.products.AbstractProductA;
import com.tsekhanovich.patterns.generative.abstractfactory.example1.products.AbstractProductB;
import com.tsekhanovich.patterns.generative.abstractfactory.example1.products.ProductA2;
import com.tsekhanovich.patterns.generative.abstractfactory.example1.products.ProductB2;

public class Factory2 implements AbstractFactory {

    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
