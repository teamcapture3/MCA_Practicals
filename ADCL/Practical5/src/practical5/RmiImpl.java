/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical5;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ninad
 */
public class RmiImpl extends UnicastRemoteObject implements RmiIntf {
    public RmiImpl() throws RemoteException {
        super();
    }
    public Integer countrec (String DbName,String TblName) throws RemoteException {
        ResultSet rs;
        Integer tot_rows = 0 ;
        try {
            java.sql.Connection conn=null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+DbName,"root","");
            Statement st=conn.createStatement();
            rs = st.executeQuery("SELECT COUNT(*)AS total FROM "+TblName);
            if(rs.next()) {tot_rows = rs.getInt("total");}
        }
        catch (Exception e)
        {
            System.out.println("Not executed");
            System.out.println(e);
        }
        return(tot_rows);
    }
    
    public String[][] studentDetails() throws RemoteException {
        ResultSet rs;
        String str[][] = new String[50][6];
        int j=0;
        try {
            Connection conn=null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practical5","root","");
            Statement st=conn.createStatement();
            rs=st.executeQuery("SELECT * from student");
            while(rs.next()) {
                str[j][0]=Integer.toString(rs.getInt("rollno"));
                str[j][1]=rs.getString("name");
                str[j][2]=Integer.toString(rs.getInt("sub1"));
                str[j][3]=Integer.toString(rs.getInt("sub2"));
                str[j][4]=Integer.toString(rs.getInt("sub3"));
                j++;
                System.out.println("Record "+j+" added");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return(str);
    }
    
    public String[][] bookDetails() throws RemoteException {
        ResultSet rs;
        String str[][]= new String[50][6];
        int j=0;
        try {
            Connection conn=null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practical5","root","");
            Statement st=conn.createStatement();
            rs=st.executeQuery("SELECT * from library");
            while(rs.next()) {
                str[j][0]=Integer.toString(rs.getInt("BookId"));
                str[j][1]=rs.getString("BookName");
                str[j][2]=rs.getString("BookAuthor");
                str[j][3]=Integer.toString(rs.getInt("BookPrice"));
                str[j][4]=rs.getString("BookStatus");
                j++;
                System.out.println("Record "+j+" added");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return(str);
    }

        public String[][] billDetails() throws RemoteException {
        ResultSet rs;
        String str[][]= new String[50][6];
        int j=0;
        try {
            Connection conn=null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practical5","root","");
            Statement st=conn.createStatement();
            rs=st.executeQuery("SELECT * from mtnl");
            while(rs.next()) {
                str[j][0]=Integer.toString(rs.getInt("InvoiceId"));
                str[j][1]=Integer.toString(rs.getInt("CustomerId"));
                str[j][2]=rs.getString("CustomerName");
                str[j][3]=rs.getString("InvoiceDate");
                str[j][4]=Integer.toString(rs.getInt("Amount"));
                j++;
                System.out.println("Record "+j+" added");
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return(str);
    }
}
