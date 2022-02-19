package com.Jurcis;

import javax.swing.JFrame;
import java.awt.EventQueue;

public class Snake extends JFrame {

    public Snake(){

        initUI();

    }

    private void initUI(){

        add(new Board());

        setResizable(false);
        pack();

        setTitle("Snake by Jurcis");
        setLocationRelativeTo(null); // atvers logu okrana centrā
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            JFrame ex = new Snake();
            ex.setVisible(true);});

    }
}