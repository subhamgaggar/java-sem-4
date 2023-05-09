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




class moneyTransfer extends JFrame implements ActionListener {

    JLabel payeesAccountNumber, sendersAccountNumber, amount, pin;

    JTextField payeesAccountNumberTextField, sendersAccountNumberTextField, amountTextField;

    JButton payButton, backButton;

    JPasswordField pinTextField;

    moneyTransfer(){

        payeesAccountNumber = new JLabel();
        payeesAccountNumber.setText("PAYEE'S ACCOUNT NUMBER");
        payeesAccountNumber.setBounds(15,50,250,17);
        payeesAccountNumber.setFont(new Font("Times", Font.BOLD, 17));
        payeesAccountNumber.setForeground(Color.BLACK);
        this.add(payeesAccountNumber);

        sendersAccountNumber = new JLabel();
        sendersAccountNumber.setText("SENDERS ACCOUNT NUMBER");
        sendersAccountNumber.setBounds(15,100,270,17);
        sendersAccountNumber.setFont(new Font("Times", Font.BOLD, 17));
        sendersAccountNumber.setForeground(Color.BLACK);
        this.add(sendersAccountNumber);

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


        payeesAccountNumberTextField = new JTextField();
        payeesAccountNumberTextField.setPreferredSize(new Dimension(170, 17));
        payeesAccountNumberTextField.setBounds(320, 50, 170, 17);
        payeesAccountNumberTextField.setFont(new Font("consolas", Font.BOLD, 17));
        payeesAccountNumberTextField.setForeground(new Color(24,27,97));
        payeesAccountNumberTextField.setBackground(new Color(233,229,250));
        payeesAccountNumberTextField.setCaretColor(new Color(24,27,97));
        payeesAccountNumberTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(payeesAccountNumberTextField);


        sendersAccountNumberTextField = new JTextField();
        sendersAccountNumberTextField.setPreferredSize(new Dimension(170, 17));
        sendersAccountNumberTextField.setBounds(320, 100, 170, 17);
        sendersAccountNumberTextField.setFont(new Font("consolas", Font.BOLD, 17));
        sendersAccountNumberTextField.setForeground(new Color(24,27,97));
        sendersAccountNumberTextField.setBackground(new Color(233,229,250));
        sendersAccountNumberTextField.setCaretColor(new Color(24,27,97));
        sendersAccountNumberTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(sendersAccountNumberTextField);


        amountTextField = new JTextField();
        amountTextField.setPreferredSize(new Dimension(170, 17));
        amountTextField.setBounds(320, 150, 170, 17);
        amountTextField.setFont(new Font("consolas", Font.BOLD, 17));
        amountTextField.setForeground(new Color(24,27,97));
        amountTextField.setBackground(new Color(233,229,250));
        amountTextField.setCaretColor(new Color(24,27,97));
        amountTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(amountTextField);


        pinTextField = new JPasswordField();
        pinTextField.setPreferredSize(new Dimension(170, 17));
        pinTextField.setBounds(320, 200, 170, 17);
        pinTextField.setFont(new Font("consolas", Font.BOLD, 17));
        pinTextField.setForeground(new Color(24,27,97));
        pinTextField.setBackground(new Color(233,229,250));
        pinTextField.setCaretColor(new Color(24,27,97));
        pinTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(pinTextField);


        payButton = new JButton("PAY");
        payButton.setBounds(215,260,100,30);
        payButton.setFont(new Font("consolas", Font.BOLD, 13));
        payButton.setBorder(BorderFactory.createEtchedBorder());
        payButton.setForeground(Color.BLACK);
        payButton.addActionListener(this);
        this.add(payButton);



        backButton = new JButton();
        ImageIcon backImage = new ImageIcon("src/icon/back.png");
        backButton.setIcon(backImage);
        backButton.setBounds(530,3,20,20);
        backButton.setBorder(BorderFactory.createEtchedBorder());
        backButton.setForeground(Color.BLACK);
        backButton.addActionListener(this);
        this.add(backButton);



        this.setSize(550,350);
        this.setBackground(Color.WHITE);
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

                String query = "select * from userinfo where accountno = '"+sendersAccountNumberTextField.getText()+"' and pin = '"+pinTextField.getText()+"'";
                st.executeQuery(query);

                ResultSet rs;

                rs = st.executeQuery(query);
                if(rs.next()){

                    String query1 = "INSERT INTO accounthistory(senders_account_no, receivers_account_no, amount) VALUES ('"+sendersAccountNumberTextField.getText()+"', '"+payeesAccountNumberTextField.getText()+"', '"+amountTextField.getText()+"')";
                    st.executeUpdate(query1);
                    JOptionPane.showMessageDialog(null, "PAYMENT SUCCESSFULL","PAYMENT DETAIL",  JOptionPane.PLAIN_MESSAGE);
                    st.executeUpdate("UPDATE balance SET balance = balance - '"+amountTextField.getText()+"' WHERE accountno = '"+sendersAccountNumberTextField.getText()+"'");
                    st.executeUpdate("UPDATE balance SET balance = balance + '"+amountTextField.getText()+"' WHERE accountno = '"+payeesAccountNumberTextField.getText()+"'");

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
public class money_transfer_frame {

    public static void main(String args[]){

        new moneyTransfer();


    }
}
