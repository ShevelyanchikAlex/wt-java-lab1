package com.alex.tasks.task1;

import com.alex.tasks.services.reader.impl.ReaderImpl;
import com.alex.tasks.services.reader.interfaces.Reader;
import com.alex.tasks.services.writer.impl.WriterImpl;
import com.alex.tasks.services.writer.interfaces.Writer;

public class Task1 {

    public static void main(String[] args) {
        Reader reader = new ReaderImpl();
        Writer writer = new WriterImpl();

        double x = reader.readDouble();
        double y = reader.readDouble();
        writer.writeLn("Result: " + calculateExpression(x, y));
    }

    private static double calculateExpression(double x, double y) {
        double result = 1 + Math.pow(Math.sin(x + y), 2);
        result = result / (2 + Math.abs(x - (2 * x) / (1 + x * x * y * y))) + x;
        return result;
    }

}
