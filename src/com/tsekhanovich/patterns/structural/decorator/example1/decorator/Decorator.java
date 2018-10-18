package com.tsekhanovich.patterns.structural.decorator.example1.decorator;

import com.tsekhanovich.patterns.structural.decorator.example1.component.InterfaceComponent;

public abstract class Decorator implements InterfaceComponent {

    protected InterfaceComponent interfaceComponent;

    public Decorator(InterfaceComponent interfaceComponent) {
        this.interfaceComponent = interfaceComponent;
    }

    public void doOperation() {
        interfaceComponent.doOperation();
    }

    public void newOperation() {
        System.out.println("Do nothing");
    }
}
