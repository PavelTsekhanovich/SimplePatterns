package com.tsekhanovich.patterns.behavioral.mediator.example1;

/**
 * @author Pavel Tsekhanovich 23.08.2018
 * <p>
 * Mediator
 * Reduces the connectivity of a set of classes with each other,
 * due to the movement of these links to one class-mediator.
 * <p>
 * + Eliminates dependencies between components.
 * + Simplifies the interaction between components.
 * + Centralizes management in one place.
 * <p>
 * - The middleman can swell up a lot.
 */

public class Main {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague1 c1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 c2 = new ConcreteColleague2(mediator);

        mediator.setColleague1(c1);
        mediator.setColleague2(c2);

        c1.send("How are you?");
        c2.send("Fine, thanks");
    }
}
