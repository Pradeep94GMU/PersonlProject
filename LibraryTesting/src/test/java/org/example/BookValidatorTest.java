package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BookValidatorTest {

    BookValidator bookValidator;
    BookRepo bookRepo;


    @BeforeEach
    public void setUp(){
        bookRepo = new BookRepo();
        bookValidator = new BookValidator(bookRepo);
    }

    @Test
    public void aaddBook(){
        Book book = new Book("OS", "Feily");
        String res = bookValidator.addBook(book);
        assertEquals("new book added",res);
    }

    @Test
    public void addDuplicateBook(){
        Book book = new Book("OS", "Feily");
        bookValidator.addBook(book);
        String res = bookValidator.addBook(book);
        assertEquals("Already book exist",res);
    }
}
