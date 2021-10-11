package com.alex.tasks.service.writer.impl;

import com.alex.tasks.service.writer.Writer;

public class WriterImpl implements Writer {
    private static WriterImpl instance;

    private WriterImpl() {
    }

    public static WriterImpl getInstance() {
        if (instance == null) {
            instance = new WriterImpl();
        }
        return instance;
    }

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
