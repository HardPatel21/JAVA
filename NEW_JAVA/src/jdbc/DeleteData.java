package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteData {
    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.getConnection();
            String deleteQuery = "DELETE FROM suratfood WHERE FoodID = ?";

            PreparedStatement pstmt = conn.prepareStatement(deleteQuery);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the FoodId: ");
            pstmt.setInt(1, sc.nextInt());

            int re = pstmt.executeUpdate();
            if(re > 0) {
                System.out.println("Data deleted successfully!");
            } else {
                System.out.println("Failed to deleted data!");
            }
            sc.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}