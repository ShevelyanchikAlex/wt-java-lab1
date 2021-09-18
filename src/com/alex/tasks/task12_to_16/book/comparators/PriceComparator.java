package com.alex.tasks.task12_to_16.book.comparators;

import com.alex.tasks.task12_to_16.book.books.Book;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getPrice() - book2.getPrice();
    }
}
