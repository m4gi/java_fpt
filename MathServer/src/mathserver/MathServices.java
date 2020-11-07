/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathserver;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Magi
 */
public interface MathServices extends Remote{
    double add(double x, double y) throws RemoteException;
    double subtract(double x, double y) throws RemoteException;
    double mul(double x, double y) throws RemoteException;
    double div(double x, double y) throws RemoteException;
}
