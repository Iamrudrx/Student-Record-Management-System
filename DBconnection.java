import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

    private static final String URL = "jdbc:mysql://localhost:3306/SMS";
    private static final String USER = "root";
    private static final String PASSWORD = "125634"; // Update with your MySQL password

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Database Connection Failed!");
            e.printStackTrace();
            return null;
        }
    }
}