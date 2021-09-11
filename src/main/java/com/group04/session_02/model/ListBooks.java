package com.group04.session_02.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class ListBooks {

    @Getter
    private final Books[] listBooks;

    public ListBooks() {
        this.listBooks = new Books[15];
    }
}
