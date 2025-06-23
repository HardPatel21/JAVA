package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertData {
    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.getConnection();
            String query = "INSERT INTO suratfood (foodname, description, popularimpressions, rating) VALUES (?, ?, ?, ?)";
//            ? = placeholders
            PreparedStatement pstmt = conn.prepareStatement(query);
            Scanner sc = new Scanner(System.in);

            System.out.println("Food Name: ");
            pstmt.setString(1, sc.nextLine());

            System.out.println("Food Description: ");
            pstmt.setString(2, sc.nextLine());

            System.out.println("Food PopularImpressions: ");
            pstmt.setString(3, sc.nextLine());

            System.out.println("Food Rating: ");
            pstmt.setFloat(4, sc.nextFloat());

            if (pstmt.executeUpdate() > 0) {
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Failed to insert data!");
            }
            sc.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}