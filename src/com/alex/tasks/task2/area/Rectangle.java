package com.alex.tasks.task2.area;

public class Rectangle {
    private final double xMin;
    private final double yMax;
    private final double xMax;
    private final double yMin;

    public Rectangle(double xMin, double yMax, double xMax, double yMin) {
        this.xMin = xMin;
        this.yMax = yMax;
        this.xMax = xMax;
        this.yMin = yMin;
    }

    public boolean containsPoint(double x, double y) {
        return (x >= xMin && x <= xMax && y >= yMin && y <= yMax);
    }
}
