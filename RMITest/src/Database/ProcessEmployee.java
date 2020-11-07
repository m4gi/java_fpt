
package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProcessEmployee {
    
    

    public static void add(String Emp_ID, String Last_Name, String Fist_Name, String Gender, String Email){
        try {            
           // connnect to database 
           Connection conn = getConnect.getConnection();
           // create statement
            if (Gender.equalsIgnoreCase("Male")){
                Gender="M";
            } else if(Gender.equalsIgnoreCase("Female")) {
                Gender="F";
            }
           
        
           
           String sql = "INSERT INTO Emp_YourID(Emp_ID, Last_Name, Fist_Name, Gender,Email) VALUES(N'" + Emp_ID + "',N'" + Last_Name + "',N'" + Fist_Name + "',N'" + Gender + "',N'" + Email+ "')";
           Statement stmt = conn.createStatement();
           // execute sql
            stmt.execute(sql); 
           //stmt.execute(sql); 
           // close connection
            conn.close();
           System.out.println("Insert Book successfully!"); 
           
       } catch (Exception ex) {
           System.out.println("Insert Book failure!");
        } 
    
    }


    public static void update(){
        
    }


    public static void delete()  {
       
    }

    public static employee getID(String empID)  {
        employee e=null;
        
               try {
            // connnect to database 
            Connection conn = getConnect.getConnection();
            // create statement and execute query
            String sql="select * from Emp_YourID where Emp_ID='"+empID+"' ";
            Statement stmt = conn.createStatement();           
            ResultSet rs = stmt.executeQuery(sql);
            // show data
            
            while (rs.next()) {
                e = new employee(rs.getString(1), rs.getString(2), 
                                 rs.getString(3), rs.getString(4), rs.getString(5));
            }
            // close connection
            conn.close();
             
        } catch (Exception ex) {
            System.out.println("Get books failure!");       
            ex.printStackTrace();
        }
            return e;  
    }
    
        public static Vector<employee> listEmployee(){
        Connection conn = getConnect.getConnection();
        
        Vector<employee> all = new Vector<>();
        
       
                         
        String sql ="select* from Emp_YourID";
        try {
            Statement stm =conn.createStatement();
             ResultSet rs =stm.executeQuery(sql);
             while(rs.next()){
             employee e = new employee(); 
            e.setEmp_ID(rs.getString(1));
            e.setLast_Name(rs.getNString(2));
            e.setFist_Name(rs.getNString(3));
            e.setGender(rs.getString(4));
            e.setEmail(rs.getString(5));  
            all.add(e);
             }
            System.out.println("Sucessfully");  
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProcessEmployee.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());

        }
        return all;
    }
    

}
