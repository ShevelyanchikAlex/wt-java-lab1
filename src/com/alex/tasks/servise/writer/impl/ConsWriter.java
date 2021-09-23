package com.alex.tasks.servise.writer.impl;

import com.alex.tasks.servise.writer.interfaces.Writer;

public class ConsWriter implements Writer {
    @Override
    public void write(String str) {
        System.out.print(str);
    }

    @Override
    public void writeLn(String str) {
        System.out.println(str);
    }

    @Override
    public void writeF(String format, Object... args) {
        System.out.printf(format, args);
    }
}
