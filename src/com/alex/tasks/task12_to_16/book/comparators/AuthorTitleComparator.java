package com.alex.tasks.task12_to_16.book.comparators;

import com.alex.tasks.task12_to_16.book.books.Book;

import java.util.Comparator;

public class AuthorTitleComparator implements Comparator<Book> {

    private final Comparator<Book> comparator;

    public AuthorTitleComparator() {
        this.comparator = new AuthorComparator().thenComparing(new TitleComparator());
    }

    @Override
    public int compare(Book book1, Book book2) {
        return comparator.compare(book1, book2);
    }
}
