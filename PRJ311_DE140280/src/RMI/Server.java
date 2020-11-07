/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;
import Model.*;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Magi
 */
public class Server {
    public static void main(String[] args) {
        //String serviceName="127.0.0.1/Math1";
        String serviceName = "rmi://localhost:1098/Magi";
        StoreHandle server;
        try {
            server = new StoreHandle();
            //call to rmiregistry.exe to start up RMI container
            LocateRegistry.createRegistry(1098);
            Naming.rebind(serviceName, server);
            //Register the name of service
            Naming.rebind(serviceName, server);
            System.out.println("Service " + serviceName + " is running.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
