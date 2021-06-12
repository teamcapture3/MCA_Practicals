import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DateTimeRmiIntf extends Remote{
    public String getServerTime() throws RemoteException;
    public String getServerDate() throws RemoteException;
}
