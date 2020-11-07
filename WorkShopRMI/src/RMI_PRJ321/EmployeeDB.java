/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI_PRJ321;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Magi
 */
public class EmployeeDB {
    //--------------------------------------------------------------------   

    public static int addNewEmployee(String Emp_Id, String Last_Name, String First_Name, String Gender, String Email) {
        int rc = 0;
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            String sql = "INSERT INTO Emp_YourID(Emp_Id, Last_Name, First_Name, Gender, Email) VALUES(?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, Emp_Id);
            stmt.setString(2, Last_Name);
            stmt.setString(3, First_Name);
            stmt.setString(4, Gender);
            stmt.setString(5, Email);
            rc = stmt.executeUpdate();
            conn.close();
            System.out.println("Add Books Successfully!");
            return rc;
        } catch (Exception ex) {
            System.out.println("Add Books Failure!");
            System.err.println(ex);
            return 0;
        }
    }

    public static ArrayList<Employee> getAllEmployees() {
        ArrayList<Employee> allEmployees = new ArrayList<>();
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from Emp_YourID");
            while (rs.next()) {
                String Emp_id = rs.getString(1);
                String Last_Name = rs.getString(2);
                String Firt_Name = rs.getString(3);
                String Gender = rs.getString(4);
                String Email = rs.getString(5);
                Employee a = new Employee(Emp_id, Last_Name, Firt_Name, Gender, Email);
                allEmployees.add(a);
            }
            conn.close();
            System.out.println("Get All Employees Succesfully!!");
        } catch (Exception e) {
            System.out.println("Get all Employees Failure!!");
        }
        return allEmployees;
    }

    //--------------------------------------------------------------------  
    public static Employee getEmployee(String emp_id) {
        Employee b = null;
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            String sql = "Select * from Emp_YourID where Emp_Id='" + emp_id + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                String Emp_Id = rs.getString(1);
                String Last_Name = rs.getString(2);
                String First_Name = rs.getString(3);
                String Gender = rs.getString(4);
                String Email = rs.getString(5);
                b = new Employee(Emp_Id, Last_Name, First_Name, Gender, Email);
                System.out.println(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3)
                        + " | " + rs.getString(4) + " |   " + rs.getString(5));
            }
            conn.close();
            System.out.println("Get Employees Successfully!!");
        } catch (Exception e) {
            System.out.println("Get Employees Failure!!");
            System.err.println(e);
        }
        return null;
    }

    //--------------------------------------------------------------------  
    public static int updateEmployees(String Emp_Id, String Last_Name, String First_Name, String Gender, String Email) {
        int rc = 0;
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            String sql = "Update Emp_YourID set Emp_Id=?,Last_Name=?,First_Name=?,Gender=? where Email=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, Emp_Id);
            stmt.setString(2, Last_Name);
            stmt.setString(3, First_Name);
            stmt.setString(4, Gender);
            stmt.setString(5, Email);
            rc = stmt.executeUpdate();
            conn.close();
            System.out.println("Update Employees Successfully!");
            return rc;
        } catch (Exception ex) {
            System.out.println("Update Employees Failure!");
            System.err.println(ex);
            return 0;
        }
    }

    //--------------------------------------------------------------------
    public int deleteBookByID(String Emp_Id) {
        try {
            // connnect to database 
            Connection conn = ConnectDB.getConnection();
            // create statement
            String sql = "Delete from Emp_YourID where Emp_Id='" + Emp_Id + "'";
            Statement stmt = conn.createStatement();
            // execute sql
            stmt.executeUpdate(sql);
            // close connection
            conn.close();
            System.out.println("Delete Employee successfully!");
            return 1;
        } catch (Exception ex) {
            System.out.println("Delete Employee failure!");
            ex.printStackTrace();
            return 0;
        }
    }

    //--------------------------------------------------------------------  
    public static ArrayList<Employee> searchByFirstName(String First) {
        ArrayList<Employee> aEmployee = new ArrayList<>();
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            String sql = "Select * from Emp_YourID where First_Name=N'" + First + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String Emp_Id = rs.getString(1);
                String Last_Name = rs.getString(2);
                String First_Name = rs.getString(3);
                String Gender = rs.getString(4);
                String Email = rs.getString(5);
                Employee b = new Employee(Emp_Id, Last_Name, First_Name, Gender, Email);
                aEmployee.add(b);
                System.out.println(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3)
                        + " | " + rs.getString(4) + " |   " + rs.getString(5));
            }
            conn.close();
            System.out.println("Get Books by Author Successfully!");

        } catch (Exception e) {
            System.out.println("Get Books by Author Failure!");
        }
        return aEmployee;
    }

    //--------------------------------------------------------------------  
    public static ArrayList<Employee> searchByLastName(String First) {
        ArrayList<Employee> aEmployee = new ArrayList<>();
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            String sql = "Select * from Emp_YourID where Last_Name=N'" + First + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String Emp_Id = rs.getString(1);
                String Last_Name = rs.getString(2);
                String First_Name = rs.getString(3);
                String Gender = rs.getString(4);
                String Email = rs.getString(5);
                Employee b = new Employee(Emp_Id, Last_Name, First_Name, Gender, Email);
                aEmployee.add(b);
                System.out.println(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3)
                        + " | " + rs.getString(4) + " |   " + rs.getString(5));
            }
            conn.close();
            System.out.println("Get Books by Author Successfully!");

        } catch (Exception e) {
            System.out.println("Get Books by Author Failure!");
        }
        return aEmployee;
    }
    //--------------------------------------------------------------------  

    public static ArrayList<Employee> searchByID(String First) {
        ArrayList<Employee> aEmployee = new ArrayList<>();
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            String sql = "Select * from Emp_YourID where Emp_Id=N'" + First + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String Emp_Id = rs.getString(1);
                String Last_Name = rs.getString(2);
                String First_Name = rs.getString(3);
                String Gender = rs.getString(4);
                String Email = rs.getString(5);
                Employee b = new Employee(Emp_Id, Last_Name, First_Name, Gender, Email);
                aEmployee.add(b);
                System.out.println(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3)
                        + " | " + rs.getString(4) + " |   " + rs.getString(5));
            }
            conn.close();
            System.out.println("Get Books by Author Successfully!");

        } catch (Exception e) {
            System.out.println("Get Books by Author Failure!");
        }
        return aEmployee;
    }
    //--------------------------------------------------------------------  

    public static ArrayList<Employee> searchByGender(String First) {
        ArrayList<Employee> aEmployee = new ArrayList<>();
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            String sql = "Select * from Emp_YourID where Gender=N'" + First + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String Emp_Id = rs.getString(1);
                String Last_Name = rs.getString(2);
                String First_Name = rs.getString(3);
                String Gender = rs.getString(4);
                String Email = rs.getString(5);
                Employee b = new Employee(Emp_Id, Last_Name, First_Name, Gender, Email);
                aEmployee.add(b);
                System.out.println(rs.getString(1) + " | " + rs.getString(2) + " | " + rs.getString(3)
                        + " | " + rs.getString(4) + " |   " + rs.getString(5));
            }
            conn.close();
            System.out.println("Get Books by Author Successfully!");

        } catch (Exception e) {
            System.out.println("Get Books by Author Failure!");
        }
        return aEmployee;
    }
    //--------------------------------------------------------------------  
}
