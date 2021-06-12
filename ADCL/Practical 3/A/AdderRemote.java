import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdderRemote extends UnicastRemoteObject implements Adder{
    AdderRemote()throws RemoteException
    {
        super();
    }
    public double add(double x,double y)
    {
        return x+y;
    }
    public double sub(double x,double y)
    {
        return x-y;
    }
    public double mul(double x,double y)
    {
        return x*y;
    }
    public double div(double x,double y)
    {
        return x/y;
    }
    public double mod(double x,double y)
    {
        return x%y;
    }
}
