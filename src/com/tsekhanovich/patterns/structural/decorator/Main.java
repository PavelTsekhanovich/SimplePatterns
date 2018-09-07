package com.tsekhanovich.patterns.structural.decorator;

import com.tsekhanovich.patterns.structural.decorator.components.MainComponent;
import com.tsekhanovich.patterns.structural.decorator.decorators.Decorator;
import com.tsekhanovich.patterns.structural.decorator.decorators.DecoratorComma;
import com.tsekhanovich.patterns.structural.decorator.decorators.DecoratorHello;
import com.tsekhanovich.patterns.structural.decorator.decorators.DecoratorSpace;

public class Main {
    public static void main(String[] args) {
        Decorator decorator = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent())));
        decorator.doOperation();
        decorator.newOperation();
    }
}
