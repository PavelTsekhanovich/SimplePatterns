package com.tsekhanovich.patterns.generative.factory.example1;

import com.tsekhanovich.patterns.generative.factory.example1.creators.ConcreteCreatorA;
import com.tsekhanovich.patterns.generative.factory.example1.creators.ConcreteCreatorB;
import com.tsekhanovich.patterns.generative.factory.example1.creators.Creator;
import com.tsekhanovich.patterns.generative.factory.example1.products.Product;

public class FactoryMethodExample {

    public static void main(String[] args) {
        Creator[] creators = {new ConcreteCreatorA(), new ConcreteCreatorB()};
        for (Creator creator : creators) {
            Product product = creator.factoryMethod();
            System.out.printf("Created {%s}\n", product.getClass());
        }
    }
}
