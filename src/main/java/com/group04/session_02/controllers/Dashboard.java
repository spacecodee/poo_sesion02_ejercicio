package com.group04.session_02.controllers;

import com.group04.session_02.model.Books;
import com.group04.session_02.model.ListBooks;
import com.group04.session_02.utils.Texts;
import com.group04.session_02.utils.UtilsBooks;
import java.util.Arrays;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Dashboard {

    private final ListBooks listBooks = new ListBooks();
    private final UtilsBooks utilsBooks = new UtilsBooks(this.listBooks);
    private Books book;

    public Dashboard() {

    }

    public boolean validateNotNulldata(JComboBox cbx, JTextField... txt) {
        return Texts.validateNotNull(txt) || cbx.getSelectedItem().equals("Selecciona");
    }

    public void addBook(JComboBox cbx, JTextField txtAuthor, JTextField txtTitle, JTextField txtNPages, JTable jTable) {
        var dtm = this.showToTable();
        
        var author = txtAuthor.getText().trim();
        var title = txtTitle.getText().trim();
        var nPages = Integer.parseInt(txtNPages.getText().trim());
        var quality = Integer.parseInt(cbx.getSelectedItem().toString());

        this.book = new Books(author, title, nPages, quality);
        this.utilsBooks.addBook(book);
        jTable.setModel(dtm);
        this.clear(cbx, txtAuthor, txtTitle, txtNPages);
    }

    public DefaultTableModel showToTable() {
        String[] columns = {"Autor", "Titulo", "N° Páginas", "Calificación"};
        var registros = new String[4];
        DefaultTableModel deafultTableModel = new DefaultTableModel(null, columns);

        for (int i = 0; i < this.utilsBooks.getListBooks().getListBooks().length; i++) {
            if (this.utilsBooks.getListBooks().getListBooks()[i] != null) {
                registros[0] = this.utilsBooks.getListBooks().getListBooks()[i].getAuthor();
                registros[1] = this.utilsBooks.getListBooks().getListBooks()[i].getTilte();
                registros[2] = String.valueOf(this.utilsBooks.getListBooks().getListBooks()[i].getNumberPages());
                registros[3] = String.valueOf(this.utilsBooks.getListBooks().getListBooks()[i].getCalifications());
                deafultTableModel.addRow(registros);
            }
        }
        
        return deafultTableModel;
    }

    private void clear(JComboBox cbx, JTextField... txt) {
        cbx.setSelectedIndex(0);
        for (JTextField txt1 : txt) {
            txt1.setText(null);
        }
    }
}
