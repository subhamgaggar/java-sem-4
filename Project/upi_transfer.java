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





class UpiTransfer extends JFrame implements ActionListener {


    JLabel upiIdSender, pin, upiIdReceiver, amount;

    JTextField upiIdSenderTextField,  upiIdReceiverTextField,  amountTextField;

    JButton payButton, backButton;

    JPasswordField pinTextField;
    UpiTransfer(){


        upiIdSender = new JLabel();
        upiIdSender.setText("ENTER YOUR UPI ID");
        upiIdSender.setBounds(15,50,200,17);
        upiIdSender.setFont(new Font("Times", Font.BOLD, 17));
        upiIdSender.setForeground(Color.BLACK);
        this.add(upiIdSender);


        upiIdReceiver = new JLabel();
        upiIdReceiver.setText("ENTER RECEIVER'S UPI ID");
        upiIdReceiver.setBounds(15,100,250,17);
        upiIdReceiver.setFont(new Font("Times", Font.BOLD, 17));
        upiIdReceiver.setForeground(Color.BLACK);
        this.add(upiIdReceiver);

        amount = new JLabel();
        amount.setText("AMOUNT");
        amount.setBounds(15,150,250,17);
        amount.setFont(new Font("Times", Font.BOLD, 17));
        amount.setForeground(Color.BLACK);
        this.add(amount);




        pin = new JLabel();
        pin.setText("PIN");
        pin.setBounds(15,200,250,17);
        pin.setFont(new Font("Times", Font.BOLD, 17));
        pin.setForeground(Color.BLACK);
        this.add(pin);


        upiIdSenderTextField = new JTextField();
        upiIdSenderTextField.setPreferredSize(new Dimension(170, 17));
        upiIdSenderTextField.setBounds(260, 50, 170, 17);
        upiIdSenderTextField.setFont(new Font("consolas", Font.BOLD, 17));
        upiIdSenderTextField.setForeground(new Color(24,27,97));
        upiIdSenderTextField.setBackground(new Color(233,229,250));
        upiIdSenderTextField.setCaretColor(new Color(24,27,97));
        upiIdSenderTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(upiIdSenderTextField);



        upiIdReceiverTextField = new JTextField();
        upiIdReceiverTextField.setPreferredSize(new Dimension(170, 17));
        upiIdReceiverTextField.setBounds(260, 100, 170, 17);
        upiIdReceiverTextField.setFont(new Font("consolas", Font.BOLD, 17));
        upiIdReceiverTextField.setForeground(new Color(24,27,97));
        upiIdReceiverTextField.setBackground(new Color(233,229,250));
        upiIdReceiverTextField.setCaretColor(new Color(24,27,97));
        upiIdReceiverTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(upiIdReceiverTextField);


        amountTextField = new JTextField();
        amountTextField.setPreferredSize(new Dimension(170, 17));
        amountTextField.setBounds(260, 150, 170, 17);
        amountTextField.setFont(new Font("consolas", Font.BOLD, 17));
        amountTextField.setForeground(new Color(24,27,97));
        amountTextField.setBackground(new Color(233,229,250));
        amountTextField.setCaretColor(new Color(24,27,97));
        amountTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(amountTextField);



        pinTextField = new JPasswordField();
        pinTextField.setPreferredSize(new Dimension(170, 17));
        pinTextField.setBounds(260, 200, 170, 17);
        pinTextField.setFont(new Font("consolas", Font.BOLD, 17));
        pinTextField.setForeground(new Color(24,27,97));
        pinTextField.setBackground(new Color(233,229,250));
        pinTextField.setCaretColor(new Color(24,27,97));
        pinTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(pinTextField);



        payButton = new JButton("PAY");
        payButton.setBounds(170,260,100,30);
        payButton.setFont(new Font("consolas", Font.BOLD, 13));
        payButton.setBorder(BorderFactory.createEtchedBorder());
        payButton.setForeground(Color.BLACK);
        payButton.addActionListener(this);
        this.add(payButton);


        backButton = new JButton();
        ImageIcon backImage = new ImageIcon("src/icon/back.png");
        backButton.setIcon(backImage);
        backButton.setBounds(430,3,20,20);
        backButton.setBorder(BorderFactory.createEtchedBorder());
        backButton.setForeground(Color.BLACK);
        backButton.addActionListener(this);
        this.add(backButton);







        this.setSize(450,350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(460,220);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);

    }


    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == payButton){


            try {


                Connection con = conn.getCon();
                Statement st = con.createStatement();

                String query = "select * from userinfo where upiid = '"+upiIdSenderTextField.getText()+"' and pin = '"+pinTextField.getText()+"'";
                st.executeQuery(query);

                ResultSet rs;

                rs = st.executeQuery(query);
                if(rs.next()){

                    String query1 = "INSERT INTO upihistory(senders_upi_id, receivers_upi_id, amount) VALUES ('"+upiIdSenderTextField.getText()+"', '"+upiIdReceiverTextField.getText()+"', '"+amountTextField.getText()+"')";
                    st.executeUpdate(query1);
                    JOptionPane.showMessageDialog(null, "PAYMENT SUCCESSFULL","PAYMENT DETAIL",  JOptionPane.PLAIN_MESSAGE);
                    st.executeUpdate("UPDATE balance SET balance = balance - '"+amountTextField.getText()+"' WHERE upiid = '"+upiIdSenderTextField.getText()+"'");
                    st.executeUpdate("UPDATE balance SET balance = balance + '"+amountTextField.getText()+"' WHERE upiid = '"+upiIdReceiverTextField.getText()+"'");

                }else{
                    JOptionPane.showMessageDialog(null, "WRONG CREDENTIALS","PAYMENT DETAIL",  JOptionPane.WARNING_MESSAGE);
                }



            }catch(Exception ae){
                System.out.println(ae);

            }
        }

        if(e.getSource() == backButton){

            this.dispose();
            new mainFrame();

        }


    }
}
public class upi_transfer {

    public static void main(String args[]){


        new UpiTransfer();
    }
}
