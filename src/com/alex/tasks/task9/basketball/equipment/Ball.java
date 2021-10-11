package com.alex.tasks.task9.basketball.equipment;

import com.alex.tasks.task9.color_enum.Color;

public class Ball {
    private final int weight;
    private final Color color;

    public Ball(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }
}
