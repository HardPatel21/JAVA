package test.test5;

import java.sql.*;

public class DatabaseManager {
    public static final String URL = "jdbc:mysql://localhost:3306/hard";
    public static final String USER = "root";
    public static final String PASSWORD = "Hard@2111"; // 🔒 Change this

    public static void insertCourse(int courseId, String courseName) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO courses VALUES (?, ?)");
            ps.setInt(1, courseId);
            ps.setString(2, courseName);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("DB Insert Error (Course): " + e.getMessage());
        }
    }

    public static void deleteCourse(int courseId) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM courses WHERE course_id = ?");
            ps.setInt(1, courseId);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("DB Delete Error (Course): " + e.getMessage());
        }
    }

    public static void updateCourse(int courseId, String newName) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            PreparedStatement ps = conn.prepareStatement("UPDATE courses SET course_name = ? WHERE course_id = ?");
            ps.setString(1, newName);
            ps.setInt(2, courseId);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("DB Update Error (Course): " + e.getMessage());
        }
    }

    public static void viewCourses(Connection conn) {
        String query = "SELECT * FROM courses";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while(rs.next()) {
                System.out.println("CourseId: " + rs.getInt("courseId") + ", CourseName: " + rs.getString("courseName"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }
    }
}
