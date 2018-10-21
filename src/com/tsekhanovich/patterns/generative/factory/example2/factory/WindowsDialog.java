package com.tsekhanovich.patterns.generative.factory.example2.factory;

import com.tsekhanovich.patterns.generative.factory.example2.Button;
import com.tsekhanovich.patterns.generative.factory.example2.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}