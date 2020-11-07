/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI_PRJ321;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Magi
 */
public interface EmployeeRemote extends Remote {

    public int addNewEmployee(String Emp_Id, String Last_Name, String First_Name, String Gender, String Email) throws RemoteException;

    public ArrayList<Employee> getAllEmployees() throws RemoteException;

    public void updateEmployees(String Emp_Id, String Last_Name, String First_Name, String Gender, String Email) throws RemoteException;

    public Employee getEmployee(String emp_id) throws RemoteException;

}
