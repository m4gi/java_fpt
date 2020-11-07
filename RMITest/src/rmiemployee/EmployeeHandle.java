package rmiemployee;

import Database.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;

public class EmployeeHandle extends UnicastRemoteObject implements EmployeeRemote {

    public EmployeeHandle() throws RemoteException {
    }

    @Override
    public void add(String Emp_ID, String Last_Name, String Fist_Name,
            String Gender, String Email) throws RemoteException {
        ProcessEmployee.add(Emp_ID, Last_Name, Fist_Name, Gender, Email);
    }

    @Override
    public void update() throws RemoteException {

    }

    @Override
    public void delete(String empID) throws RemoteException {

    }

    @Override
    public employee getID(String empID) throws RemoteException {
        return ProcessEmployee.getID(empID);
    }

    @Override
    public Vector<employee> listEmployee() throws RemoteException {
        return ProcessEmployee.listEmployee();
    }

}
