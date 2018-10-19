package com.tsekhanovich.patterns.generative.abstractfactory.example2.app;

import com.tsekhanovich.patterns.generative.abstractfactory.example2.buttons.Button;
import com.tsekhanovich.patterns.generative.abstractfactory.example2.checkboxes.Checkbox;
import com.tsekhanovich.patterns.generative.abstractfactory.example2.factories.GUIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}