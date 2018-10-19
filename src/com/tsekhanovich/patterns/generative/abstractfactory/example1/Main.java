package com.tsekhanovich.patterns.generative.abstractfactory.example1;

import com.tsekhanovich.patterns.generative.abstractfactory.example1.factories.AbstractFactory;
import com.tsekhanovich.patterns.generative.abstractfactory.example1.factories.Factory1;
import com.tsekhanovich.patterns.generative.abstractfactory.example1.factories.Factory2;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory1 = new Factory1();
        Client client1 = new Client(factory1);
        client1.execute();

        AbstractFactory factory2 = new Factory2();
        Client client2 = new Client(factory2);
        client2.execute();
    }
}

