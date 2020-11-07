/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI_PRJ321;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Magi
 */
public class EmployeeHandle extends UnicastRemoteObject implements EmployeeRemote {

    public EmployeeHandle() throws RemoteException {
    }

    @Override
    public int addNewEmployee(String Emp_Id, String Last_Name, String First_Name, String Gender, String Email) throws RemoteException {
        return EmployeeDB.addNewEmployee(Emp_Id, Last_Name, First_Name, Gender, Email);
    }

    @Override
    public ArrayList<Employee> getAllEmployees() throws RemoteException {
        return EmployeeDB.getAllEmployees();
    }

    @Override
    public void updateEmployees(String Emp_Id, String Last_Name, String First_Name, String Gender, String Email) throws RemoteException {

    }

    @Override
    public Employee getEmployee(String emp_id) throws RemoteException {
        return EmployeeDB.getEmployee(emp_id);
    }

}
