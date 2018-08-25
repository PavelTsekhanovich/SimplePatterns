package com.tsekhanovich.patterns.behavioral.state.example1;

public abstract class State {

    public Player player;

    public State(Player player) {
        this.player = player;
    }

    public abstract String onLock();

    public abstract String onPlay();

    public abstract String onNext();

    public abstract String onPrevious();

}
