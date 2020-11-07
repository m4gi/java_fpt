package rmiemployee;

import Database.*;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Vector;

public interface EmployeeRemote extends Remote {

    public void update() throws RemoteException;

    public void delete(String ID) throws RemoteException;

    public employee getID(String ID) throws RemoteException;

    public Vector<employee> listEmployee() throws RemoteException;

    public void add(String Emp_ID, String Last_Name, String Fist_Name, String Gender, String Email) throws RemoteException;

}
