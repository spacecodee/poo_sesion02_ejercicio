package com.group04.session_02;

import com.group04.session_02.model.Books;
import com.group04.session_02.model.ListBooks;
import com.group04.session_02.utils.UtilsBooks;

public class TestApp {

    public static void main(String[] args) {
        Books book = new Books("Stephen King", "It", 560, 10);
        Books book2 = new Books("Frankz Fakfka", "Metamorfosis", 250, 10);
        ListBooks listBooks = new ListBooks();
        UtilsBooks utilsBook = new UtilsBooks(listBooks);
        utilsBook.addBook(book);
        utilsBook.addBook(book);
        utilsBook.addBook(book);
    }
}
