package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Database Utility class for managing the database connection.
 * Uses Singleton pattern to ensure a single connection instance.
 */
public class dbUtil {
    private static Connection con = null;

    // Private constructor to prevent instantiation
    private dbUtil() {}

    // Method to establish a database connection
    public static Connection getCon() throws ClassNotFoundException, SQLException {
        if (con == null) {
            synchronized (dbUtil.class) {
                if (con == null) {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee shop", "root", "");
                }
            }
        }
        return con;
    }

    // Method to close the database connection
    public static void closeCon() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                con = null;
            }
        }
    }
}
