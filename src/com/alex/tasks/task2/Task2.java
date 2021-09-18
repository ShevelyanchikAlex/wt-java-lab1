package com.alex.tasks.task2;

import com.alex.tasks.servise.reader.impl.ConsReader;
import com.alex.tasks.servise.reader.interfaces.Reader;
import com.alex.tasks.task2.area.Area;
import com.alex.tasks.task2.area.Rectangle;
import com.alex.tasks.servise.writer.impl.ConsWriter;
import com.alex.tasks.servise.writer.interfaces.Writer;

import java.util.ArrayList;

public class Task2 {

    public static void main(String[] args) {
        Reader reader = new ConsReader();
        Writer writer = new ConsWriter();
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(-4, 5, 4, 0));
        rectangles.add(new Rectangle(-6, 0, 6, -3));
        Area area = new Area(rectangles);

        writer.writeLn("Input x: ");
        double x = reader.readDouble();

        writer.writeLn("Input y: ");
        double y = reader.readDouble();

        writer.writeLn(String.valueOf(area.contains(x, y)));
    }


}

