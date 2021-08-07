/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

/**
 *
 * @author ninad
 */
public class CalcServer {
    public static void main(String args[]) throws IOException
    {
        ServerSocket ss = new
        ServerSocket(4444);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        while (true)
        {
            String input = dis.readUTF();
            if(input.equals("bye"))
                break;
            System.out.println("Equation received: " +input);
            int result = 0;
            StringTokenizer st = new StringTokenizer(input);
            int oprnd1 = Integer.parseInt(st.nextToken());
            String operation = st.nextToken();
            int oprnd2 = Integer.parseInt(st.nextToken());
            int c = 0;
            if (operation.equals("+"))
            {
                result = oprnd1 + oprnd2;
            }
            else if (operation.equals("*"))
            {
                result = oprnd1 * oprnd2;
            }
            else if (operation.equals("-"))
            {
                result = oprnd1 - oprnd2;
            }
            else if (operation.equals("/"))
            {
                if (oprnd2==0)
                    c++;
                else
                    result = oprnd1 / oprnd2;
            }
            else
            {
                result = oprnd1 % oprnd2;
            }
            System.out.println("Sending the result...");
            if (c!=0)
                dos.writeUTF("Divided by zero operation cannot be possible");
            else
                dos.writeUTF(Integer.toString(result));
        }
    }
}