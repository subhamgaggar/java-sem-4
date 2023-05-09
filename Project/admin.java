package com.mycompany.bank_management_system_netbeans;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



//--------importing packages--------
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.border.Border;


//---------creating a loginFrame class-----------
class adminFrame extends JFrame implements ActionListener{


    //-----------globalizing variables----------
    JButton submitButton;

     JTextField usernameTextField;

    JPasswordField passwordTextField;


    //--------creating constructor---------
    public adminFrame(){


        //------creating a border-------
        Border border =  BorderFactory.createLineBorder(new Color(123,131,240), 2);



        //-------------creating a loginLabel-----------
        JLabel loginLabel = new JLabel();
        loginLabel.setText("HINDUSTAN BANK");
        loginLabel.setFont(new Font("Arial", Font.BOLD, 30));
        loginLabel.setForeground(new Color(123, 131, 240));
        //loginLabel.setBorder(border);
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






        //----------creating loginLabel2-----------
        JLabel loginLabel2 = new JLabel();
        loginLabel2.setBounds(50, 180, 300, 200);
        loginLabel2.setBackground(new Color(203, 204, 240));
        loginLabel2.setOpaque(true);
        loginLabel2.setBorder(border);


        //------creating JLabel for username-------
        JLabel username = new JLabel();
        username.setText("USERNAME");
        username.setBounds(20, -20, 100, 120);
        username.setFont(new Font("Times", Font.BOLD, 16));
        username.setForeground(new Color(24,27,97));
        loginLabel2.add(username);


        //-------creating JLabel for password-------
        JLabel password = new JLabel();
        password.setText("PASSWORD");
        password.setBounds(20, 10, 100, 120);
        password.setFont(new Font("Times", Font.BOLD, 16));
        password.setForeground(new Color(24,27,97));
        loginLabel2.add(password);



        //-------creating a TextField for username--------
        usernameTextField = new JTextField();
        usernameTextField.setPreferredSize(new Dimension(50, 20));
        usernameTextField.setBounds(115, 30, 150, 20);
        usernameTextField.setFont(new Font("consolas", Font.BOLD, 10));
        usernameTextField.setForeground(new Color(24,27,97));
        usernameTextField.setBackground(Color.lightGray);
        usernameTextField.setCaretColor(new Color(24,27,97));
        usernameTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        loginLabel2.add(usernameTextField);




        //---------creating a PasswordTextField for password--------
        passwordTextField = new JPasswordField();
        passwordTextField.setPreferredSize(new Dimension(50, 20));
        passwordTextField.setBounds(115, 60, 150, 20);
        passwordTextField.setFont(new Font("consolas", Font.BOLD, 10));
        passwordTextField.setForeground(new Color(24,27,97));
        passwordTextField.setBackground(Color.lightGray);
        passwordTextField.setCaretColor(new Color(24,27,97));
        passwordTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        loginLabel2.add(passwordTextField);





        //------creating a submitButton-------
        submitButton = new JButton("SUBMIT");
        submitButton.addActionListener(this);
        submitButton.setBounds(105, 130, 100, 35);
        submitButton.setFont(new Font("Times", Font.BOLD, 13));
        submitButton.setBackground(Color.BLACK);
        submitButton.setForeground(new Color(24,27,97));
        submitButton.setBorder(BorderFactory.createEtchedBorder());
        loginLabel2.add(submitButton);



        //--------creating a backgroundLabel--------
        JLabel backgroundLabel = new JLabel();
        backgroundLabel.setBounds(0,0,400,400);




        //-------adding labels-------
        backgroundLabel.add(loginLabel);
        loginLabel.add(loginLabel2);



        //-------parameters of frame-------
        this.setSize(400,430);
        this.setTitle("HINDUSTAN BANK");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        this.add(backgroundLabel);
        this.setResizable(false);
        this.setLocation(500,200);
        this.setLayout(null);
        this.setVisible(true);







    }

    //------overrding the actionPerformed method------
    public void actionPerformed(ActionEvent e){

        if(e.getSource() == submitButton){
            System.out.println(usernameTextField.getText());
            System.out.println(passwordTextField.getText());



            try{
                Connection con = conn.getCon();
                Statement st = con.createStatement();
                //String username = usernameTextField.getText();
                //String password = passwordTextField.getText();
                String query = "select * from admin where username = '"+usernameTextField.getText()+"' and password = '"+passwordTextField.getText()+"'";
                st.executeQuery(query);
                ResultSet rs;

                rs = st.executeQuery(query);
                if(rs.next()){
                    this.dispose();
                    new adminPage();
                }else{
                    JOptionPane.showMessageDialog(null, "WRONG CREDENTIALS","PAYMENT DETAIL",  JOptionPane.WARNING_MESSAGE);
                }
                con.close();

            }catch(Exception ae){
                System.out.println(ae);
            }


        }

    }


}


public class admin {

    public static void main(String args[]){

        new adminFrame();
    }
}
