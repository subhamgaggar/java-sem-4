package com.mycompany.bank_management_system_netbeans;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import javax.swing.border.Border;



class Help extends JFrame implements ActionListener {

    JLabel label1, label2, label3, label4, label5, label6, label7;

    JButton backButton;


    Help() {


        label1 = new JLabel();
        label1.setText("CUSTOMER CARE");
        label1.setBounds(10, 45, 200, 30);
        label1.setFont(new Font("consolas", Font.BOLD, 20));
        this.add(label1);


        label2 = new JLabel();
        label2.setText("INDIA: ");
        label2.setBounds(10, 70, 450, 30);
        label2.setFont(new Font("consolas", Font.BOLD, 20));
        this.add(label2);


        label3 = new JLabel();
        label3.setText("1800 202 6161/ 1860 267 6161");
        label3.setBounds(10, 100, 450, 30);
        label3.setFont(new Font("consolas", Font.BOLD, 20));
        this.add(label3);


        label4 = new JLabel();
        label4.setText("FOR CUSTOMER TRAVELLING ABROAD: ");
        label4.setBounds(10, 150, 450, 30);
        label4.setFont(new Font("consolas", Font.BOLD, 20));
        this.add(label4);


        label5 = new JLabel();
        label5.setText("022 61606160");
        label5.setBounds(10, 170, 450, 30);
        label5.setFont(new Font("consolas", Font.BOLD, 20));
        this.add(label5);


        label6 = new JLabel();
        label6.setText("YOU CAN MAIL US ON: ");
        label6.setBounds(10, 220, 450, 30);
        label6.setFont(new Font("consolas", Font.BOLD, 20));
        this.add(label6);


        label7 = new JLabel();
        label7.setText("support@hindustanbank.com");
        label7.setBounds(10, 240, 450, 30);
        label7.setFont(new Font("consolas", Font.BOLD, 20));
        this.add(label7);


        backButton = new JButton();
        ImageIcon backImage = new ImageIcon("src/icon/back.png");
        backButton.setIcon(backImage);
        backButton.setBounds(430, 3, 20, 20);
        backButton.setBorder(BorderFactory.createEtchedBorder());
        backButton.setForeground(Color.BLACK);
        backButton.addActionListener(this);
        this.add(backButton);


        this.setSize(450, 350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        this.setLocation(500, 200);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);


    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backButton) {
            this.dispose();
            new mainFrame();
        }
    }
}
public class help_frame {

    public static void main(String args[]){

        new Help();

    }
}
