package com.company;

public class Library {
    private final Book[] library;

    public Library(int length) {
        library = new Book[length];
    }


    public void addBook(Book book) {
        int bookNumber;
        for (bookNumber = 0; bookNumber < library.length; bookNumber++) {
            if (library[bookNumber] == null) {
                library[bookNumber] = book;
                    break;
            }
        }
        if (bookNumber == library.length) {
            throw new RuntimeException("Библиотека переполнена, возьмите книгу назад.");
        }
    }

    public void printBooks() {
        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i].getAuthor().getName() + " " + library[i].getAuthor().getSurName() + ":" + library[i].getBookName() + ":" + library[i].getPublishingYear());
        }
    }

    public void printBookInfo(String bookName) {
        for (int i = 0; i < library.length; i++) {
            if (library[i].getBookName().equals(bookName)) {
                System.out.println(library[i].getBookName() + " by " + library[i].getAuthor().getName() + " " + library[i].getAuthor().getSurName() + " was published in " + library[i].getPublishingYear());
            }
        }
    }

    public void changePublishingYear(String bookName, int newPublishingYear) {
        for (int i = 0; i < library.length; i++) {
            if (library[i].getBookName().equals(bookName)) {
                library[i].setPublishingYear(newPublishingYear);
            }
        }
    }
}
