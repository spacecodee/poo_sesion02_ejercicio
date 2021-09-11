package com.group04.session_02;

import com.group04.session_02.model.Books;
import java.util.Arrays;

public class TestApp {

    private static final Books[] books = new Books[15];

    public static void main(String[] args) {
        Books book = new Books("Stephen King", "It", 560, 10);
        Books book2 = new Books("Frankz Fakfka", "Metamorfosis", 250, 10);
        Books book3 = new Books("Homero ", "La odisea", 250, 10);

        Books[] booksArr = {
            book, book2, book3
        };

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                if (booksArr.length > i) {
                    System.out.println("xd");
                    books[i] = booksArr[i];
                }
            }
        }

        System.out.println(Arrays.toString(books));
    }
}
