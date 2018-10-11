package com.tsekhanovich.patterns.behavioral.state.example1;

/**
 * @author Pavel Tsekhamovich 25.08.2018
 *
 * State
 * Allows an object to change its behavior depending on its state.
 *
 * + Eliminates many large conditional operators.
 * + Concentrates in one place the code associated with a certain state.
 * + Simplifies the context code.
 *
 * - Can unreasonably complicate the code if there are few states and they rarely change.
 */

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
