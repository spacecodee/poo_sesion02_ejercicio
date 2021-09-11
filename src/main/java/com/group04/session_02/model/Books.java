package com.group04.session_02.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Books {

    @Getter
    @Setter
    private String author;

    @Getter
    @Setter
    private float califications;

    @Getter
    @Setter
    private int numberPages;

    @Getter
    @Setter
    private String tilte;

    public Books() {

    }

    public Books(String author, String tilte, int numberPages, float califications) {
        this.author = author;
        this.califications = califications;
        this.numberPages = numberPages;
        this.tilte = tilte;
    }

    public Books(byte califications) {
        this.califications = califications;
    }

}
