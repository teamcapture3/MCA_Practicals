/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical7;

import static Practical7.MyServer.resource;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author ninad
 */
public class MyServer {
    public static Vector<ClientHandler> clientList=new Vector<>();
    static int clientCounter=1;
    static String currentClient="";
    static String resource="";
    static Thread newServerThread;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(6666);
            Socket clientSocket;
            System.out.println("Server Starts");
            newServerThread=new Thread(new Runnable() {
                @Override
                public void run() {
                    while(true) {
                        for(int i=0;i<clientList.size();i++) {
                            try {
                                clientList.get(i).clientOutput.writeUTF("Do you want to change the resource value? \n Yes \n No \n End");
                                clientList.get(i).clientOutput.flush();
                                currentClient=clientList.get(i).clientName;
                                clientList.get(i).token=true;
                                Thread.sleep(10000);
                                clientList.get(i).token=false;
                                currentClient="";
                            }
                            catch(Exception e) { }
                        }
                    }
                }
            });
            newServerThread.start();
            while(true) {
                clientSocket=serverSocket.accept();
                DataInputStream clientInput=new DataInputStream(clientSocket.getInputStream());
                DataOutputStream clientOutput=new DataOutputStream(clientSocket.getOutputStream());
                String clientName="Client "+clientCounter++;
                System.out.println(clientName+" joined");
                clientOutput.writeUTF("Connected to server\n");
                clientOutput.writeUTF("=>To disconnect, Type \'end\'\n");
                clientOutput.flush();
                ClientHandler client=new ClientHandler(clientSocket,clientName,clientInput,clientOutput);
                Thread clientThread=new Thread(client);
                clientList.add(client);
                clientThread.start();
            }
        }
        catch(Exception e) {
            System.out.println("Server Stopped");
            System.out.println("Server Error: "+e);
            e.printStackTrace();
        }
    }
}
class ClientHandler implements Runnable {
    Scanner scan = new Scanner(System.in); 
    final String clientName; 
    final DataInputStream clientInput; 
    final DataOutputStream clientOutput; 
    Socket clientSocket; 
    String receivedMessage="";
    boolean token=false;
    public ClientHandler(Socket clientSocket1,String clientName1,DataInputStream clientInput1,DataOutputStream clientOutput1) {
        this.clientSocket=clientSocket1;
        this.clientName=clientName1;
        this.clientInput=clientInput1;
        this.clientOutput=clientOutput1;
    }
    @Override
    public void run() {
        while (true) { 
            try {
                if(clientSocket.isClosed()) { 
                    System.out.println(this.clientName+" disconnected");
                    MyServer.clientList.remove(this);
                    break; 
                } 
                if(MyServer.currentClient.equals(clientName)) {
                    receivedMessage=clientInput.readUTF();
                    if(receivedMessage.equals("end")) {
                        clientOutput.writeUTF("You have been disconnected from the Server");
                        clientOutput.flush();
                        this.clientSocket.close();
                        System.out.println(this.clientName+" disconnected");
                        MyServer.clientList.remove(this);
                        break; 
                    }
                    if(token) {
                        if(receivedMessage.equals("Yes") || receivedMessage.equals("yes")) {
                            clientOutput.writeUTF("Enter the value of resource");
                            clientOutput.flush();
                            String resourceValue=clientInput.readUTF();
                            if(token) {
                                resource=resourceValue;
                                clientOutput.writeUTF("Resource value changed to "+resource);
                                clientOutput.flush();
                                System.out.println("Resource value changed to "+resource+" "+clientName);
                            }
                        }
                    }
                }
            } 
            catch (IOException e) {
                try {
                    clientSocket.close();
                    System.out.println(this.clientName+" disconnected");
                }
                catch(Exception ex) { }
                break;
            } 
        } 
        try {
            this.clientInput.close(); 
            this.clientOutput.close(); 
        }
        catch(IOException e) {
            e.printStackTrace(); 
        }
    }
}
