package com.tsekhanovich.patterns.structural.decorator.example1.decorator;

import com.tsekhanovich.patterns.structural.decorator.example1.component.InterfaceComponent;

public class DecoratorComma extends Decorator {

    public DecoratorComma(InterfaceComponent interfaceComponent) {
        super(interfaceComponent);
    }

    @Override
    public void doOperation() {
        System.out.println(",");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New Comma Operation");
    }
}
