/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.user.helpers;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Magi
 */
public class DatabaseHelper {

    public static Connection openConnection() throws Exception {
//        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=FUD;" + "";
        String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=FUD;";
        String userDB = "magi";
        String passDB = "letuan";
        Class.forName(driverName);
        Connection conn = DriverManager.getConnection(dbURL, userDB, passDB);
        try {
            Class.forName(driverName);
            conn = DriverManager.getConnection(dbURL, userDB, passDB);
            System.out.println("Connect successfully!!");
        } catch (Exception e) {
            System.out.println("Connect Failure!");
            e.printStackTrace();
        }
        return conn;

    }
}
