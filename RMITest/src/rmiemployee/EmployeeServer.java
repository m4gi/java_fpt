
package rmiemployee;

import java.rmi.Naming;
import java.lang.Runtime;
import java.rmi.registry.LocateRegistry;

public class EmployeeServer {
    public static void main(String[] args) {
           //String serviceName="127.0.0.1/Math1";
        String serviceName="rmi://localhost:1098/MathServer";
        EmployeeHandle server;
        try {
            server=new EmployeeHandle();
            //call to rmiregistry.exe to start up RMI container
            LocateRegistry.createRegistry(1098);
            Naming.rebind(serviceName,server);
            //Register the name of service
            Naming.rebind(serviceName, server);
            System.out.println("Service " + serviceName + "is running.");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
