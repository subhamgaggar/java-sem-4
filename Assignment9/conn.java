package sem4_java;
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
