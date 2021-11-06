package com.company;

import java.util.Objects;

public class Book {
    private final Author author;
    private final String bookName;
    private int publishingYear;

    public Book(Author author, String bookName, int publishingYear) {
        this.author = author;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {

        return this.bookName;
    }

    public int getPublishingYear() {

        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {

        this.publishingYear = publishingYear;
    }

    public String getAuthorName() {

        return this.author.getName();
    }

    public String getAuthorSurname() {

        return this.author.getSurName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookName);
    }

    @Override
    public String toString() {
        return "Book: " + bookName + " by " + author.toString();
    }
}
