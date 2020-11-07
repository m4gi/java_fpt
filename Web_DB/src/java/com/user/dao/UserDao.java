/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.user.dao;

import com.user.model.User;
import com.user.helpers.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Magi
 */
public class UserDao {

    public boolean insertUser(User user) throws Exception {
        String sql = "INSERT INTO [user](password, name, gender)" + "VALUES(?,?,?)";
        try (
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, user.getPassword());
            pstm.setString(2, user.getName());
            pstm.setBoolean(3, user.isGender());
            return pstm.executeUpdate() > 0;
        }
    }

    public List<User> findAll() throws Exception {
        List<User> list = new ArrayList<>();
        String sql = "SELECT * FROM [user]";
        try (Connection con = DatabaseHelper.openConnection();
                PreparedStatement pstm = con.prepareStatement(sql);
                ResultSet rs = pstm.executeQuery();) {
            while (rs.next()) {
                User user = new User();
                user.setUsername(rs.getInt("username"));
                user.setPassword(rs.getString("password"));
                user.setName(rs.getString("name"));
                user.setGender(rs.getBoolean("gender"));
                list.add(user);
            }
        }
        return list;
    }
}
