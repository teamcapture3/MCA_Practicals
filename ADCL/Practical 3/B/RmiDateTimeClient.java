import java.rmi.Naming;
import java.util.Scanner;

public class RmiDateTimeClient {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        try{int inp =0;
        do{
            DateTimeRmiIntf stub = (DateTimeRmiIntf)Naming.lookup("rmi://localhost:1099/dt");
            System.out.print("Select option :\n");
            System.out.println("1. Date of Server\n2.Time of Server\n3. Exit\n");
			System.out.println("Enter your choice: ");
            inp = Integer.parseInt(sc.nextLine());
            switch(inp){
                case 1:
                    System.out.println("Server Date :"+stub.getServerDate());
                    break;
                case 2:
                    System.out.println("Server Time :"+stub.getServerTime());
                    break;
                case 3:
                    System.out.println("Exiting!!!");
                    break;
            }
        }
        while(inp != 3);
        }
        catch(Exception e){
            System.out.println(e);
        }
    } 
}
