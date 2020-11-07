package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class GroupDB extends DatabaseInfo {

    public static Connection openConnection() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class.forName(driverName).newInstance();
        Connection connection = DriverManager.getConnection(dbURL, userDB, passDB);
        return connection;
    }

    public boolean addNew(Group a) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String sql
                = "Insert into Groups(name,description) "
                + "values(?,?)";

        //Excute
        Connection connection = openConnection();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setNString(1, a.getName());
        ps.setNString(2, a.getDescription());

        //Return
        boolean returnStatus = ps.executeUpdate() > 0;
        connection.close();
        return returnStatus;
    }

    public boolean delete(int sNo) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String sql
                = "Delete from Groups where id_group= '" + sNo + "'";

        //Excute
        Connection connection = openConnection();
        Statement statement = connection.createStatement();

        //Return
        boolean returnStatus = statement.executeUpdate(sql) > 0;
        connection.close();
        return returnStatus;
    }

    public ArrayList<Group> selectAll() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        ArrayList<Group> arr;
        arr = new ArrayList<>();
        String sql
                = "Select * from Groups";

        //Excute
        Connection connection = openConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            int a = Integer.parseInt(rs.getString(1));
            String b = rs.getString(2);
            String c = rs.getString(3);
            arr.add(new Group(a, b, c));
        }

        //Return
        connection.close();
        return arr;
    }
}
