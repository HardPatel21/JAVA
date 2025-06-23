package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() {
        Connection conn = null;

        try {
            //step 1
            Class.forName("com.mysql.cj.jdbc.Driver");

            //url - jdbc:mysql://<dbhost>:<dbport>/<dbname>
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hard", "root", "Hard@2111");

            if (conn != null) {
                System.out.println("Connected to DB");
            } else {
                System.out.println("Failed to connect DB");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
