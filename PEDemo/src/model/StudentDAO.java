/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author DAI PHUC
 */
public class StudentDAO implements IDatabaseInfo
{
    public Student getStudent(String ids)
    {
        String studentID;
        String lastName;
        String firstName;
        String gender;
        int phone;
        Student student = null;

        try
        {
            Class.forName(driverName);
            Connection conn = DriverManager.getConnection(connectionURL + dbname, userName, password);
            String sqlSelect = "SELECT * FROM student_yourid WHERE Student_ID = '" + ids + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sqlSelect);
            if (rs.next())
            {
                studentID = rs.getString(1);
                lastName = rs.getString(2);
                firstName = rs.getString(3);
                gender = rs.getString(4);
                phone = rs.getInt(5);
                student = new Student(studentID, lastName, firstName, gender, phone);
                conn.close();
                System.out.println(student.toString() + "");
                System.err.println("Get Student successfully!");
            } else
            {
                System.err.println("This Student is not exist!");
            }
        } catch (Exception err)
        {
            System.err.println("Get Book error: " + err);
        }
        return student;
    }
    
    public ArrayList<Student> getList()
    {
        String studentID;
        String lastName;
        String firstName;
        String gender;
        int phone;
        Student student = null;
        ArrayList<Student> studentList = new ArrayList<>();
        
        try
        {
            Class.forName(driverName);
            Connection conn = DriverManager.getConnection(connectionURL + dbname, userName, password);
            String sql = "Select * from student_yourid";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next())
            {
                studentID = rs.getString(1);
                lastName = rs.getString(2);
                firstName = rs.getString(3);
                gender = rs.getString(4);
                phone = rs.getInt(5);
                student = new Student(studentID, lastName, firstName, gender, phone);
                studentList.add(student);
                System.out.println(student.toString());
            }
            conn.close();
            System.out.println("Get all students successfully");
        } catch (Exception ex)
        {
            System.out.println("Get all students error");
        }
        return studentList;
    }
    
    public int addStudent(String studentID, String lastName, String firstName, String gender, int phone)
    {
        int rc = 0;
        try
        {
            Class.forName(driverName);
            Connection conn = DriverManager.getConnection(connectionURL + dbname, userName, password);
            String sql = "INSERT INTO student_yourid VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, studentID);
            stmt.setString(2, lastName);
            stmt.setString(3, firstName);
            stmt.setString(4, gender);
            stmt.setInt(5, phone);
            rc = stmt.executeUpdate();
            conn.close();
            System.out.println("Insert successfully!");
        } catch (Exception e)
        {
            System.out.println(e);
            System.out.println("Insert book error");
        }
        return rc;
    }
}
