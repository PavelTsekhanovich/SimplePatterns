package com.tsekhanovich.patterns.structural.adapter.example1;

/**
 * @author Pavel Tsekhanovich 15.10.2018
 *
 * adapter
 * Allows classes to work with incompatible interfaces.
 *
 * + Removes the relationship between different layers of the program.
 * + Simple undo and redo commands.
 * + Delayed start of commands.
 * + Combination of commands.
 * + Observes the principle of openness / closure.
 *
 * - Complicates the code of the program at the expense of additional classes.
 */
public class Main {

    public static void main(String[] args) {
        Chief chief = new ChiefAdapter();
        Object key = chief.makeDinner();
    }
}
