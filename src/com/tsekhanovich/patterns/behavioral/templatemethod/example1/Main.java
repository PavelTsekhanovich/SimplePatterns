package com.tsekhanovich.patterns.behavioral.templatemethod.example1;

/**
 * @author Pavel Tsekhanovich 26.08.2018
 *
 * Templatemethod
 * Defines the skeleton of the algorithm, shifting responsibility for some of its steps to subclasses.
 * Allows subclasses to redefine the steps of the algorithm without changing its overall structure.
 *
 * + Facilitates code reuse.
 *
 * - The skeleton of the existing algorithm.
 */
public class Main {

    public static void main(String[] args) {

        final GameCode gameCode = GameCode.CHESS;

        Game game;

        switch (gameCode) {
            case CHESS:
                game = new Chess();
                break;
            case MONOPOLY:
                game = new Monopoly();
                break;
            default:
                throw new IllegalStateException();
        }

        game.playOneGame(2);
        System.out.println(game);
    }
}
