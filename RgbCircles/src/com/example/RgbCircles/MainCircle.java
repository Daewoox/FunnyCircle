package com.example.RgbCircles;

public class MainCircle {
    public static final int INT_RADIUS = 50;
    private int x;
    private int y;
    private int radius;

    public MainCircle(int x,int y) {
        this.x = x;
        this.y=y;
        radius= INT_RADIUS;
    }
    public MainCircle(int x,int y,int radius) {
        this.x = x;
        this.y=y;
        this.radius= radius;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }
}
