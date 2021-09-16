/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author ninad
 */
public class RmiClient {
    public static void main(String args[]) {
        String allresult[][] = new String[50][6];
        int ch, stcnt, rollno, sub1, sub2, sub3;
        int j = 0; stcnt = 0;
        System.out.println("Please choose from below options :\n");
        System.out.print("1.Retreive Student Information From College Database\t");
        System.out.print("2.Retreive Book Details From Library Database");
        System.out.print("\n3.Retreive Billing Details From MTNL Database\t\t");
        System.out.println("4.Exit");
        try {
            do {
                Registry reg = LocateRegistry.getRegistry(1099);
                RmiIntf stub = (RmiIntf)reg.lookup("student");
                System.out.println("\nEnter your choice: ");
                BufferedReader reader;
                reader=new BufferedReader(new InputStreamReader(System.in));
                ch=Integer.parseInt(reader.readLine());
                switch(ch){
                    case 1:
                        stcnt = stub.countrec("practical5","student");
                        j = 0;
                        allresult=stub.studentDetails();
                        System.out.println("RollNo \tName \tSub1 \tSub2 \tSub3");
                        while(j!=stcnt)
                        {
                            System.out.print(""+allresult[j][0]+"\t"+allresult[j][1]+"\t"+allresult[j][2]+"\t"+allresult[j][3]+"\t"+allresult[j][4]+"\n");
                            j++;}
                        break;
                    case 2:
                        stcnt = stub.countrec("practical5","library");
                        j = 0;
                        allresult=stub.bookDetails();
                        System.out.println("BookId \tBookName \tBookAuthor \tBookPrice \tBookStatus");
                        while(j!=stcnt) {
                            System.out.print(""+allresult[j][0]+"\t"+allresult[j][1]+"\t\t"+allresult[j][2]+"\t"+allresult[j][3]+"\t\t"+allresult[j][4]+"\n");
                            j++;}
                        break;
                    case 3:
                        stcnt = stub.countrec("practical5","mtnl");
                        j = 0;
                        allresult=stub.billDetails();
                        System.out.println("InvoiceId \tCustomerId \tCustomerName \tInvoiceDate \tAmount");
                        while(j!=stcnt) {
                            System.out.print(""+allresult[j][0]+"\t\t"+allresult[j][1]+"\t\t"+allresult[j][2]+"\t\t"+allresult[j][3]+"\t"+allresult[j][4]+"\n");
                            j++;}
                        break;
                    case 4:
                        System.out.println("Thank You !!!");
                        System.exit(0);
                }
            }
            while(ch!=4);}
        catch(Exception e){}
    }
}
