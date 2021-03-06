package com.tsekhanovich.patterns.structural.bridge.example1;

public class SmallCircleDrawer implements Drawer {

    private static final double RADIUS_MULTIPLIER = 0.25;

    public void drawCircle(int x, int y, int radius) {
        System.out.println("Small circle center = " + x + "," + y + " radius = " + radius * RADIUS_MULTIPLIER);
    }
}
