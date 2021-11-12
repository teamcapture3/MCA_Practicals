/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical7;

import Practical7.MyClient;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author ninad
 */
public class MyClient {
    final static int ServerPort = 6666;
    static String recievedMsg="";
    
    public MyClient() throws UnknownHostException, IOException, InterruptedException {
        Scanner scan = new Scanner(System.in); 
        InetAddress ip = InetAddress.getByName("localhost");
        Socket clientSocket = new Socket(ip, ServerPort); 
        DataInputStream clientInput = new DataInputStream(clientSocket.getInputStream()); 
        DataOutputStream clientOutput = new DataOutputStream(clientSocket.getOutputStream());
        Thread sendMessage = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    String msg = scan.nextLine();
                    recievedMsg=msg;
                    try {
                        clientOutput.writeUTF(msg);
                        clientOutput.flush();
                        if(msg.equals("end")) {
                            break;
                        }
                    } 
                    catch (IOException e) {
                        try {
                            clientSocket.close();
                        } 
                        catch (Exception ex) { }
                        break;
                    } 
                }
            } 
        }); 
        Thread readMessage = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        String msg = clientInput.readUTF();
                        System.out.println(msg);
                        if(recievedMsg.equals("end")) {
                            break;
                        } 
                    } 
                    catch (IOException e) { 
                        try {
                            clientSocket.close();
                            System.out.println("Server is closed");
                        } 
                        catch (Exception ex) { }
                        break;
                    } 
                }
                try {
                    Thread.sleep(5000);
                    clientSocket.close();
                } 
                catch (Exception ex) { }
            } 
        }); 
        sendMessage.start(); 
        readMessage.start(); 
    }
    public static void main(String [] args) {
        try {
            MyClient myclient=new MyClient();
        } 
        catch (Exception ex) {
            System.out.println("Server is closed");
        }
    }
}
