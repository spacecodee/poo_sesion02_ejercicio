package com.group04.session_02.model;

import java.util.ArrayList;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class ListBooks {

    @Getter
    private List<Books> listBooks;
    @Getter
    @Setter
    private int size;

    public ListBooks() {
        this.listBooks = new ArrayList<>();
    }

    public ListBooks(int size) {
        this.size = size;
        this.listBooks = new ArrayList<>();
    }
}
