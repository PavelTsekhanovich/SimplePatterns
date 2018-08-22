package com.tsekhanovich.patterns.behavioral.chainofresponsibility.example1;

public class StderrLogger extends Logger {

    public StderrLogger(int mask) {
        this.mask = mask;
    }

    @Override
    protected void writeMessage(String msg) {
        System.out.println("Sending to stderr: " + msg);
    }
}
