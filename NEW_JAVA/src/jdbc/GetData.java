package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetData {
    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM suratfood");
            System.out.println("FoodID\tFoodName\t\tDescription\t\t\tPopularImpressions\t\tRating");
            while(rs.next()) {
                System.out.println(rs.getInt(1) + "\t"+rs.getString("FoodName")+"\t\t\t"+rs.getString(3)+"\t\t\t"+rs.getString(4)+"\t\t" + rs.getFloat("Rating"));
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}