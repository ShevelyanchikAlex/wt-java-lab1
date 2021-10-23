package com.alex.tasks.task9.entity;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Ball> ballList;

    public Basket() {
        this.ballList = new ArrayList<>();
    }

    public void addBall(Ball ball) {
        ballList.add(ball);
    }

    public boolean removeBall(Ball ball) {
        return ballList.remove(ball);
    }

    public List<Ball> getBallList() {
        return ballList;
    }

    public int getWeightOfBallList() {
        int weight = 0;
        for (Ball ball : ballList) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int getCountOfBlueBalls() {
        int count = 0;
        for (Ball ball : ballList) {
            if (ball.getColor() == Color.BLUE) {
                count++;
            }
        }
        return count;
    }
}
