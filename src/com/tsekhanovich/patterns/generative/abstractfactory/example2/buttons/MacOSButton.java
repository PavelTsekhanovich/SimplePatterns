package com.tsekhanovich.patterns.generative.abstractfactory.example2.buttons;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}