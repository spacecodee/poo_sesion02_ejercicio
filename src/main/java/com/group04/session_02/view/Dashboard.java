package com.group04.session_02.view;

import com.group04.session_02.model.Books;
import com.group04.session_02.model.ListBooks;
import com.group04.session_02.utils.Texts;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import lombok.Getter;
import lombok.ToString;
import mdlaf.MaterialLookAndFeel;

@ToString
public class Dashboard extends javax.swing.JFrame {

    private Books book;
    private final ListBooks listBooks = new ListBooks();
    private final com.group04.session_02.controllers.Dashboard dashboard = new com.group04.session_02.controllers.Dashboard();

    @Getter
    private DefaultTableModel modelBooks;

    public Dashboard() {
        initComponents();
        this.initALl();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtAuthor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNPages = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbxCalification = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jspScroll = new javax.swing.JScrollPane();
        tblBooks = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtBooks = new javax.swing.JTextField();
        btnAddQuantity = new javax.swing.JButton();
        btnClearAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtAuthor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtAuthor.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Autor");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Titulo");

        txtTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("N° Paginas");

        txtNPages.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtNPages.setForeground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Calificación");

        cbxCalification.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cbxCalification.setForeground(new java.awt.Color(51, 51, 51));
        cbxCalification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(51, 51, 51));
        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnClear.setForeground(new java.awt.Color(51, 51, 51));
        btnClear.setText("Limpiar");

        jspScroll.setBorder(null);

        tblBooks.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblBooks.setForeground(new java.awt.Color(51, 51, 51));
        tblBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Autor", "Titulo", "N° Paginas", "Calificacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBooks.getTableHeader().setResizingAllowed(false);
        tblBooks.getTableHeader().setReorderingAllowed(false);
        jspScroll.setViewportView(tblBooks);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Total de libros");

        txtBooks.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtBooks.setForeground(new java.awt.Color(51, 51, 51));
        txtBooks.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBooksKeyTyped(evt);
            }
        });

        btnAddQuantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddQuantity.setText("Agregar cantidad");
        btnAddQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddQuantityActionPerformed(evt);
            }
        });

        btnClearAll.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnClearAll.setForeground(new java.awt.Color(51, 51, 51));
        btnClearAll.setText("Limpiar todo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbxCalification, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jspScroll)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(31, 31, 31))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNPages, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnAddQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNPages, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCalification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jspScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (evt.getSource().equals(this.btnAdd)) {
            if (!this.dashboard.validateMaxBooks(this.txtBooks, this.cbxCalification, this.txtAuthor,
                    this.txtNPages, this.txtTitle)) {
                if (!this.dashboard.validateNotNulldata(this.cbxCalification, this.txtBooks, this.txtAuthor,
                        this.txtNPages, this.txtTitle)) {
                    this.dashboard.addBook(this.cbxCalification, this.txtBooks, this.txtAuthor,
                            this.txtTitle, this.txtNPages);
                } else {
                    JOptionPane.showMessageDialog(null, "Todos los datos son necesarios");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Primero debes ingresar el maximo de libros");
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnAddQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddQuantityActionPerformed
        this.dashboard.validateMaxBooks(txtBooks, cbxCalification, this.txtAuthor,
                this.txtNPages, this.txtTitle);
    }//GEN-LAST:event_btnAddQuantityActionPerformed

    private void txtBooksKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBooksKeyTyped
        Texts.verif(evt, txtBooks);
        this.listBooks.setSize(Integer.parseInt(this.txtBooks.getText().trim()));
    }//GEN-LAST:event_txtBooksKeyTyped

    private void initALl() {
        this.modelBooks = (DefaultTableModel) this.tblBooks.getModel();
        this.dashboard.validateMaxBooks(this.txtBooks, this.cbxCalification, this.txtAuthor,
                this.txtNPages, this.txtTitle);
    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new MaterialLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace(System.out);
        }

        Dashboard windowMain = new Dashboard();
        windowMain.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddQuantity;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearAll;
    private javax.swing.JComboBox<String> cbxCalification;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jspScroll;
    private javax.swing.JTable tblBooks;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBooks;
    private javax.swing.JTextField txtNPages;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
