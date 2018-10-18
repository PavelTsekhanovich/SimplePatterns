package com.tsekhanovich.patterns.structural.decorator.example1;

import com.tsekhanovich.patterns.structural.decorator.example1.component.MainComponent;
import com.tsekhanovich.patterns.structural.decorator.example1.decorator.Decorator;
import com.tsekhanovich.patterns.structural.decorator.example1.decorator.DecoratorComma;
import com.tsekhanovich.patterns.structural.decorator.example1.decorator.DecoratorHello;
import com.tsekhanovich.patterns.structural.decorator.example1.decorator.DecoratorSpace;

public class Main {

    public static void main(String[] args) {
        Decorator decorator = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent())));
        decorator.doOperation();
        decorator.newOperation();
    }
}
