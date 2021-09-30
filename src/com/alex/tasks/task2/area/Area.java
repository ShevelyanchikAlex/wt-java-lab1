package com.alex.tasks.task2.area;

import com.alex.tasks.task2.point.Point;

import java.util.ArrayList;

public class Area {
    private final ArrayList<Rectangle> rectangles;

    public Area(ArrayList<Rectangle> rectangles) {
        this.rectangles = rectangles;
    }

    public boolean contains(Point point) {
        for (Rectangle rectangle : rectangles) {
            if (rectangle.containsPoint(point.getX(), point.getY())) {
                return true;
            }
        }
        return false;
    }
}
