/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/

package com.mycompany.bank_management_system_netbeans;
import java.sql.*;

public class conn {

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/hindustanbank";
            String username = "root";
            String password = "Subham@16";
            Connection con = DriverManager.getConnection(url, username, password);
            return con;
        } catch (Exception ae) {
            return null;
        }

    }
}