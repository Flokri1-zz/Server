package org.server.gui;

import javax.swing.*;
import java.awt.*;

public class Console extends JFrame {
    private JFrame jf = new JFrame();
    private JTextField tf = new JTextField();

    public Console() {
        jf.setVisible(true);
        jf.setBounds(0, 0, 1000, 1000);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //input-box
        tf.setBounds(50, 50, 50, 50);
        tf.setSize(10, 10);
        tf.setBackground(Color.BLACK);
        System.out.println(tf.getX() + " || " + tf.getY());
        System.out.println(tf.getHeight() + " || " + tf.getWidth());
        jf.getContentPane().add(tf);
    }

    public Console titel(String title) {
        jf.setTitle(title);
        return this;
    }

    public Console bounds(int width, int height) {
        jf.setBounds(0, 0, width, height);
        return this;
    }

    public Console fullScreen() {
        jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        tf.repaint();
        return this;
    }

    public Console background(Color color) {
        jf.getContentPane().setBackground(color);
        return this;
    }
}
