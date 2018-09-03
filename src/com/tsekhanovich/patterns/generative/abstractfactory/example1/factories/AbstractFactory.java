package com.tsekhanovich.patterns.generative.abstractfactory.example1.factories;

import com.tsekhanovich.patterns.generative.abstractfactory.example1.products.AbstractProductA;
import com.tsekhanovich.patterns.generative.abstractfactory.example1.products.AbstractProductB;

public interface AbstractFactory {

    AbstractProductA createProductA();

    AbstractProductB createProductB();
}
