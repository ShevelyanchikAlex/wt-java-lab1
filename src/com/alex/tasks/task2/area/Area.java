package com.alex.tasks.task2.area;

import java.util.ArrayList;

public class Area {
    private final ArrayList<Rectangle> rectangles;

    public Area(ArrayList<Rectangle> rectangles) {
        this.rectangles = rectangles;
    }

    public boolean contains(double x, double y) {
        for (Rectangle rectangle : rectangles) {
            if (rectangle.containsPoint(x, y)) {
                return true;
            }
        }
        return false;
    }
}
