/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author ninad
 */
public class DateTimeClient {
    public static void main(String args[]) throws Exception
    {
        Socket s = new Socket(InetAddress.getLocalHost(),5217);
        Scanner sc = new Scanner(System.in);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        while (true)
        {
            System.out.print("\nSelect option :\n");
            System.out.println("1. Date of Server\n2. Time of Server\n3. Exit");
            String inp = sc.nextLine();
            if (inp.equals("3"))
                break;
            dos.writeUTF(inp);
            String ans = dis.readUTF();
            System.out.println(ans);
        }
    }
}
