/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.IDatabaseInfo;
import static model.IDatabaseInfo.connectionURL;
import static model.IDatabaseInfo.dbname;
import static model.IDatabaseInfo.driverName;
import static model.IDatabaseInfo.password;
import static model.IDatabaseInfo.userName;
import model.Student;

/**
 *
 * @author DAI PHUC
 */
public class Server extends UnicastRemoteObject implements IStudentDAO, IDatabaseInfo
{
    public Server() throws RemoteException
    {
        
    }

    @Override
    public ArrayList<Student> getList() throws RemoteException
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
    
    public static void main(String[] args)
    {
        try
        {
            LocateRegistry.createRegistry(1500);
            try
            {
                Naming.rebind("rmi://localhost:1500/StudentDAO", new Server());
            } catch (MalformedURLException e)
            {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, e);
            }
            System.out.println("Server ready...");
        } catch (RemoteException ex)
        {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
