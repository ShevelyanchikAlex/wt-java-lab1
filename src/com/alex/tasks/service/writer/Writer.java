package com.alex.tasks.service.writer;

public interface Writer {
    void write(String str);

    void writeLn(String str);

    void writeF(String format, Object... args);
}
