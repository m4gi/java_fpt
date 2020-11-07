package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class getConnect {

    public static String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=PRJ321;integratedSecurity=true";
    public static String userDB = "magi";
    public static String passDB = "letuan";

    public getConnect() {
    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            //load JDBC driver
            Class.forName(driverName);
            //connect to database
            conn = DriverManager.getConnection(dbURL, userDB, passDB);
            System.out.println("Connect successfully!");
        } catch (Exception ex) {
            System.out.println("Connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
}
