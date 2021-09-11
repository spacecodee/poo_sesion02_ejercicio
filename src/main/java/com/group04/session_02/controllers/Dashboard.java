package com.group04.session_02.controllers;

import com.group04.session_02.model.Books;
import com.group04.session_02.model.ListBooks;
import com.group04.session_02.utils.Texts;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Dashboard {

    private ListBooks listBooks = new ListBooks();
    private Books book;

    public Dashboard() {

    }

    public boolean validateNotNulldata(JComboBox cbx, JTextField... txt) {
        return Texts.validateNotNull(txt) || cbx.getSelectedItem().equals("Selecciona");
    }

    public boolean validateMaxBooks(JTextField txt, JComboBox cbx, JTextField... txts) {
        if (txt.getText().trim().isEmpty()) {
            this.validateMaxBooksRepeat(cbx, false, txts);
            return true;
        } else {
            txt.setEditable(false);
            this.validateMaxBooksRepeat(cbx, true, txts);
        }

        return false;
    }

    private void validateMaxBooksRepeat(JComboBox cbx, boolean verifi, JTextField... txts) {
        cbx.setEditable(verifi);
        for (JTextField txt1 : txts) {
            txt1.setEditable(verifi);
        }
    }

    public void addBook(JComboBox cbx, JTextField txtMaxBook, JTextField txtAuthor, JTextField txtTitle, JTextField txtNPages) {
        var maxBooks = Integer.parseInt(txtMaxBook.getText().trim());
        var author = txtAuthor.getText().trim();
        var title = txtTitle.getText().trim();
        var nPages = Integer.parseInt(txtNPages.getText().trim());
        var quality = Integer.parseInt(cbx.getSelectedItem().toString());

        this.book = new Books(author, title, nPages, quality);
        this.listBooks.getListBooks().add(this.book);
        System.out.println("list = " + this.listBooks.getListBooks());

        this.clear(cbx, txtMaxBook, txtAuthor, txtTitle, txtNPages);
    }

    private void clear(JComboBox cbx, JTextField... txt) {
        cbx.setSelectedIndex(0);
        for (JTextField txt1 : txt) {
            txt1.setText(null);
        }
    }
}
