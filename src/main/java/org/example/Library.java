package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library that manages books.
 */
public class Library {
    /** List of books in the library. */
    private List<Book> books;

    /** Constructs a new Library object. */
    public Library() {
        this.books = new ArrayList<Book>();
    }

    /**
     * Adds a new book to the library.
     *
     * @param book The book to be added.
     * @throws IllegalArgumentException If the book is null.
     */
    public void addBook(Book book) throws IllegalArgumentException {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null.");
        }
        books.add(book);
    }

    /**
     * Searches for books by title or author.
     *
     * @param query The title or author to search for.
     * @return List of books matching the query.
     */
    public List<Book> searchBooks(String query) {
        List<Book> result = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(query) || book.getAuthor().equalsIgnoreCase(query)) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * Checks out a book to a borrower.
     *
     * @param ISBN The ISBN of the book to be checked out.
     * @throws IllegalArgumentException If the book with the given ISBN is not found or is not available.
     */
    public void checkOutBook(String ISBN) throws IllegalArgumentException {
        Book book = findBookByISBN(ISBN);
        if (book == null || !book.isAvailable()) {
            throw new IllegalArgumentException("Book not found or not available for checkout.");
        }
        book.setAvailable(false);
    }

    /**
     * Returns a book to the library.
     *
     * @param ISBN The ISBN of the book to be returned.
     * @throws IllegalArgumentException If the book with the given ISBN is not found or is already available.
     */
    public void returnBook(String ISBN) throws IllegalArgumentException {
        Book book = findBookByISBN(ISBN);
        if (book == null || book.isAvailable()) {
            throw new IllegalArgumentException("Book not found or already available.");
        }
        book.setAvailable(true);
    }

    /**
     * Helper method to find a book by its ISBN.
     *
     * @param ISBN The ISBN of the book to find.
     * @return The book if found, null otherwise.
     */
    private Book findBookByISBN(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }
}