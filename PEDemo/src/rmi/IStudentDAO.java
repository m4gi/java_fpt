/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import model.Student;

/**
 *
 * @author DAI PHUC
 */
public interface IStudentDAO extends Remote
{
    public ArrayList<Student> getList() throws RemoteException;
}
