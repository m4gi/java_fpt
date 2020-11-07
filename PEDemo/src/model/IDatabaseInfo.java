/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DAI PHUC
 */
public interface IDatabaseInfo
{
    public static String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String connectionURL = "jdbc:mysql://localhost:3306/";
    public static String dbname = "studentdb";
    public static String userName = "root";
    public static String password = "132000";
}
