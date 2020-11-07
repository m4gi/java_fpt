/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.mvc;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Magi
 */
public class LoginBean implements Serializable {

    private String username;
    private String lastname;
    private boolean roles;

    public LoginBean() {
    }

    public LoginBean(String username, String lastname, boolean roles) {
        this.username = username;
        this.lastname = lastname;
        this.roles = roles;
    }

    public boolean checkLogin(String username, String password) {
        try {
            String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=FUD;";
            String userDB = "magi";
            String passDB = "letuan";
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            String sql = "Select * from Registration WHERE username = ? and password = ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            boolean result = rs.next();
            rs.close();
            stm.close();
            con.close();
            if (result) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean insert(String username, String password, String lastname, boolean roles) {
        try {
            String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=FUD;";
            String userDB = "magi";
            String passDB = "letuan";
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            String sql = "INSERT INTO Registration(username, password, lastname, isAdmin) VALUES(?, ?, ?, ?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            stm.setString(3, lastname);
            stm.setBoolean(4, roles);
            int result = stm.executeUpdate();
            stm.close();
            con.close();
            if (result > 0) {
                return true;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return false;
    }

    public LoginBean[] searchLikeLastname(String name) {
        try {
            String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=FUD;";
            String userDB = "magi";
            String passDB = "letuan";
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            String sql = "SELECT * FROM Registration WHERE lastname LIKE ?";
            PreparedStatement stm = con.prepareCall(sql);
            stm.setString(1, "%" + name + "%");

            ResultSet rs = stm.executeQuery();
            ArrayList list = new ArrayList();
            while (rs.next()) {
                String user = rs.getString("username");
                String last = rs.getString("lastname");
                boolean roles = rs.getBoolean("isAdmin");
                LoginBean tmp = new LoginBean(user, last, roles);
                list.add(tmp);
            }
            LoginBean[] result = new LoginBean[list.size()];
            list.toArray(result);
            rs.close();
            stm.close();
            con.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean deleteRecord() {
        try {
            String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=FUD;";
            String userDB = "magi";
            String passDB = "letuan";
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            String sql = "DELETE FROM Registration WHERE username = ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, username);
            int result = stm.executeUpdate();
            stm.close();
            con.close();
            if (result > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateRecord() {
        try {
            String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=FUD;";
            String userDB = "magi";
            String passDB = "letuan";
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            String sql = "UPDATE Registration SET lastname = ?, isAdmin = ? WHERE username = ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, lastname);
            stm.setBoolean(2, roles);
            stm.setString(3, username);
            int result = stm.executeUpdate();
            stm.close();
            con.close();
            if (result > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the roles
     */
    public boolean isRoles() {
        return roles;
    }

    /**
     * @param roles the roles to set
     */
    public void setRoles(boolean roles) {
        this.roles = roles;
    }

}
