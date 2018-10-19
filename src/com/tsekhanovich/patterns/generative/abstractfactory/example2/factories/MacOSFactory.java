package com.tsekhanovich.patterns.generative.abstractfactory.example2.factories;

import com.tsekhanovich.patterns.generative.abstractfactory.example2.buttons.Button;
import com.tsekhanovich.patterns.generative.abstractfactory.example2.buttons.MacOSButton;
import com.tsekhanovich.patterns.generative.abstractfactory.example2.checkboxes.Checkbox;
import com.tsekhanovich.patterns.generative.abstractfactory.example2.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}