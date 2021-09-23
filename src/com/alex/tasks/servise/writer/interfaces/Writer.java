package com.alex.tasks.servise.writer.interfaces;

public interface Writer {
    public void write(String str);

    public void writeLn(String str);

    public void writeF(String format, Object... args);
}
