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

        //Panel Crafting
        JPanel craftingPanel = new JPanel();
        craftingPanel.setLayout(new GridLayout(3,3, 5, 5));
        craftingPanel.setBackground(Color.decode("#c6c6c6"));
        craftingPanel.setPreferredSize(new Dimension(350, 350));
        craftingPanel.setBorder(new EmptyBorder(5,5,5,5));

        //Ler array "slotsArray"
        for (int i = 0; i < slotsArray.length; i++) {
            JButton slotPanel = new JButton();
            slotPanel.setPreferredSize(new Dimension(50,50));
            slotPanel.setBackground(Color.decode("#8b8b8b"));

            slotPanel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("olá");
                }
            });

            craftingPanel.add(slotPanel);
        }

        //adicionar os trem
        mainPanel.add(craftingPanel);
        janela.add(mainPanel);


        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}