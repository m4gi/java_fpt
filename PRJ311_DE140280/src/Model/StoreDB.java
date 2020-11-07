/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Magi
 */
public class StoreDB {

    public static ArrayList<Store> getAllStores() {
        ArrayList<Store> allStores = new ArrayList<>();
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from Store_DE140280");
            while (rs.next()) {
                String StoreID = rs.getString(1);
                String Name = rs.getString(2);
                String Addresss = rs.getString(3);
                String Phone = rs.getString(4);
                Store a = new Store(StoreID, Name, Addresss, Phone);
                allStores.add(a);
            }
            conn.close();
            System.out.println("Get All Stores Succesfully!!");
        } catch (Exception e) {
            System.out.println("Get all Stores Failure!!");
        }
        return allStores;
    }
    //--------------------------------------------------------------------   

    public int newStore(String sID, String sName, String sAddress, String sPhone) {
        int rc = 0;
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            String sql = "INSERT INTO Store_DE140280(Store_ID, Store_Name, Address, Phone) VALUES(?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, sID);
            stmt.setString(2, sName);
            stmt.setString(3, sAddress);
            stmt.setString(4, sPhone);
            rc = stmt.executeUpdate();
            conn.close();
            System.out.println("Add Stores Successfully!");
            return rc;
        } catch (Exception ex) {
            System.out.println("Add Strore Failure!");
            System.err.println(ex);
            return 0;
        }

    }

    //--------------------------------------------------------------------  
    public static ArrayList<Store> searchByPhone() {
        ArrayList<Store> aStore = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String sPhone = sc.nextLine();
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            String sql = "Select * from Store_DE140280 where Phone='" + sPhone + "'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String StoreID = rs.getString(1);
                String Name = rs.getString(2);
                String Address = rs.getString(3);
                String Phone = rs.getString(4);
                Store b = new Store(StoreID, Name, Address, Phone);
                aStore.add(b);
                System.out.println(StoreID + " | " + Name + " | " + Address + " | " + Phone);
            }
            conn.close();
            System.out.println("Get Stores by Phone Successfully!");

        } catch (SQLException e) {
            System.out.println("Get Stores by Phone Failure!");
        }
        return aStore;
    }
}
