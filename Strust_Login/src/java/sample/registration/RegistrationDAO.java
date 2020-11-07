/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.registration;

import connection.DBUtil;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.activation.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import sample.strut2.RegisterAction;

/**
 *
 * @author Lucas
 */
public class RegistrationDAO implements Serializable {

    public boolean checkLogin(String username, String password) throws Exception {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtil.openConnection();
            if (con != null) {
                String sql = "Select * from Regitration Where username = ? And password= ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, username);
                stm.setString(2, password);

                rs = stm.executeQuery();
                if (rs.next()) {
                    return true;
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }
    private List<RegistrationDTO> listAccounts;

    public List<RegistrationDTO> getListAccounts() {
        return listAccounts;
    }

    public void searchLastName(String searchValue)
            throws Exception {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtil.openConnection();
            if (con != null) {
                String sql = "SELECT * from Regitration WHERE lastname LIKE ? ";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + searchValue + "%");
                rs = stm.executeQuery();

                while (rs.next()) {
                    String username = rs.getString("username");
                    String password = rs.getString("password");
                    String lastname = rs.getString("lastname");
                    boolean role = rs.getBoolean("isAdmin");

                    RegistrationDTO dto = new RegistrationDTO(username, password, lastname, role);
                    if (this.listAccounts == null) {
                        this.listAccounts = new ArrayList<>();
                    }
                    this.listAccounts.add(dto);
                }
            }

        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }

    public boolean deleteRecord(String username) throws Exception {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtil.openConnection();
            if (con != null) {
                String sql = "DELETE FROM Regitration WHERE username= ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, username);
                int row = stm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }

    public boolean updatePassRole(String username, String password, boolean role) throws Exception {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtil.openConnection();
            if (con != null) {
                String sql = "UPDATE Regitration SET password = ?, isAdmin = ? WHERE username = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, password);
                stm.setBoolean(2, role);
                stm.setString(3, username);
                int row = stm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }

    public static boolean insertAccount(RegisterAction reg) throws Exception {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            Context ctx = new InitialContext();
            Context envCtx = (Context) ctx.lookup("java:comp/env");
            con = DBUtil.openConnection();
            String sql = "Insert Into Regitration(username, password, lastname, isAdmin) values(?,?,?,0)";
            stm = con.prepareStatement(sql);
            System.out.println(reg.getUsername());
            stm.setString(1, reg.getUsername());
            stm.setString(2, reg.getPassword());
            stm.setString(3, reg.getLastname());
            int row = stm.executeUpdate();
            if (row > 0) {
                return true;
            }
        } catch (NamingException e) {
            HttpServletRequest request = ServletActionContext.getRequest();
            request.setAttribute("NamingErrors", e.getMessage());
        } catch (SQLException e) {
            HttpServletRequest request = ServletActionContext.getRequest();
            request.setAttribute("SQLErrors", e.getMessage());
        } finally {
            try {
                if (stm != null) {
                    stm.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                HttpServletRequest request = ServletActionContext.getRequest();
                request.setAttribute("SQLErrors", e.getMessage());
            }
        }
        return false;
    }
}
