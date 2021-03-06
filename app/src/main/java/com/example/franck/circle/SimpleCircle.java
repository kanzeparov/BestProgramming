package com.example.franck.circle;

/**
 * Created by Franck on 11.11.2017.
 */

public class SimpleCircle {

    protected int x;
    protected int y;
    protected int radius;
    private int color;

    public SimpleCircle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void setColor(int color) {
        this.color = color;
    }
    public int getX() { return x; }
    public int getY() {
        return y;
    }
    public int getRadius() {
        return radius;
    }
    public int getColor() {
        return color;
    }

    public SimpleCircle getCircleArea() {
        return new SimpleCircle(x, y, radius * 3);
    }

    public boolean isIntersect(SimpleCircle circle) {
        return radius + circle.radius >= Math.sqrt(Math.pow(x - circle.x, 2) + Math.pow(y - circle.y, 2));
    }
}