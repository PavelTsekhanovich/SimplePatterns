package com.tsekhanovich.patterns.behavioral.strategy.example1;

/**
 * @author Pavel Tsekhanovich 25.08.2018
 *
 * Strategy
 * Defines a family of similar algorithms and places each of them
 * in its own class, after which, the algorithms can be interchanged right at runtime.
 *
 * + Hot swapping algorithms on the fly.
 * + Escape from inheritance to delegation.
 * + Hides dangerous / redundant algorithm data from the client.
 *
 * - Complicates the program at the expense of additional classes.
 * - The client should know the difference between the strategies in order to choose the appropriate.
 */

public class StrategyExample {

    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new ConcreteStrategyAdd());
        int resultA = context.executeStrategy(3, 4);

        context.setStrategy(new ConcreteStrategySub());
        int resultB = context.executeStrategy(3, 4);

        context.setStrategy(new ConcreteStrategyMul());
        int resultC = context.executeStrategy(3, 4);

        System.out.println("Result A : " + resultA);
        System.out.println("Result B : " + resultB);
        System.out.println("Result C : " + resultC);
    }
}