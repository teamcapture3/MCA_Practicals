/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical5;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author ninad
 */
public class RmiServer {
    public static void main(String args[]) {
        try {
            Registry reg = LocateRegistry.createRegistry(1099);
            RmiImpl stub = new RmiImpl();
            reg.rebind("student",stub);
            System.out.println("Server is ready");
        }
        catch(Exception e){System.out.println(e);}
    }
}
