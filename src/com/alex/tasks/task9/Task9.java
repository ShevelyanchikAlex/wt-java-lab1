package com.alex.tasks.task9;

import com.alex.tasks.task9.entity.Ball;
import com.alex.tasks.task9.entity.Basket;
import com.alex.tasks.task9.entity.Color;
import com.alex.tasks.service.writer.impl.WriterImpl;
import com.alex.tasks.service.writer.Writer;

public class Task9 {

    public static void main(String[] args) {
        Writer writer = WriterImpl.getInstance();

        Basket basket = new Basket();
        basket.addBall(new Ball(10, Color.GREEN));
        basket.addBall(new Ball(5, Color.BLUE));
        basket.addBall(new Ball(3, Color.RED));
        basket.addBall(new Ball(11, Color.BLUE));

        writer.writeLn("Weight of balls in basket: " + basket.getWeightOfBallList());
        writer.writeLn("Count of blue balls: " + basket.getCountOfBlueBalls());
    }
}
