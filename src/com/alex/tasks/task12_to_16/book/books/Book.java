package com.alex.tasks.task12_to_16.book.books;

import com.alex.tasks.task12_to_16.isbn.ISBN;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private ISBN isbn;


    public Book(String title, String author, int price, ISBN isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public static int getEdition() {
        return edition;
    }

    public ISBN getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return price == book.price && title.equals(book.title) &&
                author.equals(book.author) && isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return (31 * title.hashCode() + 31 * author.hashCode() + 31 * price + 31 * isbn.hashCode());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title= " + title +
                ",author= " + author +
                ",price= " + price +
                ",ISBN= " + isbn +
                '}';
    }

    @Override
    protected Book clone() throws CloneNotSupportedException {
        Book clonedBook = (Book) super.clone();
        clonedBook.isbn = isbn.clone();
        return clonedBook;
    }

    @Override
    public int compareTo(Book book) {
        return isbn.compareTo(book.isbn);
    }
}
