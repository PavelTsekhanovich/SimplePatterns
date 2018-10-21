package com.tsekhanovich.patterns.generative.prototype.example1;

public class Cookie implements Cloneable {

    protected int weight;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Cookie copy = (Cookie) super.clone();
        return copy;
    }
}
