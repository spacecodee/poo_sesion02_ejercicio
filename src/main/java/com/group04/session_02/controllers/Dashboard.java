package com.group04.session_02.controllers;

import com.group04.session_02.model.Books;
import com.group04.session_02.model.ListBooks;
import com.group04.session_02.utils.Texts;
import com.group04.session_02.utils.UtilsBooks;
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
        var author = txtAuthor.getText().trim();
        var title = txtTitle.getText().trim();
        var nPages = Integer.parseInt(txtNPages.getText().trim());
        var quality = Integer.parseInt(cbx.getSelectedItem().toString());

        this.book = new Books(author, title, nPages, quality);
        this.utilsBooks.addBook(book);
        jTable.setModel(this.showToTable());
        this.clear(cbx, txtAuthor, txtTitle, txtNPages);
    }

    public DefaultTableModel showToTable() {
        String[] columns = {"Autor", "Titulo", "N° Páginas", "Calificación"};
        var registros = new String[4];
        DefaultTableModel deafultTableModel = new DefaultTableModel(null, columns);
        for (Books listBook : this.utilsBooks.getListBooks().getListBooks()) {
            if (listBook != null) {
                registros[0] = listBook.getAuthor();
                registros[1] = listBook.getTilte();
                registros[2] = String.valueOf(listBook.getNumberPages());
                registros[3] = String.valueOf(listBook.getCalifications());
                deafultTableModel.addRow(registros);
            }
        }

        return deafultTableModel;
    }

    public void clear(JComboBox cbx, JTextField... txt) {
        cbx.setSelectedIndex(0);
        for (JTextField txt1 : txt) {
            txt1.setText(null);
        }
    }

    private boolean validateSelectionTableItem(JTable tbl) {
        return tbl.getSelectedRow() == -1;
    }

    public void deleteBook(JTable tbl) {
        if (!this.validateSelectionTableItem(tbl)) {
            int row = tbl.getSelectedRow();

            var author = tbl.getValueAt(row, 0).toString();
            var title = tbl.getValueAt(row, 1).toString();
            var nPaginas = Integer.parseInt(tbl.getValueAt(row, 2).toString());
            var qualify = Float.parseFloat(tbl.getValueAt(row, 3).toString());

            var book = new Books(author, title, nPaginas, qualify);
            this.utilsBooks.deleteBook(book);
            tbl.setModel(this.showToTable());
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecciona una fila a eliminar");
        }
    }

}
