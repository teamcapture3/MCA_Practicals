import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeRmiImpl extends UnicastRemoteObject implements DateTimeRmiIntf{
    DateTimeRmiImpl() throws RemoteException {
        super();
    }
    Date dateObj = new Date();
    public String getServerTime() throws RemoteException {
        SimpleDateFormat df = new
        SimpleDateFormat("hh:mm:ss");
        String formattedTime = df.format(dateObj);
        return formattedTime;
    }
    public String getServerDate() throws RemoteException {
        SimpleDateFormat df = new
        SimpleDateFormat("MM/dd/YYYY");
        String formattedDate = df.format(dateObj);
        return formattedDate;
    }
}
