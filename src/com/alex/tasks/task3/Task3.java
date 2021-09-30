package com.alex.tasks.task3;

import com.alex.tasks.services.reader.impl.ReaderImpl;
import com.alex.tasks.services.reader.interfaces.Reader;
import com.alex.tasks.services.writer.impl.WriterImpl;
import com.alex.tasks.services.writer.interfaces.Writer;


public class Task3 {

    public static void main(String[] args) {
        Reader reader = new ReaderImpl();
        Writer writer = new WriterImpl();

        double a = reader.readDouble();
        double b = reader.readDouble();
        double h = reader.readDouble();

        printTable(writer, a, b, h);
    }

    private static void printTable(Writer writer, double a, double b, double h) {
        final String line = "-------------------------";
        writer.writeLn(line);
        writer.writeF("|\t%4s\t|\t%5s\t|\n", 'x', 'y');
        writer.writeLn(line);
        for (double i = a; i <= b; i += h) {
            writer.writeF("|\t%4.1f\t|\t%4.3f\t|\n", i, Math.tan(i));
        }
        writer.writeLn(line);
    }

}
