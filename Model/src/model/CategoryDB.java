/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Le Tuan
 */
public class CategoryDB {

    public static ArrayList<Category> getCategory() {
        ArrayList<Category> list = new ArrayList<>();
        try {
            Connection conn;
            conn = ConnectDB.getConnection();
            String sql = "Select * from Category";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Category cat = new Category(rs.getString(1), rs.getString(2));
                list.add(cat);
            }
            conn.close();
            System.out.println("Get Category Successfully!");
        } catch (Exception e) {
            System.out.println("Get Category Failure!");
        }
        return list;
    }
}
