import java.sql.*;

public class JDBCBasicsDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // Your DB name
        String user = "root"; // Your MySQL username
        String password = "yourpassword"; // Your MySQL password

        try {
            // Load and Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully!");

            // Establish Connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database!");

            // Create Statement
            Statement stmt = con.createStatement();

            //Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            //Process Result
            System.out.println("\nStudent Table Data:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
            }

            // Close Connection
            con.close();
            System.out.println("\nConnection closed successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
