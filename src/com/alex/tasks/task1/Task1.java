package com.alex.tasks.task1;

import com.alex.tasks.servise.reader.impl.ConsReader;
import com.alex.tasks.servise.reader.interfaces.Reader;
import com.alex.tasks.servise.writer.impl.ConsWriter;
import com.alex.tasks.servise.writer.interfaces.Writer;

public class Task1 {

    public static void main(String[] args) {
        Reader reader = new ConsReader();
        Writer writer = new ConsWriter();

        writer.writeLn("Input x: ");
        double x = reader.readDouble();

        writer.writeLn("Input y: ");
        double y = reader.readDouble();

        writer.writeLn("Result: " + calculateExpression(x, y));
    }

    private static double calculateExpression(double x, double y) {
        double result = 1 + Math.pow(Math.sin(x + y), 2);
        result = result / (2 + Math.abs(x - (2 * x) / (1 + x * x * y * y))) + x;
        return result;
    }

}
