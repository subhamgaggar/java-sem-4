package com.mycompany.bank_management_system_netbeans;


import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


class edit extends JFrame implements ActionListener {
    String balance;

    JLabel queryLabel;

    JTextField queryTextField;

    JButton backButton, submitButton;


    edit() {


        queryLabel = new JLabel();
        queryLabel.setText("QUERY");
        queryLabel.setBounds(15,50,150,25);
        queryLabel.setFont(new Font("Times", Font.BOLD, 16));
        queryLabel.setForeground(Color.BLACK);
        this.add(queryLabel);


        queryTextField = new JTextField();
        queryTextField.setText(balance);
        queryTextField.setPreferredSize(new Dimension(600, 23));
        queryTextField.setBounds(100, 50, 600, 23);
        queryTextField.setFont(new Font("consolas", Font.BOLD, 16));
        queryTextField.setForeground(new Color(24,27,97));
        queryTextField.setBackground(new Color(233,229,250));
        queryTextField.setCaretColor(new Color(24,27,97));
        queryTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(queryTextField);

        backButton = new JButton();
        ImageIcon backImage = new ImageIcon("src/icon/back.png");
        backButton.setIcon(backImage);
        backButton.setBounds(730,3,20,20);
        backButton.setBorder(BorderFactory.createEtchedBorder());
        backButton.setForeground(Color.BLACK);
        backButton.addActionListener(this);
        this.add(backButton);

        submitButton = new JButton("SUBMIT");
        submitButton.setBounds(600,85,100,30);
        submitButton.setFont(new Font("consolas", Font.BOLD, 13));
        submitButton.setBorder(BorderFactory.createEtchedBorder());
        submitButton.setForeground(Color.BLACK);
        submitButton.addActionListener(this);
        this.add(submitButton);

        this.setSize(750, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocation(380,300);
        this.setVisible(true);

    }
    public void actionPerformed (ActionEvent e){

        if(e.getSource() == submitButton) {

            System.out.println(queryTextField.getText());


            try {

                Connection con = conn.getCon();
                Statement st = con.createStatement();

                st.executeUpdate(queryTextField.getText());

            } catch (Exception ae) {
                System.out.println(ae);
            }
        }else if(e.getSource() == backButton){
            this.dispose();
            new adminPage();
        }
    }
}

public class editFrame{
    public static void main(String args[]){

        new edit();
    }
}