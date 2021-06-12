/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author ninad
 */
public class CalcClient {
    public static void main(String[] args)throws IOException
    {
        InetAddress ip = InetAddress.getLocalHost();
        int port = 4444;
        Scanner sc = new Scanner(System.in);
        Socket s = new Socket(ip, port);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        while(true)
        {
            System.out.println("Enter the equation in the following format: ");
            System.out.println("operand operator operand");
            String inp = sc.nextLine();
            if(inp.equals("bye"))
                break;
            dos.writeUTF(inp);
            String ans = dis.readUTF();
            System.out.println("Answer: "+ans);
        }
    }
}


