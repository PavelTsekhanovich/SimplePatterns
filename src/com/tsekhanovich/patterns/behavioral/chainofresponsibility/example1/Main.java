package com.tsekhanovich.patterns.behavioral.chainofresponsibility.example1;

/**
 * @author Pavel Tsekhanovich 21.08.18
 *
 * Chain of responsibility
 * Associates recipient objects in a chain and passes a
 * request along this chain until it is processed.
 * Eliminates the rigid binding of the sender of the request to its recipient,
 * allowing you to build a chain of different processors dynamically.
 *
 * + Reduces the dependency between the client and the handlers.
 * + Observes the principle of the sole responsibility of the class.
 * + Observes the principle of openness / closure.
 *
 * - The request can remain unprocessed.
 */

public class Main {

    public static void main(String[] args) {

        Logger logger0, logger1, logger2;

        logger0 = new StdoutLogger(Logger.DEBUG);
        logger1 = logger0.setNext(new EmailLogger(Logger.NOTICE));
        logger2 = logger1.setNext(new StderrLogger(Logger.ERR));

        // Handled by StdoutLogger
        logger0.message("Entering function y.", Logger.DEBUG);

        // Handled by StdoutLogger and EmailLogger
        logger0.message("Step1 completed.", Logger.NOTICE);

        // Handled by all three loggers
        logger0.message("An error has occurred.", Logger.ERR);
    }
}