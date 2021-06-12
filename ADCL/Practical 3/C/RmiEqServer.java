import java.rmi.Naming;

public class RmiEqServer {
    public static void main(String args[]) {
        try {
            RmiEqImpl stub =new RmiEqImpl();
            Naming.rebind("rmi://localhost:1099/EqSolver",stub); //It binds the remote object to the new name.
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

