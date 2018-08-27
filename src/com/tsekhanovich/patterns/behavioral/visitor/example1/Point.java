package com.tsekhanovich.patterns.behavioral.visitor.example1;

public abstract class Point {

    public abstract void accept(Visitor v);

    private double metric = -1;

    public double getMetric() {
        return metric;
    }

    public void setMetric(double metric) {
        this.metric = metric;
    }
}
