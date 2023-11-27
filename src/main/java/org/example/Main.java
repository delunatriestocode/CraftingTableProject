package org.example;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static Slot[] slotsArray = new Slot[9];
    public static void main(String[] args) {
        JFrame janela = new JFrame("Crafting Table");
        janela.setSize(700,600);
        janela.setResizable(false);

        //Panel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.decode("#c6c6c6"));


        janela.add(mainPanel);


        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}