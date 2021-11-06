package com.company;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Stephen", "King");
        Book book1 = new Book(author1, "IT", 1989);
        System.out.println(book1.getAuthorName() + " " + book1.getAuthorSurname() + " " + book1.getPublishingYear());
        book1.setPublishingYear(1950);
        System.out.println(book1.getPublishingYear());
        Author author2 = new Author("Andzhey", "Sapkovskiy");
        Book book2 = new Book(author2, "Last wish", 1993);
        Author author3 = new Author("Stan", "Lee");
        Book book3 = new Book(author3, "Spider-Man", 1963);
        Author author4 = new Author("Arthur", "Konan Doyle");
        Book book4 = new Book(author4, "Sherlock Holmes", 1880);


        Library library = new Library(4);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.printBooks();
        library.information(book1.getBookName());
        library.newPublishingYear(book4.getBookName(), 1998);
        library.information(book4.getBookName());


    }
}
