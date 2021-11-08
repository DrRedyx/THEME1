package com.company;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Stephen", "King");
        Book book1 = new Book(author1, "IT", 1989);
        System.out.println(book1.getAuthor().getName() + " " + book1.getAuthor().getSurName() + " " + book1.getPublishingYear());
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
        library.printBookInfo(book1.getBookName());
        library.changePublishingYear(book4.getBookName(), 1998);
        library.printBookInfo(book4.getBookName());


    }
}
