package com.group04.session_02.utils;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Texts {

    public static boolean validateNotNull(JTextField... txt) {
        for (JTextField txt1 : txt) {
            if (txt1.getText().trim().isEmpty()) {
                return true;
            }
        }

        return false;
    }

    public static void verif(KeyEvent evt, JTextField txt) {
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten números");
        }
    }
}
