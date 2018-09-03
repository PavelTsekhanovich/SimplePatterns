package com.tsekhanovich.patterns.generative.abstractfactory.example1.factories;

import com.tsekhanovich.patterns.generative.abstractfactory.example1.products.AbstractProductA;
import com.tsekhanovich.patterns.generative.abstractfactory.example1.products.AbstractProductB;
import com.tsekhanovich.patterns.generative.abstractfactory.example1.products.ProductA1;
import com.tsekhanovich.patterns.generative.abstractfactory.example1.products.ProductB1;

public class Factory1 implements AbstractFactory {

    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
