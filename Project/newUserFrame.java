/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank_management_system_netbeans;



//------importing necessary packages------
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.*;


public class newUserFrame<aadharno> extends JFrame implements ActionListener {


    //---------globalizing variables--------

    JLabel newLabel, firstName, middleName, lastName, gender, dob, occupation, aadhar, pan, house, area, city, pinCode, phone, email;

    JTextField firstNameTextField;
    JTextField middleNameTextField;
    JTextField lastNameTextField;
    JTextField dobTextField;
    static JTextField aadharTextField;
    JTextField panTextField;
    JTextField houseTextField;
    JTextField areaTextField;
    JTextField cityTextField;
    JTextField pincodeTextField;
    JTextField phoneTextField;
    JTextField emailTextField;

    JRadioButton maleButton, femaleButton, otherButton;

    ButtonGroup group;

    JComboBox occupationComboBox;

    JCheckBox newUserCheckBox;

    JButton submitButton;

    //public String aadharnumber;


    //-------creating a constructor-------
    newUserFrame() {


        //--------creating a new label which contains background image--------
        newLabel = new JLabel();
        //ImageIcon image = new ImageIcon("src/icon/background1.jpg");
        //newabel.setIcon(image);
        newLabel.setBounds(0, 0, 600, 700);
        newLabel.setBackground(Color.WHITE);
        newLabel.setOpaque(true);


        //---------creating a new label for firstName---------
        firstName = new JLabel();
        firstName.setText("FIRST NAME");
        firstName.setBounds(20, -20, 100, 120);
        firstName.setFont(new Font("Times", Font.BOLD, 16));
        firstName.setForeground(Color.BLACK);
        newLabel.add(firstName);


        //--------creating a new label for middleName--------
        middleName = new JLabel();
        middleName.setText("MIDDLE NAME");
        middleName.setBounds(20, 20, 150, 120);
        middleName.setFont(new Font("Times", Font.BOLD, 16));
        middleName.setForeground(Color.BLACK);
        newLabel.add(middleName);


        //---------creating a new label for lastName---------
        lastName = new JLabel();
        lastName.setText("LAST NAME");
        lastName.setBounds(20, 60, 150, 120);
        lastName.setFont(new Font("Times", Font.BOLD, 16));
        lastName.setForeground(Color.BLACK);
        newLabel.add(lastName);


        //--------creating a new label for gender-----------
        gender = new JLabel();
        gender.setText("GENDER");
        gender.setBounds(20, 100, 150, 120);
        gender.setFont(new Font("Times", Font.BOLD, 16));
        gender.setForeground(Color.BLACK);
        newLabel.add(gender);


        //--------creating a new label for date of birth---------
        dob = new JLabel();
        dob.setText("DATE OF BIRTH");
        dob.setBounds(20, 140, 250, 120);
        dob.setFont(new Font("Times", Font.BOLD, 16));
        dob.setForeground(Color.BLACK);
        newLabel.add(dob);


        //--------creating a new label for phone no---------
        phone = new JLabel();
        phone.setText("PHONE NO.");
        phone.setBounds(20, 180, 250, 120);
        phone.setFont(new Font("Times", Font.BOLD, 16));
        phone.setForeground(Color.BLACK);
        newLabel.add(phone);


        //--------creating a new label for email---------
        email = new JLabel();
        email.setText("EMAIL ID");
        email.setBounds(20, 220, 250, 120);
        email.setFont(new Font("Times", Font.BOLD, 16));
        email.setForeground(Color.BLACK);
        newLabel.add(email);


//--------creating a new label for occupation----------
        occupation = new JLabel();
        occupation.setText("OCCUPATION");
        occupation.setBounds(20, 260, 150, 120);
        occupation.setFont(new Font("Times", Font.BOLD, 16));
        occupation.setForeground(Color.BLACK);
        newLabel.add(occupation);


        //---------creating a new label for aadhar----------
        aadhar = new JLabel();
        aadhar.setText("AADHAR");
        aadhar.setBounds(20, 300, 150, 120);
        aadhar.setFont(new Font("Times", Font.BOLD, 16));
        aadhar.setForeground(Color.BLACK);
        newLabel.add(aadhar);


        //---------creating a new label for pan-------------
        pan = new JLabel();
        pan.setText("PAN");
        pan.setBounds(20, 340, 150, 120);
        pan.setFont(new Font("Times", Font.BOLD, 16));
        pan.setForeground(Color.BLACK);
        newLabel.add(pan);


        //---------creating a new label for house---------
        house = new JLabel();
        house.setText("HOUSE DETAILS");
        house.setBounds(20, 380, 150, 120);
        house.setFont(new Font("Times", Font.BOLD, 16));
        house.setForeground(Color.BLACK);
        newLabel.add(house);


        //-------creating a new label for area-----------
        area = new JLabel();
        area.setText("AREA");
        area.setBounds(20, 420, 150, 120);
        area.setFont(new Font("Times", Font.BOLD, 16));
        area.setForeground(Color.BLACK);
        newLabel.add(area);


        //-------creating a new label for city----------
        city = new JLabel();
        city.setText("CITY NAME");
        city.setBounds(20, 460, 150, 120);
        city.setFont(new Font("Times", Font.BOLD, 16));
        city.setForeground(Color.BLACK);
        newLabel.add(city);


        //--------creating a new label for pincode----------
        pinCode = new JLabel();
        pinCode.setText("PIN CODE");
        pinCode.setBounds(20, 500, 150, 120);
        pinCode.setFont(new Font("Times", Font.BOLD, 16));
        pinCode.setForeground(Color.BLACK);
        newLabel.add(pinCode);


        //--------creating a TextField for firstName----------
        firstNameTextField = new JTextField();
        firstNameTextField.setPreferredSize(new Dimension(150, 17));
        firstNameTextField.setBounds(180, 30, 250, 17);
        firstNameTextField.setFont(new Font("consolas", Font.BOLD, 10));
        firstNameTextField.setForeground(new Color(24, 27, 97));
        firstNameTextField.setBackground(new Color(233, 229, 250));
        firstNameTextField.setCaretColor(new Color(24, 27, 97));
        firstNameTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        newLabel.add(firstNameTextField);


        //--------creating a TextField for middleName----------
        middleNameTextField = new JTextField();
        middleNameTextField.setPreferredSize(new Dimension(150, 17));
        middleNameTextField.setBounds(180, 70, 250, 17);
        middleNameTextField.setFont(new Font("consolas", Font.BOLD, 10));
        middleNameTextField.setForeground(new Color(24, 27, 97));
        middleNameTextField.setBackground(new Color(233, 229, 250));
        middleNameTextField.setCaretColor(new Color(24, 27, 97));
        middleNameTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        newLabel.add(middleNameTextField);


        //--------creating a TextField for lastName----------
        lastNameTextField = new JTextField();
        lastNameTextField.setPreferredSize(new Dimension(150, 17));
        lastNameTextField.setBounds(180, 110, 250, 17);
        lastNameTextField.setFont(new Font("consolas", Font.BOLD, 10));
        lastNameTextField.setForeground(new Color(24, 27, 97));
        lastNameTextField.setBackground(new Color(233, 229, 250));
        lastNameTextField.setCaretColor(new Color(24, 27, 97));
        lastNameTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        newLabel.add(lastNameTextField);


        //----------creating a male, female, other radioButton-----------
        maleButton = new JRadioButton("MALE");
        femaleButton = new JRadioButton("FEMALE");
        otherButton = new JRadioButton("OTHER");


        //--------setting bounds, border and background for the three radiobuttons---------
        maleButton.setBounds(180, 150, 100, 17);
        maleButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        maleButton.setBackground(new Color(233, 229, 250));
        femaleButton.setBounds(290, 150, 100, 17);
        femaleButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        femaleButton.setBackground(new Color(233, 229, 250));
        otherButton.setBounds(400, 150, 100, 17);
        otherButton.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        otherButton.setBackground(new Color(233, 229, 250));


        //---------setting foreGround for the three radioButtons-----------
        maleButton.setForeground(Color.BLACK);
        femaleButton.setForeground(Color.BLACK);
        otherButton.setForeground(Color.BLACK);


        //----------grouping the three buttons together------------
        ButtonGroup group = new ButtonGroup();
        group.add(maleButton);
        group.add(femaleButton);
        group.add(otherButton);


        //----------adding actionListener to the three buttons---------
        maleButton.addActionListener(this);
        femaleButton.addActionListener(this);
        otherButton.addActionListener(this);


        //---------adding the buttons to newLabel------------
        newLabel.add(maleButton);
        newLabel.add(femaleButton);
        newLabel.add(otherButton);


        //----------creating a TextField for dob-----------
        dobTextField = new JTextField();
        dobTextField.setPreferredSize(new Dimension(150, 17));
        dobTextField.setBounds(180, 190, 250, 17);
        dobTextField.setFont(new Font("consolas", Font.BOLD, 10));
        dobTextField.setForeground(new Color(24, 27, 97));
        dobTextField.setBackground(new Color(233, 229, 250));
        dobTextField.setCaretColor(new Color(24, 27, 97));
        dobTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        newLabel.add(dobTextField);


        //----------creating a TextField for phone-----------
        phoneTextField = new JTextField();
        phoneTextField.setPreferredSize(new Dimension(150, 17));
        phoneTextField.setBounds(180, 230, 250, 17);
        phoneTextField.setFont(new Font("consolas", Font.BOLD, 10));
        phoneTextField.setForeground(new Color(24, 27, 97));
        phoneTextField.setBackground(new Color(233, 229, 250));
        phoneTextField.setCaretColor(new Color(24, 27, 97));
        phoneTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        newLabel.add(phoneTextField);


        //----------creating a TextField for email-----------
        emailTextField = new JTextField();
        emailTextField.setPreferredSize(new Dimension(150, 17));
        emailTextField.setBounds(180, 270, 250, 17);
        emailTextField.setFont(new Font("consolas", Font.BOLD, 10));
        emailTextField.setForeground(new Color(24, 27, 97));
        emailTextField.setBackground(new Color(233, 229, 250));
        emailTextField.setCaretColor(new Color(24, 27, 97));
        emailTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        newLabel.add(emailTextField);


        //-----------creating a comboBox for occupation------------
        String[] occupationString = {"", "Retired Government Servant", "Self Employed", "Private", "Homemaker", "Student", "Other"};
        occupationComboBox = new JComboBox(occupationString);
        occupationComboBox.setBounds(175, 310, 230, 22);
        occupationComboBox.setBackground(new Color(233, 229, 250));
        occupationComboBox.addActionListener(this);
        newLabel.add(occupationComboBox);


        //------------creating a textField for aadhar card number--------------
        aadharTextField = new JTextField();
        aadharTextField.setPreferredSize(new Dimension(150, 17));
        aadharTextField.setBounds(180, 350, 250, 17);
        aadharTextField.setFont(new Font("consolas", Font.BOLD, 10));
        aadharTextField.setForeground(new Color(24, 27, 97));
        aadharTextField.setBackground(new Color(233, 229, 250));
        aadharTextField.setCaretColor(new Color(24, 27, 97));
        aadharTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        newLabel.add(aadharTextField);


        //----------creating a textField for pan card number------------
        panTextField = new JTextField();
        panTextField.setPreferredSize(new Dimension(150, 17));
        panTextField.setBounds(180, 390, 250, 17);
        panTextField.setFont(new Font("consolas", Font.BOLD, 10));
        panTextField.setForeground(new Color(24, 27, 97));
        panTextField.setBackground(new Color(233, 229, 250));
        panTextField.setCaretColor(new Color(24, 27, 97));
        panTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        newLabel.add(panTextField);


        //---------creating a textField for house details-------------
        houseTextField = new JTextField();
        houseTextField.setPreferredSize(new Dimension(250, 17));
        houseTextField.setBounds(180, 430, 250, 17);
        houseTextField.setFont(new Font("consolas", Font.BOLD, 10));
        houseTextField.setForeground(new Color(24, 27, 97));
        houseTextField.setBackground(new Color(233, 229, 250));
        houseTextField.setCaretColor(new Color(24, 27, 97));
        houseTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        newLabel.add(houseTextField);


        //----------creating a textField for area-------------
        areaTextField = new JTextField();
        areaTextField.setPreferredSize(new Dimension(250, 17));
        areaTextField.setBounds(180, 470, 250, 17);
        areaTextField.setFont(new Font("consolas", Font.BOLD, 10));
        areaTextField.setForeground(new Color(24, 27, 97));
        areaTextField.setBackground(new Color(233, 229, 250));
        areaTextField.setCaretColor(new Color(24, 27, 97));
        areaTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        newLabel.add(areaTextField);


        //---------creating a textField for city
        cityTextField = new JTextField();
        cityTextField.setPreferredSize(new Dimension(150, 17));
        cityTextField.setBounds(180, 510, 250, 17);
        cityTextField.setFont(new Font("consolas", Font.BOLD, 10));
        cityTextField.setForeground(new Color(24, 27, 97));
        cityTextField.setBackground(new Color(233, 229, 250));
        cityTextField.setCaretColor(new Color(24, 27, 97));
        cityTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        newLabel.add(cityTextField);


        // creating a textField for pincode
        pincodeTextField = new JTextField();
        pincodeTextField.setPreferredSize(new Dimension(150, 17));
        pincodeTextField.setBounds(180, 550, 250, 17);
        pincodeTextField.setFont(new Font("consolas", Font.BOLD, 10));
        pincodeTextField.setForeground(new Color(24, 27, 97));
        pincodeTextField.setBackground(new Color(233, 229, 250));
        pincodeTextField.setCaretColor(new Color(24, 27, 97));
        pincodeTextField.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        newLabel.add(pincodeTextField);


        //-------------creating a checkbox------------
        newUserCheckBox = new JCheckBox();
        newUserCheckBox.setText("I authorize Hindustan Bank that all the details given are correct and updated as per my knowledge and I have read privacy policy of the bank.");
        newUserCheckBox.setFocusable(false);
        newUserCheckBox.setFont(new Font("consolas", Font.PLAIN, 8));
        newUserCheckBox.setForeground(Color.BLACK);
        newUserCheckBox.setBounds(0, 590, 580, 40);
        newUserCheckBox.addActionListener(this);
        newLabel.add(newUserCheckBox);


        //---------creating a submit button----------
        submitButton = new JButton("SUBMIT");
        submitButton.setBounds(480, 630, 100, 30);
        submitButton.setFont(new Font("consolas", Font.BOLD, 10));
        submitButton.setBorder(BorderFactory.createEtchedBorder());
        submitButton.setForeground(Color.BLACK);
        submitButton.addActionListener(this);
        newLabel.add(submitButton);


        //----------frame details--------
        this.add(newLabel);
        this.setSize(600, 700);
        this.setTitle("HINDUSTAN BANK");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(22, 38, 118));
        this.setLocation(450,80);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
    }


    //----------actionPerformed method
    //public void actionPerformed(ActionEvent e){


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {


            //------------making firstname compulsory and getting the entered text---------
            if (firstNameTextField.getText().equals("") || dobTextField.getText().equals("") || phoneTextField.getText().equals("") || emailTextField.getText().equals("") || aadharTextField.getText().equals("") || panTextField.getText().equals("") || houseTextField.getText().equals("") || areaTextField.getText().equals("") || cityTextField.getText().equals("") || pincodeTextField.getText().equals("") || occupationComboBox.getSelectedIndex() == 0 || (!maleButton.isSelected() && !femaleButton.isSelected() && !otherButton.isSelected() || !newUserCheckBox.isSelected())) {
                JOptionPane.showMessageDialog(null, "PLEASE ENTER COMPLETE INFORMATION AND AGREE TO THE CHECK BOX", "INCOMPLETE INFORMATION", JOptionPane.WARNING_MESSAGE);
            } else {


                System.out.println(firstNameTextField.getText());


                System.out.println(middleNameTextField.getText());

                System.out.println(lastNameTextField.getText());

                String chosenOption;
                if (maleButton.isSelected()) {
                    chosenOption = maleButton.getText();
                } else if (femaleButton.isSelected()) {
                    chosenOption = femaleButton.getText();
                } else {
                    chosenOption = otherButton.getText();
                }
                System.out.println(chosenOption);

                System.out.println(dobTextField.getText());

                System.out.println(phoneTextField.getText());

                System.out.println(emailTextField.getText());

                System.out.println(occupationComboBox.getSelectedItem().toString());


                System.out.println(aadharTextField.getText());


                System.out.println(panTextField.getText());

                System.out.println(houseTextField.getText());

                System.out.println(areaTextField.getText());

                System.out.println(cityTextField.getText());

                System.out.println(pincodeTextField.getText());




               /* try{
                    //Class.forName("com.mysql.jdbc.Driver");

                    String url = "jdbc:mysql://localhost:3306/hindustanbank";
                    String username = "root";
                    String password = "Subham@16";


                    Connection c = DriverManager.getConnection(url, username, password);
                    Statement stmt = c.createStatement();


                    String query = "INSERT INTO userinfo(firstname, middlename, lastname, gender, dob, phone, email, occupation, aadhar, pan, house, area, city, pincode) VALUES ('"+firstNameTextField.getText()+"','"+middleNameTextField.getText()+"','"+lastNameTextField.getText()+"','"+chosenOption+"','"+dobTextField.getText()+"','"+phoneTextField.getText()+"','"+emailTextField.getText()+"','"+occupationComboBox.getSelectedItem().toString()+"','"+aadharTextField.getText()+"','"+panTextField.getText()+"','"+houseTextField.getText()+"','"+areaTextField.getText()+"','"+cityTextField.getText()+"','"+pincodeTextField.getText()+"')";

                    stmt.executeUpdate(query);

                    c.close();



                }catch(Exception ae){
                    System.out.println(ae);
                }*/
                try {


                    Connection con = conn.getCon();
                    Statement st = con.createStatement();
                    String query1 = "INSERT INTO userinfo(firstname, middlename, lastname, gender, dob, phone, email, occupation, aadhar, pan, house, area, city, pincode) VALUES ('" + firstNameTextField.getText() + "','" + middleNameTextField.getText() + "','" + lastNameTextField.getText() + "','" + chosenOption + "','" + dobTextField.getText() + "','" + phoneTextField.getText() + "','" + emailTextField.getText() + "','" + occupationComboBox.getSelectedItem().toString() + "','" + aadharTextField.getText() + "','" + panTextField.getText() + "','" + houseTextField.getText() + "','" + areaTextField.getText() + "','" + cityTextField.getText() + "','" + pincodeTextField.getText() + "')";
                    st.executeUpdate(query1);
                   // String query2 = "INSERT INTO userpwd(aadhar) values ('"+aadharnumber()+"')";
                    //st.executeUpdate(query2);
                    con.close();

                } catch (Exception ae) {
                    System.out.println(ae);

                }
            }


            this.dispose();
            new newUserConfirmation();
        }


    }

   /* public String aadharnumber() {

        aadharnumber = aadharTextField.getText();
        return aadharnumber;


    }*/


    public static void main(String args[]){

        new newUserFrame();

    }

}


        



/**
 *
 * @author subhamgaggar
 */
/*public class new_user_page {

    public static void main(String args[]) {


        new newUserFrame();


    }
}*/
        

    

