package com.tsekhanovich.patterns.structural.decorator.decorators;

import com.tsekhanovich.patterns.structural.decorator.components.InterfaceComponent;

public class DecoratorSpace extends Decorator {

    public DecoratorSpace(InterfaceComponent interfaceComponent) {
        super(interfaceComponent);
    }

    @Override
    public void doOperation() {
        System.out.println(" ");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New Space Operation");
    }
}
