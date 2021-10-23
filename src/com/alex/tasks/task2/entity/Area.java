package com.alex.tasks.task2.entity;

import java.util.List;

public class Area {
    private final List<Rectangle> rectangles;

    public Area(List<Rectangle> rectangles) {
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
