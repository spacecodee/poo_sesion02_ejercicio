package com.group04.session_02.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Books implements Comparable<Books> {

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

    @Override
    public int compareTo(Books o) {
        if (this.getCalifications() < o.getCalifications()) {
            return -1;
        }

        if (this.getCalifications() > o.getCalifications()) {
            return 1;
        }

        return 0;
    }

}
