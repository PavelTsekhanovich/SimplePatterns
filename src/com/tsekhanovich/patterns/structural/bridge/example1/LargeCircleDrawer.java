package com.tsekhanovich.patterns.structural.bridge.example1;

public class LargeCircleDrawer implements Drawer {

    private static final int RADIUS_MULTIPLIER = 10;

    public void drawCircle(int x, int y, int radius) {
        System.out.println("Large circle center = " + x + "," + y + " radius = " + radius * RADIUS_MULTIPLIER);
    }
}
