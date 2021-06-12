/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ninad
 */
public class DateTimeServer {
    public static void main(String args[]) throws Exception
    {
        ServerSocket s = new ServerSocket(5217);
        while(true){
            System.out.println("Waiting For Connection" + "...");
            Socket soc=s.accept();
            DataInputStream dis = new DataInputStream(soc.getInputStream());
            DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
            Date dateObj = new Date();
            while (true)
            {
                String input = dis.readUTF();
                String ope="";
                if(input.equals("3"))
                    break;
                else if(input.equals("1"))
                    ope = "Date of Server";
                else if(input.equals("2"))
                    ope = "Time of Server";
                System.out.println("Request received for" +ope);
                System.out.println("Sending the result...");
                if(input.equals("1"))
                {
                    SimpleDateFormat df = new SimpleDateFormat("MM/dd/YYYY");
                    String formattedDate = df.format(dateObj);
                    dos.writeUTF("Server Date : " +formattedDate );
                }else if(input.equals("2"))
                {
                    SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss");
                    String formattedTime = df.format(dateObj);
                    dos.writeUTF("Server Time : " +formattedTime);
                }
            }
        }
    }
}
