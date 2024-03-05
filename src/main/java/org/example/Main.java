package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", true);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084", true);
        Book book3 = new Book("1984", "George Orwell", "9780451524935", true);


        try {
            library.addBook(book1);
            library.addBook(book2);
            library.addBook(book3);
            System.out.println("Books added to the library.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Searching for books by author 'George Orwell':");
        List<Book> searchResult = library.searchBooks("George Orwell");
        for (Book book : searchResult) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }


        String checkoutISBN = "9780743273565";
        try {
            library.checkOutBook(checkoutISBN);
            System.out.println("Book with ISBN " + checkoutISBN + " checked out successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        String returnISBN = "9780743273565";
        try {
            library.returnBook(returnISBN);
            System.out.println("Book with ISBN " + returnISBN + " returned successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}