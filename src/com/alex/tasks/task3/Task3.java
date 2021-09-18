package com.alex.tasks.task3;

import com.alex.tasks.servise.reader.impl.ConsReader;
import com.alex.tasks.servise.reader.interfaces.Reader;
import com.alex.tasks.servise.writer.impl.ConsWriter;
import com.alex.tasks.servise.writer.interfaces.Writer;


public class Task3 {

    public static void main(String[] args) {
        Reader reader = new ConsReader();
        Writer writer = new ConsWriter();

        writer.writeLn("Input a: ");
        double a = reader.readDouble();

        writer.writeLn("Input b: ");
        double b = reader.readDouble();

        writer.writeLn("Input h: ");
        double h = reader.readDouble();

        printTable(writer, a, b, h);
    }

    private static void printTable(Writer writer, double a, double b, double h) {
        for (double i = a; i <= b; i += h) {
            writer.writeLn(i + " | " + Math.tan(i));
        }
    }

}
