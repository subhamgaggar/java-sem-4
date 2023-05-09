package com.mycompany.bank_management_system_netbeans;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class upiHistory extends JFrame implements ActionListener{

    JTextArea tableArea;

    JFrame frame;

    JButton backButton;



    upiHistory(){

        try {

            Connection con = conn.getCon();
            Statement st = con.createStatement();

            ResultSet rs;
            rs = st.executeQuery("SELECT * FROM upihistory");

            // Create a JTextArea to hold the table data
            tableArea = new JTextArea();
            tableArea.setEditable(false);


            // Loop through the result set and append each row to the JTextArea
            while (rs.next()) {
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    tableArea.append(rs.getString(i) + "\t");
                }
                tableArea.append("\n");
            }

            // Create a JFrame to hold the JTextArea
            frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);


            backButton = new JButton();
            ImageIcon backImage = new ImageIcon("src/icon/back.png");
            backButton.setIcon(backImage);
            backButton.setBounds(375,5,20,20);
            backButton.setBorder(BorderFactory.createEtchedBorder());
            backButton.setForeground(Color.BLACK);
            backButton.addActionListener(this);
            frame.add(backButton);


            frame.setLocation(500,230);


            // Add the JTextArea to the JFrame
            JScrollPane scrollPane = new JScrollPane(tableArea);
            frame.getContentPane().add(scrollPane, BorderLayout.CENTER);






            // Display the JFrame
            frame.setVisible(true);







        }catch(Exception e){
            System.out.println(e);

        }
    }






    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == backButton){
            frame.dispose();
            new adminPage();
        }
    }
}

public class upi_history {

    public static void main(String args[]){
        new upiHistory();
    }

}