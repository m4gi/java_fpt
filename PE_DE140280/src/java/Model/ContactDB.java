package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ContactDB extends DatabaseInfo {

    public static Connection openConnection() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class.forName(driverName).newInstance();
        Connection connection = DriverManager.getConnection(dbURL, userDB, passDB);
        return connection;
    }

    public boolean addNew(Contact a) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String sql
                = "Insert into Contact(first_name,last_name,id_group,phone) "
                + "values(?,?,?,?)";

        //Excute
        Connection connection = openConnection();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setNString(1, a.getFirst_name());
        ps.setNString(2, a.getLast_name());
        ps.setString(3, Integer.toString(a.getId_group()));
        ps.setString(4, a.getPhone());

        //Return
        boolean returnStatus = ps.executeUpdate() > 0;
        connection.close();
        return returnStatus;
    }

    public boolean delete(int sNo) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String sql
                = "Delete from Contact where id_contact= '" + sNo + "'";

        //Excute
        Connection connection = openConnection();
        Statement statement = connection.createStatement();

        //Return
        boolean returnStatus = statement.executeUpdate(sql) > 0;
        connection.close();
        return returnStatus;
    }

    public boolean deleteByGroupId(int sNo) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String sql
                = "Delete from Contact where id_group= '" + sNo + "'";

        //Excute
        Connection connection = openConnection();
        Statement statement = connection.createStatement();

        //Return
        boolean returnStatus = statement.executeUpdate(sql) > 0;
        connection.close();
        return returnStatus;
    }

    public ArrayList<Contact> selectAll() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        ArrayList<Contact> arr;
        arr = new ArrayList<>();
        String sql
                = "Select * from Contact";

        //Excute
        Connection connection = openConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            int a = Integer.parseInt(rs.getString(1));
            String b = rs.getString(2);
            String c = rs.getString(3);
            int d = Integer.parseInt(rs.getString(4));
            String e = rs.getString(5);
            arr.add(new Contact(a, b, c, d, e));
        }

        //Return
        connection.close();
        return arr;
    }

    public boolean update(Contact a) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String sql
                = "Update Contact Set "
                + "first_name = '" + a.getFirst_name() + "',"
                + "last_name = '" + a.getLast_name() + "',"
                + "id_group = '" + a.getId_group() + "',"
                + "phone = '" + a.getPhone() + "'"
                + " Where id_contact='" + a.getId_contact() + "'";

        //Excute
        Connection connection = openConnection();
        Statement statement = connection.createStatement();

        //Return
        boolean returnStatus = statement.executeUpdate(sql) > 0;
        connection.close();
        return returnStatus;
    }

    public Contact getContactByID(int ID) throws Exception {
        Contact c1 = null;
        try (Connection connect = openConnection()) {
            Statement stt = connect.createStatement();
            ResultSet rs = stt.executeQuery("Select * from Contact where id_contact=" + ID);
            if (rs.next()) {
                int a = Integer.parseInt(rs.getString(1));
                String b = rs.getString(2);
                String c = rs.getString(3);
                int d = Integer.parseInt(rs.getString(4));
                String e = rs.getString(5);
                c1 = new Contact(a, b, c, d, e);
            }
        }
        return c1;
    }
}
