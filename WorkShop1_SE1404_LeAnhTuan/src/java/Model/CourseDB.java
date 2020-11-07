/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Le Anh Tuan
 */
public class CourseDB implements DatabaseInfo {

    public static ArrayList<Course> GetAll() {
        ArrayList<Course> result = new ArrayList<Course>();
        try {
            Class.forName(driverName);
            try (Connection con = DriverManager.getConnection(dbURL, userDB, passDB)) {
                PreparedStatement stmt = con.prepareStatement("SELECT * FROM Course_DE140280");
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    result.add(new Course(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
                }
                con.close();
            }
            return result;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Class BlogDAO- function: getTop3");
            System.err.println(e);
            return null;
        }
    }

    public static boolean Insert(String Course_ID, String Subject, String Lecturer, String Schedule) {
        try {
            Class.forName(driverName);
            int rc;
            try (Connection con = DriverManager.getConnection(dbURL, userDB, passDB)) {
                PreparedStatement stmt = con.prepareStatement("INSERT INTO Course_DE140280([Course ID],Subject,Lecturer,Schedule) values(?,?,?,?)");
                stmt.setString(1, Course_ID);
                stmt.setString(2, Subject);
                stmt.setString(3, Lecturer);
                stmt.setString(4, Schedule);
                rc = stmt.executeUpdate();
            }
            return rc == 1;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return false;
    }
}
