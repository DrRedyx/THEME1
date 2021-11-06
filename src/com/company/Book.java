package com.company;

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
        return author.getName();
    }

    public String getAuthorSurname() {
        return author.getSurName();
    }

}
