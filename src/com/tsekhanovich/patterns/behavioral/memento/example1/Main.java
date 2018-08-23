package com.tsekhanovich.patterns.behavioral.memento.example1;

/**
 * @author Pavel Tsekhamovich 23.08.2018
 * <p>
 * Memento
 * Allows you to take a snapshot of the state of the object,
 * without revealing the details of its implementation,
 * you can later restore the past state of the object using this snapshot.
 *
 * + Does not violate the encapsulation of the source object.
 * + Simplifies the structure of the source object. He does not need to store version history its state.
 *
 * - Requires a lot of memory, if clients too often create snapshots can entail additional memory
 * costs if objects that store history do not release resources occupied by outdated snapshots.
 */

public class Main {

    private static final String STATE = "State is : ";

    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("on");
        System.out.println(STATE + originator.getState());
        caretaker.setMemento(originator.saveState());

        originator.setState("off");
        System.out.println(STATE + originator.getState());

        originator.restoreState(caretaker.getMemento());
        System.out.println(STATE + originator.getState());
    }
}