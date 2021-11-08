package com.company;

public class Library {
    private final Book[] books;

    public Library(int length) {
        books = new Book[length];
    }


    public void addBook(Book book) {
        int i;
        for (i = 0; i < books.length; i++) {
            if (books[i] == null) {
                    books[i] = book;
                    break;
            }
        }
        if (i == books.length) {
            throw new RuntimeException("Библиотека переполнена, возьмите книгу назад.");
        }
    }

    public void printBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getAuthor().getName() + " " + books[i].getAuthor().getSurName() + ":" + books[i].getBookName() + ":" + books[i].getPublishingYear());
        }
    }

    public void printBookInfo(String bookName) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookName().equals(bookName)) {
                System.out.println(books[i].getBookName() + " by " + books[i].getAuthor().getName() + " " + books[i].getAuthor().getSurName() + " was published in " + books[i].getPublishingYear());
            }
        }
    }

    public void changePublishingYear(String bookName, int newPublishingYear) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookName().equals(bookName)) {
                books[i].setPublishingYear(newPublishingYear);
            }
        }
    }
}
