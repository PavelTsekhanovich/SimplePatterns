package com.tsekhanovich.patterns.behavioral.strategy.example1;

public class ConcreteStrategySub implements Strategy {

    public int execute(int a, int b) {
        return a - b;
    }
}
