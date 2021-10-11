package com.alex.tasks.task1;

import com.alex.tasks.service.reader.impl.ReaderImpl;
import com.alex.tasks.service.reader.Reader;
import com.alex.tasks.service.writer.impl.WriterImpl;
import com.alex.tasks.service.writer.Writer;

public class Task1 {

    public static void main(String[] args) {
        Reader reader = ReaderImpl.getInstance();
        Writer writer = WriterImpl.getInstance();

        writer.writeLn("Enter x: ");
        double x = reader.readDouble();
        writer.writeLn("Enter y: ");
        double y = reader.readDouble();

        writer.writeLn("Result: " + calculateExpression(x, y));
    }

    private static double calculateExpression(double x, double y) {
        double result = 1 + Math.pow(Math.sin(x + y), 2);
        result = result / (2 + Math.abs(x - (2 * x) / (1 + x * x * y * y))) + x;
        return result;
    }

}
