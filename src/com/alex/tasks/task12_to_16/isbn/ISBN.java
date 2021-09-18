package com.alex.tasks.task12_to_16.isbn;

public class ISBN implements Comparable<ISBN> {
    private final int bookNumber;

    public ISBN(String bookNumberStr) {
        bookNumber = Integer.parseInt(bookNumberStr.replace("-", ""));
    }

    @Override
    public int compareTo(ISBN isbn) {
        return bookNumber - isbn.bookNumber;
    }
}
