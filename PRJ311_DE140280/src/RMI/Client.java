/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.Naming;
import java.util.ArrayList;
import Model.*;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 *
 * @author Magi
 */
public class Client {

    static String serviceName = "rmi://localhost:1098/Magi";
    static StoreRemote stub = null;
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Store> list = new ArrayList<>();

    public static void main(String[] args) throws RemoteException {
        try {
            stub = (StoreRemote) Naming.lookup(serviceName);
            if (stub != null) {
                try {
                    list = stub.searchPhone();
                    list.forEach((l) -> {
                        System.out.println(l);
                    });
                } catch (RemoteException e) {
                    System.err.println(e);
                }
            }
        } catch (MalformedURLException | NotBoundException | RemoteException e) {
            System.err.println(e);
        }

    }
}
