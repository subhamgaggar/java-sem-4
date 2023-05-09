/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank_management_system_netbeans;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.Statement;
import java.util.*;
import java.lang.*;

/**
 *
 * @author subhamgaggar
 */




class newUserConfirmation extends JFrame implements ActionListener {




        JLabel confirmationImageLabel, confirmationLogoLabel, confirmationLabel1, confirmationLabel2, usernameLabel, passwordLabel, pinLabel;

        JTextField usernameTextField, passwordTextField, pinTextField;

        JButton submitButton;

        newUserConfirmation() {

            Border border =  BorderFactory.createLineBorder(new Color(123,131,240), 2);


            //--------creating a new label which contains background image--------
            confirmationImageLabel = new JLabel();
            //ImageIcon image = new ImageIcon("src/icon/background1.jpg");
            //confirmationImageLabel.setIcon(image);
            confirmationImageLabel.setBackground(Color.WHITE);
            confirmationImageLabel.setBounds(0, 0, 600, 650);
            confirmationImageLabel.setOpaque(true);


            confirmationLogoLabel = new JLabel();
            ImageIcon confirmationImage = new ImageIcon("src/icon/lotus.jpg");
            confirmationLogoLabel.setIcon(confirmationImage);
            confirmationLogoLabel.setBounds(0, 50, 600, 200);
            confirmationLogoLabel.setText("YOU HAVE SUCCESSFULLY OPENED AN ACCOUNT WITH HINDUSTAN BANK");
            confirmationLogoLabel.setFont(new Font("Times", Font.BOLD, 15));
            confirmationLogoLabel.setBackground(Color.WHITE );
            confirmationLogoLabel.setForeground(Color.BLACK);
            confirmationLogoLabel.setHorizontalTextPosition(JLabel.CENTER);
            confirmationLogoLabel.setVerticalTextPosition(JLabel.BOTTOM);
            confirmationLogoLabel.setVerticalAlignment(JLabel.TOP);
            confirmationLogoLabel.setHorizontalAlignment(JLabel.CENTER);
            confirmationLogoLabel.setIconTextGap(20);
            confirmationLogoLabel.setOpaque(true);
            confirmationImageLabel.add(confirmationLogoLabel);


            confirmationLabel1 = new JLabel();
            confirmationLabel1.setText("CREATE USERNAME AND PASSWORD TO GET STARTED");
            confirmationLabel1.setBounds(100, 300, 500, 50);
            confirmationLabel1.setFont(new Font("Times", Font.BOLD, 15));
            confirmationLabel1.setForeground(Color.BLACK);
            confirmationImageLabel.add(confirmationLabel1);


            confirmationLabel2 = new JLabel();
            confirmationLabel2.setBounds(85, 370, 450, 200);
            confirmationLabel2.setBackground(new Color(203, 204, 240));
            confirmationLabel2.setOpaque(true);
            confirmationLabel2.setBorder(border);
            confirmationImageLabel.add(confirmationLabel2);


            usernameLabel = new JLabel();
            usernameLabel.setBounds(15, 15, 200, 30);
            usernameLabel.setFont(new Font("Times", Font.BOLD, 20));
            usernameLabel.setForeground(new Color(24, 27, 97));
            usernameLabel.setText("USERNAME");
            confirmationLabel2.add(usernameLabel);


            passwordLabel = new JLabel();
            passwordLabel.setBounds(15, 70, 200, 30);
            passwordLabel.setFont(new Font("Times", Font.BOLD, 20));
            passwordLabel.setForeground(new Color(24, 27, 97));
            passwordLabel.setText("PASSWORD");
            confirmationLabel2.add(passwordLabel);

            pinLabel = new JLabel();
            pinLabel.setBounds(15, 125, 200, 30);
            pinLabel.setFont(new Font("Times", Font.BOLD, 20));
            pinLabel.setForeground(new Color(24, 27, 97));
            pinLabel.setText("PIN");
            confirmationLabel2.add(pinLabel);


            usernameTextField = new JTextField();
            usernameTextField.setBounds(150, 17, 200, 22);
            usernameTextField.setForeground(new Color(24, 27, 97));
            usernameTextField.setBackground(Color.LIGHT_GRAY);
            usernameTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            confirmationLabel2.add(usernameTextField);


            passwordTextField = new JTextField();
            passwordTextField.setBounds(150, 74, 200, 22);
            passwordTextField.setForeground(new Color(24, 27, 97));
            passwordTextField.setBackground(Color.LIGHT_GRAY);
            passwordTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            confirmationLabel2.add(passwordTextField);


            pinTextField = new JTextField();
            pinTextField.setBounds(150, 131, 200, 22);
            pinTextField.setForeground(new Color(24, 27, 97));
            pinTextField.setBackground(Color.LIGHT_GRAY);
            pinTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            confirmationLabel2.add(pinTextField);


            submitButton = new JButton();
            submitButton.setBounds(160, 170, 150, 20);
            submitButton.setText("SUBMIT");
            submitButton.setOpaque(true);
            confirmationLabel2.add(submitButton);
            submitButton.addActionListener(this);
            submitButton.setFont(new Font("Times", Font.BOLD, 13));
            submitButton.setBackground(new Color(203, 204, 240));
            submitButton.setForeground(Color.BLACK);
            submitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            confirmationLabel2.add(submitButton);


            this.add(confirmationImageLabel);
            this.setSize(600, 650);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            getContentPane().setBackground(new Color(22, 38, 118));
            this.setLocation(450,100);
            this.setResizable(false);
            this.setLayout(null);
            this.setVisible(true);


        }


        public void actionPerformed (ActionEvent e){

            if (e.getSource() == submitButton) {

                if (usernameTextField.getText().equals("") || passwordTextField.getText().equals("") || pinTextField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "PLEASE FILL COMPLETE INFORMATION", "INCOMPLETE INFORMATION", JOptionPane.WARNING_MESSAGE);
                } else {

                    Random rand = new Random();
                    long accountno = Math.abs(rand.nextLong() % 10000000000L);
                    long upiid = Math.abs(rand.nextLong() % 10000000L);
                    System.out.println(accountno);
                    System.out.println(usernameTextField.getText());
                    System.out.println(passwordTextField.getText());
                    System.out.println(pinTextField.getText());



                    try {


                        Connection con = conn.getCon();
                        Statement st = con.createStatement();
                        String aadharno = newUserFrame.aadharTextField.getText();
                        String query1 = "UPDATE userinfo set username = '"+usernameTextField.getText()+"', password = '"+passwordTextField.getText()+"', accountno = '"+accountno+"', upiid = '"+upiid+"',  pin = '"+pinTextField.getText()+"' where aadhar = '"+aadharno+"'";
                        st.executeUpdate(query1);


                       // String query2 = "UPDATE userpwd set upiid = '" + upiid + "', accountno = '" + accountno + "' where aadhar = ";
                       // st.executeUpdate(query2);
                        con.close();

                    } catch (Exception ae) {
                        System.out.println(ae);

                    }
                }
                this.dispose();
                new loginFrame();


            }


        }

        public static void main (String args[]){


             new newUserConfirmation();
        }
    }


/*public class new_user_confirmation {
    
    public static void main(String args[]){





        
       // new newUserConfirmation();
        
    }
    
}*/

