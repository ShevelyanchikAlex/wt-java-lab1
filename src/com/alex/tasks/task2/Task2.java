package com.alex.tasks.task2;

import com.alex.tasks.service.reader.impl.ReaderImpl;
import com.alex.tasks.service.reader.Reader;
import com.alex.tasks.task2.entity.Area;
import com.alex.tasks.task2.entity.Rectangle;
import com.alex.tasks.service.writer.impl.WriterImpl;
import com.alex.tasks.service.writer.Writer;
import com.alex.tasks.task2.entity.Point;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        Reader reader = ReaderImpl.getInstance();
        Writer writer = WriterImpl.getInstance();

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(new Point(-4, 0), 8, 5));
        rectangles.add(new Rectangle(new Point(-6, -3), 12, 3));
        Area area = new Area(rectangles);

        writer.writeLn("Enter x coordinate: ");
        double x = reader.readDouble();
        writer.writeLn("Enter y coordinate: ");
        double y = reader.readDouble();

        writer.writeLn(String.valueOf(area.contains(new Point(x, y))));
    }


}

