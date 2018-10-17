package com.tsekhanovich.patterns.structural.proxy;

public class Main {

    public static void main(String[] args) {
        IMath p = new MathProxy();

        System.out.println(p.add(2, 4));
        System.out.println(p.sub(2, 4));
        System.out.println(p.mul(2, 4));
        System.out.println(p.div(2, 4));
    }
}