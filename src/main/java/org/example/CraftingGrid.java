package org.example;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.example.Main.slotsArray;

public class CraftingGrid {
    //Caminhos
    static String caminhoProjeto = System.getProperty("user.dir");
    static String slotTexture = (caminhoProjeto + "\\src\\main\\java\\org\\example\\SlotTexture.png");

    //Panel Crafting
    public static JPanel craftingGrid() {
        JPanel craftingPanel = new JPanel(new GridLayout(3,3, 5, 5));
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
        return craftingPanel;
    }
}
