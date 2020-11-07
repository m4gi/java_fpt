//Step 2

package RmiMath;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Mathematician extends UnicastRemoteObject implements MathServices{

    public Mathematician() throws RemoteException {
    }
    
    public double add(double x, double y) throws RemoteException{
        return x+y;
    }
    public double subtract(double x, double y) throws RemoteException{
        return x-y;
    }
    
}
