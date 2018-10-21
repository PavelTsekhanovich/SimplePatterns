package com.tsekhanovich.patterns.generative.factory.example2;

import com.tsekhanovich.patterns.generative.factory.example2.factory.Dialog;
import com.tsekhanovich.patterns.generative.factory.example2.factory.HtmlDialog;
import com.tsekhanovich.patterns.generative.factory.example2.factory.WindowsDialog;

public class Main {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
