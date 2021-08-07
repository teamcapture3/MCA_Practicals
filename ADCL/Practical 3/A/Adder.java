import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Adder extends Remote{
    public double add(double x,double y)throws RemoteException;
    public double sub(double x,double y)throws RemoteException;
    public double mul(double x,double y)throws RemoteException;
    public double div(double x,double y)throws RemoteException;
    public double mod(double x,double y)throws RemoteException;
}
