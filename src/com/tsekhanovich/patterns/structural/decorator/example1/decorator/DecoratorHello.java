package com.tsekhanovich.patterns.structural.decorator.example1.decorator;

import com.tsekhanovich.patterns.structural.decorator.example1.component.InterfaceComponent;

public class DecoratorHello extends Decorator {

    public DecoratorHello(InterfaceComponent interfaceComponent) {
        super(interfaceComponent);
    }

    @Override
    public void doOperation() {
        System.out.println("Hello");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New Hello Operation");
    }
}
