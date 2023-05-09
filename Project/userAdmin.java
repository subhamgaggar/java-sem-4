package com.mycompany.bank_management_system_netbeans;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class userAdmin extends JFrame implements ActionListener{

    JLabel loginLabel;

    JRadioButton adminButton, userButton;

    JButton submitButton;

    userAdmin(){

        loginLabel = new JLabel();
        loginLabel.setText("HINDUSTAN BANK");
        loginLabel.setFont(new Font("Arial", Font.BOLD, 30));
        loginLabel.setForeground(new Color(123, 131, 240));
        loginLabel.setBounds(0, 0, 400, 400);
        loginLabel.setBackground(Color.WHITE);
        loginLabel.setOpaque(true);


        //-------setting image icon on loginLabel-------
        ImageIcon logo = new ImageIcon("src/icon/lotus.jpg");
        loginLabel.setIcon(logo);

        //-------setting the position of loginLabel text and images----------
        loginLabel.setHorizontalTextPosition(JLabel.CENTER);
        loginLabel.setVerticalTextPosition(JLabel.BOTTOM);

        //------setting the alignment of loginLabel text and images---------
        loginLabel.setVerticalAlignment(JLabel.TOP);
        loginLabel.setHorizontalAlignment(JLabel.CENTER);



        adminButton = new JRadioButton("ADMIN");
        userButton = new JRadioButton("USER");

        //--------setting bounds, border and background for the three radiobuttons---------
        adminButton.setBounds(145, 200, 100, 17);
        adminButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        adminButton.setBackground(Color.WHITE);
        adminButton.setFont(new Font("Times", Font.BOLD, 17));
        userButton.setBounds(145, 250, 100, 17);
        userButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        userButton.setFont(new Font("Times", Font.BOLD, 17));
        userButton.setBackground(Color.WHITE);


        adminButton.setForeground(Color.BLACK);
        userButton.setForeground(Color.BLACK);


        ButtonGroup group = new ButtonGroup();
        group.add(adminButton);
        group.add(userButton);




        //----------adding actionListener to the three buttons---------
        adminButton.addActionListener(this);
        userButton.addActionListener(this);


        loginLabel.add(adminButton);
        loginLabel.add(userButton);


        submitButton = new JButton("SUBMIT");
        submitButton.setBounds(150,290,75,25);
        submitButton.setFont(new Font("consolas", Font.BOLD, 13));
        submitButton.setBorder(BorderFactory.createEtchedBorder());
        submitButton.setForeground(Color.BLACK);
        submitButton.addActionListener(this);
        loginLabel.add(submitButton);




        this.add(loginLabel);
        this.setSize(400,400);
        this.setTitle("HINDUSTAN BANK");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocation(500,200);
        this.setLayout(null);
        this.setVisible(true);


    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == submitButton){
            if(userButton.isSelected()){

                this.dispose();
                new loginFrame();
            }else if(adminButton.isSelected()){
                this.dispose();
                new adminFrame();
            }

        }


    }
}

/*public class user_admin {

    public static void main(String args[]){

        new userAdmin();


    }
}*/
