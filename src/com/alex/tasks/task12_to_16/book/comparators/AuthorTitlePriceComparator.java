package com.alex.tasks.task12_to_16.book.comparators;

import com.alex.tasks.task12_to_16.book.books.Book;

import java.util.Comparator;

public class AuthorTitlePriceComparator implements Comparator<Book> {

    private final Comparator<Book> comparator;

    public AuthorTitlePriceComparator(Comparator<Book> comparator) {
        this.comparator = new AuthorTitleComparator().thenComparing(new PriceComparator());
    }

    @Override
    public int compare(Book book1, Book book2) {
        return comparator.compare(book1, book2);
    }
}
