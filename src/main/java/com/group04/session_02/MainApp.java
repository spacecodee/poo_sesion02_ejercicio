package com.group04.session_02;

import com.group04.session_02.view.Dashboard;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import mdlaf.MaterialLookAndFeel;

public class MainApp {
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new MaterialLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace(System.out);
        }

        Dashboard windowMain = new Dashboard();
        windowMain.setVisible(true);
    }
}
