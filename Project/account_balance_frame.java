package com.mycompany.bank_management_system_netbeans;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.border.Border;


class accountBalance extends JFrame implements ActionListener {
    String balance;

    JLabel balanceLabel;

    JTextField balanceTextField;

    JButton backButton;


    accountBalance() {

        try {

            Connection con = conn.getCon();
            Statement st = con.createStatement();
            String a = UserInfo.accountnoTextField.getText();
            String query = "select balance from balance where accountno = '" +a+ "'";


            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                balance = rs.getString(1);


            }


        } catch (Exception ae) {
            System.out.println(ae);
        }

        balanceLabel = new JLabel();
        balanceLabel.setText("BALANCE");
        balanceLabel.setBounds(15,50,150,25);
        balanceLabel.setFont(new Font("Times", Font.BOLD, 16));
        balanceLabel.setForeground(Color.BLACK);
        this.add(balanceLabel);


        balanceTextField = new JTextField();
        balanceTextField.setText(balance);
        balanceTextField.setPreferredSize(new Dimension(170, 23));
        balanceTextField.setBounds(200, 50, 170, 23);
        balanceTextField.setFont(new Font("consolas", Font.BOLD, 16));
        balanceTextField.setForeground(new Color(24,27,97));
        balanceTextField.setBackground(new Color(233,229,250));
        balanceTextField.setCaretColor(new Color(24,27,97));
        balanceTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(balanceTextField);

        backButton = new JButton();
        ImageIcon backImage = new ImageIcon("src/icon/back.png");
        backButton.setIcon(backImage);
        backButton.setBounds(430,3,20,20);
        backButton.setBorder(BorderFactory.createEtchedBorder());
        backButton.setForeground(Color.BLACK);
        backButton.addActionListener(this);
        this.add(backButton);

        this.setSize(450, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocation(490,300);
        this.setVisible(true);

    }
    public void actionPerformed (ActionEvent e){

        if(e.getSource() == backButton){
            this.dispose();
            new mainFrame();
        }
    }
}

public class account_balance_frame{
    public static void main(String args[]){
        new accountBalance();
    }
}