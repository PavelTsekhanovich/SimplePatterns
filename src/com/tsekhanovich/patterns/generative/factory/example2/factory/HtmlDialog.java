package com.tsekhanovich.patterns.generative.factory.example2.factory;

import com.tsekhanovich.patterns.generative.factory.example2.Button;
import com.tsekhanovich.patterns.generative.factory.example2.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}