package EBook.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlconn {
    public static Connection conn;

    public static void connectToSQL() {
        try {
            String url = "Your SQL URL here"; // e.g., "jdbc:mysql://localhost:3306/yourdatabase"
            String user = "Your SQL username here"; // e.g., "root"
            String password = "Your SQL password here"; // e.g., "password"
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Connection error");
        }
    }

    public static void Close() { // to close the connection of SQL
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("ERROR Connection");
        }
    }

    public static boolean executeNonquary(String sqlStatement) { // to update, delete, insert
        try {
            connectToSQL();
            Statement stmt = conn.createStatement();
            stmt.execute(sqlStatement);
            System.out.println("executed");
            return true;
        } catch (Exception e) {
            System.out.println("failed");
            return false;

        } finally {
            Close();
            System.out.println("disconnected");
        }
    }
}