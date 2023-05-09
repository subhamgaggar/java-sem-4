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

class UserInfo extends JFrame implements ActionListener{

    JLabel firstnameLabel, middlenameLabel, lastnameLabel, genderLabel, dobLabel, phoneLabel, emailLabel, occupationLabel, aadharLabel, panLabel, houseLabel, areaLabel, cityLabel, pincodeLabel, accountnoLabel, upiidLabel;
    String firstname, middlename, lastname, gender, dob, phone, email, occupation, aadhar, pan, house, area, city, pincode, accountno, upiid;

    JTextField firstnameTextField, middlenameTextField, lastnameTextField, genderTextField, dobTextField, phoneTextField, emailTextField, occupationTextField, aadharTextField, panTextField, houseTextField, areaTextField, cityTextField, pincodeTextField;
    static JTextField accountnoTextField;
    static JTextField upiidTextField;

    JButton backButton;

    public UserInfo() {





        try {

            Connection con = conn.getCon();
            Statement st = con.createStatement();
            String a = loginFrame.usernameTextField.getText();
            String query = "select * from userinfo where username = '"+a+"'";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {






                firstname = rs.getString(1);
                middlename = rs.getString(2);
                lastname = rs.getString(3);
                gender = rs.getString(4);
                dob = rs.getString(5);
                phone = rs.getString(6);
                email = rs.getString(7);
                occupation = rs.getString(8);
                aadhar = rs.getString(9);
                pan = rs.getString(10);
                house = rs.getString(11);
                area = rs.getString(12);
                city = rs.getString(13);
                pincode = rs.getString(14);
                accountno = rs.getString(16);
                upiid = rs.getString(17);


            }

        } catch (Exception e) {
            System.out.println(e);
        }

        firstnameLabel = new JLabel();
        firstnameLabel.setText("FIRST NAME");
        firstnameLabel.setBounds(15,10,150,25);
        firstnameLabel.setFont(new Font("Times", Font.BOLD, 16));
        firstnameLabel.setForeground(Color.BLACK);
        this.add(firstnameLabel);


        firstnameTextField = new JTextField();
        firstnameTextField.setText(firstname);
        firstnameTextField.setPreferredSize(new Dimension(170, 23));
        firstnameTextField.setBounds(200, 10, 170, 23);
        firstnameTextField.setFont(new Font("consolas", Font.BOLD, 16));
        firstnameTextField.setForeground(new Color(24,27,97));
        firstnameTextField.setBackground(new Color(233,229,250));
        firstnameTextField.setCaretColor(new Color(24,27,97));
        firstnameTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(firstnameTextField);


        middlenameLabel = new JLabel();
        middlenameLabel.setText("MIDDLE NAME");
        middlenameLabel.setBounds(15,45,150,25);
        middlenameLabel.setFont(new Font("Times", Font.BOLD, 16));
        middlenameLabel.setForeground(Color.BLACK);
        this.add(middlenameLabel);


        middlenameTextField = new JTextField();
        middlenameTextField.setText(middlename);
        middlenameTextField.setPreferredSize(new Dimension(170, 23));
        middlenameTextField.setBounds(200, 45, 170, 23);
        middlenameTextField.setFont(new Font("consolas", Font.BOLD, 16));
        middlenameTextField.setForeground(new Color(24,27,97));
        middlenameTextField.setBackground(new Color(233,229,250));
        middlenameTextField.setCaretColor(new Color(24,27,97));
        middlenameTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(middlenameTextField);


        lastnameLabel = new JLabel();
        lastnameLabel.setText("LAST NAME");
        lastnameLabel.setBounds(15,80,150,25);
        lastnameLabel.setFont(new Font("Times", Font.BOLD, 16));
        lastnameLabel.setForeground(Color.BLACK);
        this.add(lastnameLabel);


        lastnameTextField = new JTextField();
        lastnameTextField.setText(lastname);
        lastnameTextField.setPreferredSize(new Dimension(170, 23));
        lastnameTextField.setBounds(200, 80, 170, 23);
        lastnameTextField.setFont(new Font("consolas", Font.BOLD, 16));
        lastnameTextField.setForeground(new Color(24,27,97));
        lastnameTextField.setBackground(new Color(233,229,250));
        lastnameTextField.setCaretColor(new Color(24,27,97));
        lastnameTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(lastnameTextField);



        genderLabel = new JLabel();
        genderLabel.setText("GENDER");
        genderLabel.setBounds(15,115,150,25);
        genderLabel.setFont(new Font("Times", Font.BOLD, 16));
        genderLabel.setForeground(Color.BLACK);
        this.add(genderLabel);


        genderTextField = new JTextField();
        genderTextField.setText(gender);
        genderTextField.setPreferredSize(new Dimension(170, 23));
        genderTextField.setBounds(200, 115, 170, 23);
        genderTextField.setFont(new Font("consolas", Font.BOLD, 16));
        genderTextField.setForeground(new Color(24,27,97));
        genderTextField.setBackground(new Color(233,229,250));
        genderTextField.setCaretColor(new Color(24,27,97));
        genderTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(genderTextField);



        dobLabel = new JLabel();
        dobLabel.setText("DOB");
        dobLabel.setBounds(15,150,150,25);
        dobLabel.setFont(new Font("Times", Font.BOLD, 16));
        dobLabel.setForeground(Color.BLACK);
        this.add(dobLabel);


        dobTextField = new JTextField();
        dobTextField.setText(dob);
        dobTextField.setPreferredSize(new Dimension(170, 23));
        dobTextField.setBounds(200, 150, 170, 23);
        dobTextField.setFont(new Font("consolas", Font.BOLD, 16));
        dobTextField.setForeground(new Color(24,27,97));
        dobTextField.setBackground(new Color(233,229,250));
        dobTextField.setCaretColor(new Color(24,27,97));
        dobTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(dobTextField);



        phoneLabel = new JLabel();
        phoneLabel.setText("PHONE NO");
        phoneLabel.setBounds(15,185,150,25);
        phoneLabel.setFont(new Font("Times", Font.BOLD, 16));
        phoneLabel.setForeground(Color.BLACK);
        this.add(phoneLabel);


        phoneTextField = new JTextField();
        phoneTextField.setText(phone);
        phoneTextField.setPreferredSize(new Dimension(170, 23));
        phoneTextField.setBounds(200, 185, 170, 23);
        phoneTextField.setFont(new Font("consolas", Font.BOLD, 16));
        phoneTextField.setForeground(new Color(24,27,97));
        phoneTextField.setBackground(new Color(233,229,250));
        phoneTextField.setCaretColor(new Color(24,27,97));
        phoneTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(phoneTextField);


        emailLabel = new JLabel();
        emailLabel.setText("EMAIL ID");
        emailLabel.setBounds(15,220,150,25);
        emailLabel.setFont(new Font("Times", Font.BOLD, 16));
        emailLabel.setForeground(Color.BLACK);
        this.add(emailLabel);


        emailTextField = new JTextField();
        emailTextField.setText(email);
        emailTextField.setPreferredSize(new Dimension(170, 23));
        emailTextField.setBounds(200, 220, 170, 23);
        emailTextField.setFont(new Font("consolas", Font.BOLD, 16));
        emailTextField.setForeground(new Color(24,27,97));
        emailTextField.setBackground(new Color(233,229,250));
        emailTextField.setCaretColor(new Color(24,27,97));
        emailTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(emailTextField);



        occupationLabel = new JLabel();
        occupationLabel.setText("OCCUPATION");
        occupationLabel.setBounds(15,255,150,25);
        occupationLabel.setFont(new Font("Times", Font.BOLD, 16));
        occupationLabel.setForeground(Color.BLACK);
        this.add(occupationLabel);



        occupationTextField = new JTextField();
        occupationTextField.setText(occupation);
        occupationTextField.setPreferredSize(new Dimension(170, 23));
        occupationTextField.setBounds(200, 255, 170, 23);
        occupationTextField.setFont(new Font("consolas", Font.BOLD, 16));
        occupationTextField.setForeground(new Color(24,27,97));
        occupationTextField.setBackground(new Color(233,229,250));
        occupationTextField.setCaretColor(new Color(24,27,97));
        occupationTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(occupationTextField);


        aadharLabel = new JLabel();
        aadharLabel.setText("AADHAR");
        aadharLabel.setBounds(15,290,150,25);
        aadharLabel.setFont(new Font("Times", Font.BOLD, 16));
        aadharLabel.setForeground(Color.BLACK);
        this.add(aadharLabel);


        aadharTextField = new JTextField();
        aadharTextField.setText(aadhar);
        aadharTextField.setPreferredSize(new Dimension(170, 23));
        aadharTextField.setBounds(200, 290, 170, 23);
        aadharTextField.setFont(new Font("consolas", Font.BOLD, 16));
        aadharTextField.setForeground(new Color(24,27,97));
        aadharTextField.setBackground(new Color(233,229,250));
        aadharTextField.setCaretColor(new Color(24,27,97));
        aadharTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(aadharTextField);



        panLabel = new JLabel();
        panLabel.setText("PAN");
        panLabel.setBounds(15,325,150,25);
        panLabel.setFont(new Font("Times", Font.BOLD, 16));
        panLabel.setForeground(Color.BLACK);
        this.add(panLabel);


        panTextField = new JTextField();
        panTextField.setText(pan);
        panTextField.setPreferredSize(new Dimension(170, 23));
        panTextField.setBounds(200, 325, 170, 23);
        panTextField.setFont(new Font("consolas", Font.BOLD, 16));
        panTextField.setForeground(new Color(24,27,97));
        panTextField.setBackground(new Color(233,229,250));
        panTextField.setCaretColor(new Color(24,27,97));
        panTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(panTextField);


        houseLabel = new JLabel();
        houseLabel.setText("HOUSE");
        houseLabel.setBounds(15,360,150,25);
        houseLabel.setFont(new Font("Times", Font.BOLD, 16));
        houseLabel.setForeground(Color.BLACK);
        this.add(houseLabel);


        houseTextField = new JTextField();
        houseTextField.setText(house);
        houseTextField.setPreferredSize(new Dimension(170, 23));
        houseTextField.setBounds(200, 360, 170, 23);
        houseTextField.setFont(new Font("consolas", Font.BOLD, 16));
        houseTextField.setForeground(new Color(24,27,97));
        houseTextField.setBackground(new Color(233,229,250));
        houseTextField.setCaretColor(new Color(24,27,97));
        houseTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(houseTextField);


        areaLabel = new JLabel();
        areaLabel.setText("AREA");
        areaLabel.setBounds(15,395,150,25);
        areaLabel.setFont(new Font("Times", Font.BOLD, 16));
        areaLabel.setForeground(Color.BLACK);
        this.add(areaLabel);


        areaTextField = new JTextField();
        areaTextField.setText(area);
        areaTextField.setPreferredSize(new Dimension(170, 23));
        areaTextField.setBounds(200, 395, 170, 23);
        areaTextField.setFont(new Font("consolas", Font.BOLD, 16));
        areaTextField.setForeground(new Color(24,27,97));
        areaTextField.setBackground(new Color(233,229,250));
        areaTextField.setCaretColor(new Color(24,27,97));
        areaTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(areaTextField);





        cityLabel = new JLabel();
        cityLabel.setText("CITY");
        cityLabel.setBounds(15,430,150,25);
        cityLabel.setFont(new Font("Times", Font.BOLD, 16));
        cityLabel.setForeground(Color.BLACK);
        this.add(cityLabel);


        cityTextField = new JTextField();
        cityTextField.setText(city);
        cityTextField.setPreferredSize(new Dimension(170, 23));
        cityTextField.setBounds(200, 430, 170, 23);
        cityTextField.setFont(new Font("consolas", Font.BOLD, 16));
        cityTextField.setForeground(new Color(24,27,97));
        cityTextField.setBackground(new Color(233,229,250));
        cityTextField.setCaretColor(new Color(24,27,97));
        cityTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(cityTextField);


        pincodeLabel = new JLabel();
        pincodeLabel.setText("PINCODE");
        pincodeLabel.setBounds(15,465,150,25);
        pincodeLabel.setFont(new Font("Times", Font.BOLD, 16));
        pincodeLabel.setForeground(Color.BLACK);
        this.add(pincodeLabel);


        pincodeTextField = new JTextField();
        pincodeTextField.setText(pincode);
        pincodeTextField.setPreferredSize(new Dimension(170, 23));
        pincodeTextField.setBounds(200, 465, 170, 23);
        pincodeTextField.setFont(new Font("consolas", Font.BOLD, 16));
        pincodeTextField.setForeground(new Color(24,27,97));
        pincodeTextField.setBackground(new Color(233,229,250));
        pincodeTextField.setCaretColor(new Color(24,27,97));
        pincodeTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(pincodeTextField);



        accountnoLabel = new JLabel();
        accountnoLabel.setText("ACCOUNT No");
        accountnoLabel.setBounds(15,500,150,25);
        accountnoLabel.setFont(new Font("Times", Font.BOLD, 16));
        accountnoLabel.setForeground(Color.BLACK);
        this.add(accountnoLabel);


        accountnoTextField = new JTextField();
        accountnoTextField.setText(accountno);
        accountnoTextField.setPreferredSize(new Dimension(170, 23));
        accountnoTextField.setBounds(200, 500, 170, 23);
        accountnoTextField.setFont(new Font("consolas", Font.BOLD, 16));
        accountnoTextField.setForeground(new Color(24,27,97));
        accountnoTextField.setBackground(new Color(233,229,250));
        accountnoTextField.setCaretColor(new Color(24,27,97));
        accountnoTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(accountnoTextField);



        upiidLabel = new JLabel();
        upiidLabel.setText("UPI ID");
        upiidLabel.setBounds(15,535,150,27);
        upiidLabel.setFont(new Font("Times", Font.BOLD, 16));
        upiidLabel.setForeground(Color.BLACK);
        this.add(upiidLabel);


        upiidTextField = new JTextField();
        upiidTextField.setText(upiid);
        upiidTextField.setPreferredSize(new Dimension(170, 23));
        upiidTextField.setBounds(200, 535, 170, 23);
        upiidTextField.setFont(new Font("consolas", Font.BOLD, 16));
        upiidTextField.setForeground(new Color(24,27,97));
        upiidTextField.setBackground(new Color(233,229,250));
        upiidTextField.setCaretColor(new Color(24,27,97));
        upiidTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        this.add(upiidTextField);


        backButton = new JButton();
        ImageIcon backImage = new ImageIcon("src/icon/back.png");
        backButton.setIcon(backImage);
        backButton.setBounds(430,3,20,20);
        backButton.setBorder(BorderFactory.createEtchedBorder());
        backButton.setForeground(Color.BLACK);
        backButton.addActionListener(this);
        this.add(backButton);





        this.setSize(450, 650);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocation(490,100);
        this.setVisible(true);





    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == backButton){
            this.dispose();
            new mainFrame();
        }
    }
}

public class user_info {

    public static void main(String args[]){

        new UserInfo();


    }
}
