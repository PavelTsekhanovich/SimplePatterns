package com.tsekhanovich.patterns.generative.abstractfactory.example2.factories;

import com.tsekhanovich.patterns.generative.abstractfactory.example2.buttons.Button;
import com.tsekhanovich.patterns.generative.abstractfactory.example2.buttons.WindowsButton;
import com.tsekhanovich.patterns.generative.abstractfactory.example2.checkboxes.Checkbox;
import com.tsekhanovich.patterns.generative.abstractfactory.example2.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}