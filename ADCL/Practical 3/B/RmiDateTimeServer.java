import java.rmi.Naming;

public class RmiDateTimeServer {
    public static void main (String args[])
    {
        try {
            DateTimeRmiImpl stub = new DateTimeRmiImpl();
            Naming.rebind("rmi://localhost:1099/dt",stub); //It binds the remote object to the new name.
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
