/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical5;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author ninad
 */
public interface RmiIntf extends Remote {
    public Integer countrec (String DbName,String TblName) throws RemoteException;
    public String[][] studentDetails() throws RemoteException;
    public String[][] bookDetails() throws RemoteException;
    public String[][] billDetails() throws RemoteException;
}
