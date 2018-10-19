package com.tsekhanovich.patterns.generative.abstractfactory.example2.factories;

import com.tsekhanovich.patterns.generative.abstractfactory.example2.buttons.Button;
import com.tsekhanovich.patterns.generative.abstractfactory.example2.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();
}