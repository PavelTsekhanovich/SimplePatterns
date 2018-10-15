package com.tsekhanovich.patterns.structural.adapter.example2.adapter;

import com.tsekhanovich.patterns.structural.adapter.example2.round.RoundPeg;
import com.tsekhanovich.patterns.structural.adapter.example2.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // calculate the minimum radius into which this peg will crawl
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}