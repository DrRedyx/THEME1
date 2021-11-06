package com.company;

public class Library {
    private final Book[] books;

    public Library(int length) {
        books = new Book[length];
    }


    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public void printBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getAuthorName() + " " + books[i].getAuthorSurname() + ":" + books[i].getBookName() + ":" + books[i].getPublishingYear());
        }
    }

    public void information(String bookName) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookName().equals(bookName)) {
                System.out.println(books[i].getBookName() + " by " + books[i].getAuthorName() + " " + books[i].getAuthorSurname() + " was published in " + books[i].getPublishingYear());
            }
        }
    }

    public void newPublishingYear(String bookName, int newPublishingYear) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookName().equals(bookName)) {
                books[i].setPublishingYear(newPublishingYear);
            }
        }
    }
}
