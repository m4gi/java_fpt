/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import Model.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Magi
 */
public class StoreHandle extends UnicastRemoteObject implements StoreRemote {

    public StoreHandle() throws RemoteException {
    }

    @Override
    public ArrayList<Store> searchPhone() throws RemoteException {
        return StoreDB.searchByPhone();
    }

}
