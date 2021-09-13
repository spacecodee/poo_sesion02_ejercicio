package com.group04.session_02.utils;

import com.group04.session_02.model.Books;
import com.group04.session_02.model.ListBooks;
import java.awt.HeadlessException;
import java.util.Arrays;
import javax.swing.JOptionPane;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class UtilsBooks {

    @Getter
    @Setter
    private ListBooks listBooks;

    public UtilsBooks() {

    }

    public UtilsBooks(ListBooks listBooks) {
        this.listBooks = listBooks;
    }

    public void addBook(Books book) {
        try {
            for (int i = 0; i < this.listBooks.getListBooks().length; i++) {
                if (this.listBooks.getListBooks()[i] != null) {
                    if (this.listBooks.getListBooks()[i].getTilte().equalsIgnoreCase(book.getTilte())
                            && this.listBooks.getListBooks()[i].getAuthor().equalsIgnoreCase(book.getAuthor())) {
                        JOptionPane.showMessageDialog(null, "El libro ya ha sido agregado");
                        break;
                    }
                }

                if (this.listBooks.getListBooks()[i] == null) {
                    this.listBooks.getListBooks()[i] = book;
                    JOptionPane.showMessageDialog(null, "Libro Agregado");
                    break;
                }
            }
        } catch (HeadlessException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public void deleteBook(Books book) {
        if (this.listBooks.getListBooks().length > 0) {
            for (int i = 0; i < this.listBooks.getListBooks().length; i++) {
                if (this.listBooks.getListBooks()[i] != null) {
                    if (this.listBooks.getListBooks()[i].getAuthor().equalsIgnoreCase(book.getAuthor().trim())
                            && this.listBooks.getListBooks()[i].getTilte().equalsIgnoreCase(book.getTilte().trim())) {
                        this.listBooks.getListBooks()[i] = null;
                        JOptionPane.showMessageDialog(null, "Libro eliminado");
                        break;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(this.showBooks()));
    }

    public Books[] showBooks() {
        return this.listBooks.getListBooks();
    }
}
