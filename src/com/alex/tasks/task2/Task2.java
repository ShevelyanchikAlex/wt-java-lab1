package com.alex.tasks.task2;

import com.alex.tasks.services.reader.impl.ReaderImpl;
import com.alex.tasks.services.reader.interfaces.Reader;
import com.alex.tasks.task2.area.Area;
import com.alex.tasks.task2.area.Rectangle;
import com.alex.tasks.services.writer.impl.WriterImpl;
import com.alex.tasks.services.writer.interfaces.Writer;
import com.alex.tasks.task2.point.Point;

import java.util.ArrayList;

public class Task2 {

    public static void main(String[] args) {
        Reader reader = new ReaderImpl();
        Writer writer = new WriterImpl();

        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(new Point(-4, 0), 8, 5));
        rectangles.add(new Rectangle(new Point(-6, -3), 12, 3));
        Area area = new Area(rectangles);

        writer.writeLn(String.valueOf(area.contains(new Point(reader.readDouble(), reader.readDouble()))));
    }


}

