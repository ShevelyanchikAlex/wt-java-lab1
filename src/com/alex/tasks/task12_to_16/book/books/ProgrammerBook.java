package com.alex.tasks.task12_to_16.book.books;

import com.alex.tasks.task12_to_16.isbn.ISBN;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price,
                          ISBN isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ProgrammerBook programmerBook = (ProgrammerBook) obj;
        return level == programmerBook.level && language.equals(programmerBook.language) && super.equals(obj);
    }

    @Override
    public int hashCode() {
        return (31 * language.hashCode() + 31 * level + super.hashCode());
    }


    @Override
    public String toString() {
        return "ProgrammerBook{" +
                "language= " + language +
                ",level= " + level +
                '}';
    }
}
