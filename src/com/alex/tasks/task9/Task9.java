package com.alex.tasks.task9;

import com.alex.tasks.task9.basketball.equipment.Ball;
import com.alex.tasks.task9.basketball.equipment.Basket;
import com.alex.tasks.task9.enums.Color;
import com.alex.tasks.servise.writer.impl.ConsWriter;
import com.alex.tasks.servise.writer.interfaces.Writer;

public class Task9 {

    public static void main(String[] args) {
        Writer writer = new ConsWriter();

        Basket basket = new Basket();
        basket.addBall(new Ball(10, Color.GREEN));
        basket.addBall(new Ball(5, Color.BLUE));
        basket.addBall(new Ball(3, Color.RED));
        basket.addBall(new Ball(11, Color.BLUE));

        writer.writeLn("Weight of balls in basket: " + basket.getWeightOfBallList());
        writer.writeLn("Count of blue balls: " + basket.getCountOfBlueBalls());
    }
}
