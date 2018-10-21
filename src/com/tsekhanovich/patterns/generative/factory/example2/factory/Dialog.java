package com.tsekhanovich.patterns.generative.factory.example2.factory;

import com.tsekhanovich.patterns.generative.factory.example2.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}