package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
            Author author1 = new Author("Stephen", "King");
            Author author5 = new Author("Stephen", "King");
            Book book1 = new Book(author1, "IT", 1989);
            Book book5 = new Book(author1, "IT", 1989);
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

            System.out.println("Author copies equal: " + author1.equals(author5));
            System.out.println("Author copies equal by hashCode: " + (author1.hashCode() == author5.hashCode()));
            System.out.println("Authors equal: " + author1.equals(author2));
            System.out.println("Authors equal by hashCode: " + (author1.hashCode() == author2.hashCode()));
            System.out.println("========================================");
            System.out.println("Book copies equal: " + book1.equals(book5));
            System.out.println("Book copies equal by hashCode: " + (book1.hashCode() == book5.hashCode()));
            System.out.println("Books equal: " + book1.equals(book3));
            System.out.println("Books equal by hashCode: " + (book1.hashCode() == book3.hashCode()));
            System.out.println("========================================");
            System.out.println(author2);
            System.out.println(book2);
            System.out.println("========================================");
            System.out.println(library);
    }
}
