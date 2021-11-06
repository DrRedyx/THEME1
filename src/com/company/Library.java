package com.company;

public class Library {
    private final Book[] books;

    public Library (int length) {

        this.books = new Book[length];
    }

    public void addBook(Book book) {
        for(int i = 0; i < this.books.length; ++i) {
            if (this.books[i] == null) {
                this.books[i] = book;
                break;
            }
        }

    }

    public void printBooks() {
        for(int i = 0; i < this.books.length; ++i) {
            System.out.println(this.books[i].getAuthorName() + " " + this.books[i].getAuthorSurname() + ":" + this.books[i].getBookName() + ":" + this.books[i].getPublishingYear());
        }

    }

    public void information(String bookName) {
        for(int i = 0; i < this.books.length; ++i) {
            if (this.books[i].getBookName().equals(bookName)) {
                System.out.println(this.books[i].getBookName() + " by " + this.books[i].getAuthorName() + " " + this.books[i].getAuthorSurname() + " was published in " + this.books[i].getPublishingYear());
            }
        }

    }

    public void newPublishingYear(String bookName, int newPublishingYear) {
        for(int i = 0; i < this.books.length; ++i) {
            if (this.books[i].getBookName().equals(bookName)) {
                this.books[i].setPublishingYear(newPublishingYear);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder book = new StringBuilder();
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                book.append(books[i].toString() + "\n");
            }
        }
        return book.toString();
    }
}
