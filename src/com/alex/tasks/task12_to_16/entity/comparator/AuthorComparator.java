package com.alex.tasks.task12_to_16.entity.comparator;

import com.alex.tasks.task12_to_16.entity.Book;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getAuthor().compareTo(book2.getAuthor());
    }
}
