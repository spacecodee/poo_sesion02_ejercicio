package com.group04.session_02.utils;

import com.group04.session_02.model.Books;
import com.group04.session_02.model.ListBooks;
import java.util.Arrays;
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

    public boolean addBook(Books book) {
        
        if (this.getListBooks().getListBooks().size() <= 0) {
            this.getListBooks().getListBooks().add(book);
        } else if (this.getListBooks().getListBooks().size() < this.getListBooks().getSize()) {
            for (int i = 0; i < this.getListBooks().getListBooks().size(); i++) {
                if (!this.getListBooks().getListBooks().get(i).equals(book)) {
                    this.getListBooks().getListBooks().add(book);
                    break;
                }
            }
            return true;
        }
        return false;
    }

    public boolean deleteBook(Books book) {
        return false;
    }

    public void showBooks() {
        System.out.println(Arrays.toString(this.listBooks.getListBooks().toArray()));
        System.out.println(this.listBooks.getListBooks().size());
    }

    public String showHigherQualiferBooks(Books book) {
        return "";
    }

    public String showSmallQualiferBooks(Books book) {
        return "";
    }

}
