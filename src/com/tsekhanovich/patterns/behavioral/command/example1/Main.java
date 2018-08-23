package com.tsekhanovich.patterns.behavioral.command.example1;

/**
 * @author Pavel Tsekhanovich 22.08.2018
 * <p>
 * Command
 * Transforms an operation into an object. This allows you to transfer operations as arguments
 * when calling methods, put operations in the queue, log them,
 * and also support the cancellation of operations.
 * <p>
 * + Removes the relationship between different layers of the program.
 * + Simple undo and redo commands.
 * + Delayed start of commands.
 * + Combination of commands.
 * + Observes the principle of openness / closure.
 * <p>
 * - Complicates the code of the program at the expense of additional classes.
 */

public class Main {

    public static void main(String[] args) {

        Light light = new Light();
        Command switchUp = new TurnOnLightCommand(light);
        Command switchDown = new TurnOffLightCommand(light);

        Switch s = new Switch(switchUp, switchDown);

        s.flipUp();
        s.flipDown();
    }
}