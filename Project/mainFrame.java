/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank_management_system_netbeans;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;


public class mainFrame extends JFrame implements ActionListener{
    
    JLabel mainImageLabel;
    
    JButton logoutButton,  moneyTransferButton, upiButton, balanceButton, infoButton, questionButton;
    
    
    mainFrame(){
        
        mainImageLabel = new JLabel();
        //ImageIcon image = new ImageIcon("src/icon/b2.jpeg");
        //mainImageLabel.setIcon(image);
        mainImageLabel.setBackground(new Color(203, 204, 240));
        mainImageLabel.setBounds(0,0,450,450);
        mainImageLabel.setOpaque(true);


        
        moneyTransferButton = new JButton("MONEY TRANSFER");
        ImageIcon moneyTransferImage = new ImageIcon("src/icon/moneytransfer.jpeg");
        moneyTransferButton.setIcon(moneyTransferImage);
        moneyTransferButton.setBounds(95,110,100,100);
        moneyTransferButton.setFont(new Font("consolas", Font.BOLD, 10));
        moneyTransferButton.setForeground(Color.BLACK);
        //logoutButton.setBorder(BorderFactory.createEtchedBorder());
        //logoutButton.setForeground(new Color(233,229,250));
        moneyTransferButton.setIconTextGap(-5);
        moneyTransferButton.setHorizontalTextPosition(JLabel.CENTER);
        moneyTransferButton.setVerticalTextPosition(JLabel.BOTTOM);
        moneyTransferButton.addActionListener(this);
        mainImageLabel.add(moneyTransferButton);
        
        
        
        
        upiButton = new JButton("UPI TRANSFER");
        ImageIcon upiImage = new ImageIcon("src/icon/upi.png");
        upiButton.setIcon(upiImage);
        upiButton.setBounds(95,240,100,100);
        upiButton.setFont(new Font("consolas", Font.BOLD, 10));
        upiButton.setForeground(Color.BLACK);
        //logoutButton.setBorder(BorderFactory.createEtchedBorder());
        //logoutButton.setForeground(new Color(233,229,250));
        upiButton.setIconTextGap(-5);
        upiButton.setHorizontalTextPosition(JLabel.CENTER);
        upiButton.setVerticalTextPosition(JLabel.BOTTOM);
        upiButton.addActionListener(this);
        mainImageLabel.add(upiButton);


        balanceButton = new JButton("ACCOUNT BALANCE");
        ImageIcon balanceImage = new ImageIcon("src/icon/balance.jpeg");
        balanceButton.setIcon(balanceImage);
        balanceButton.setBounds(275,110,100,100);
        balanceButton.setFont(new Font("consolas", Font.BOLD, 10));
        balanceButton.setForeground(Color.BLACK);
        //logoutButton.setBorder(BorderFactory.createEtchedBorder());
        //logoutButton.setForeground(new Color(233,229,250));
        balanceButton.setIconTextGap(9);
        balanceButton.setHorizontalTextPosition(JLabel.CENTER);
        balanceButton.setVerticalTextPosition(JLabel.BOTTOM);
        balanceButton.addActionListener(this);
        mainImageLabel.add(balanceButton);




        infoButton = new JButton("ACCOUNT INFO");
        ImageIcon infoImage = new ImageIcon("src/icon/info.jpeg");
        infoButton.setIcon(infoImage);
        infoButton.setBounds(275,240,100,100);
        infoButton.setFont(new Font("consolas", Font.BOLD, 10));
        infoButton.setForeground(Color.BLACK);
        //logoutButton.setBorder(BorderFactory.createEtchedBorder());
        //logoutButton.setForeground(new Color(233,229,250));
        infoButton.setIconTextGap(9);
        infoButton.setHorizontalTextPosition(JLabel.CENTER);
        infoButton.setVerticalTextPosition(JLabel.BOTTOM);
        infoButton.addActionListener(this);
        mainImageLabel.add(infoButton);




        questionButton = new JButton("HELP");
        ImageIcon questionImage = new ImageIcon("src/icon/question.jpeg");
        questionButton.setIcon(questionImage);
        questionButton.setBounds(360,3,40,45);
        questionButton.setFont(new Font("consolas", Font.BOLD, 5));
        questionButton.setForeground(Color.BLACK);
        questionButton.setIconTextGap(2);
        questionButton.setHorizontalTextPosition(JLabel.CENTER);
        questionButton.setVerticalTextPosition(JLabel.BOTTOM);
        questionButton.addActionListener(this);
        mainImageLabel.add(questionButton);


        logoutButton = new JButton("LOGOUT");
        ImageIcon logoutImage = new ImageIcon("src/icon/logout.jpg");
        logoutButton.setIcon(logoutImage);
        logoutButton.setBounds(410,3,40,45);
        logoutButton.setFont(new Font("consolas", Font.BOLD, 5));
        logoutButton.setForeground(Color.BLACK);
        //logoutButton.setBorder(BorderFactory.createEtchedBorder());
        //logoutButton.setForeground(new Color(233,229,250));
        logoutButton.setIconTextGap(-3);
        logoutButton.setHorizontalTextPosition(JLabel.CENTER);
        logoutButton.setVerticalTextPosition(JLabel.BOTTOM);
        logoutButton.addActionListener(this);
        mainImageLabel.add(logoutButton);









        this.add(mainImageLabel);
        this.setSize(450,450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(22,38,118));
        this.setResizable(false);
        this.setLocation(490,200);
        this.setLayout(null);
        this.setVisible(true);
        
        
        
        
        
    }
    
    
    
    
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == moneyTransferButton){

            this.dispose();
            new moneyTransfer();
        }

        if(e.getSource() == upiButton){

            this.dispose();
            new UpiTransfer();
        }

        else if(e.getSource() == balanceButton){

            this.dispose();
            new accountBalance();
        }

        else if(e.getSource() == questionButton){

            this.dispose();
            new Help();
        }

        else if(e.getSource() == infoButton){

            this.dispose();
            new UserInfo();
        }

        else if(e.getSource() == logoutButton){

            this.dispose();
            new userAdmin();
        }
        
        
    }

    public static void main(String args[]){

        new mainFrame();
    }
}
/**
 *
 * @author subhamgaggar
 */
/*public class main_frame {
    
    public static void main(String args[]){
        
        
        new mainFrame();
    }
    
}*/
