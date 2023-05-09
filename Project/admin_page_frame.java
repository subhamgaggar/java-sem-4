package com.mycompany.bank_management_system_netbeans;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import javax.swing.border.Border;



class adminPage extends JFrame implements ActionListener{

    JLabel adminLabel;

    JButton accountHistoryButton, upiHistoryButton, userDetailButton, editDetailButton;


    adminPage(){



        adminLabel = new JLabel();
        adminLabel.setText("ADMIN");
        adminLabel.setBounds(180,20,150,25);
        adminLabel.setFont(new Font("Times", Font.BOLD, 25));
        adminLabel.setForeground(Color.BLACK);
        this.add(adminLabel);

        accountHistoryButton = new JButton();
        accountHistoryButton.setBounds(20,100,400,25);
        accountHistoryButton.setText("CHECK ACCOUNT TRANSACTION HISTORY");
        accountHistoryButton.setFont(new Font("Times", Font.BOLD, 15));
        accountHistoryButton.setBorder(BorderFactory.createEtchedBorder());
        accountHistoryButton.setForeground(Color.BLACK);
        accountHistoryButton.addActionListener(this);
        this.add(accountHistoryButton);



        upiHistoryButton = new JButton();
        upiHistoryButton.setBounds(20,170,400,25);
        upiHistoryButton.setText("CHECK UPI TRANSACTION HISTORY");
        upiHistoryButton.setFont(new Font("Times", Font.BOLD, 15));
        upiHistoryButton.setBorder(BorderFactory.createEtchedBorder());
        upiHistoryButton.setForeground(Color.BLACK);
        upiHistoryButton.addActionListener(this);
        this.add(upiHistoryButton);



        userDetailButton = new JButton();
        userDetailButton.setBounds(20,240,400,25);
        userDetailButton.setText("CHECK DETAILS ABOUT USERS");
        userDetailButton.setFont(new Font("Times", Font.BOLD, 15));
        userDetailButton.setBorder(BorderFactory.createEtchedBorder());
        userDetailButton.setForeground(Color.BLACK);
        userDetailButton.addActionListener(this);
        this.add(userDetailButton);


        editDetailButton = new JButton();
        editDetailButton.setBounds(20,310,400,25);
        editDetailButton.setText("EDIT DETAILS ABOUT USERS");
        editDetailButton.setFont(new Font("Times", Font.BOLD, 15));
        editDetailButton.setBorder(BorderFactory.createEtchedBorder());
        editDetailButton.setForeground(Color.BLACK);
        editDetailButton.addActionListener(this);
        this.add(editDetailButton);


        this.setSize(450, 450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocation(500,200);
        this.setVisible(true);



    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == accountHistoryButton){
            this.dispose();
            new accountHistory();
        }else if(e.getSource() == upiHistoryButton){
            this.dispose();
            new upiHistory();
        }else if(e.getSource() == userDetailButton){
            this.dispose();
            new customer();
        }else if(e.getSource() == editDetailButton){
            this.dispose();
            new edit();
        }

    }


}

public class admin_page_frame {


    public static void main(String args[]){

        new adminPage();


    }
}
