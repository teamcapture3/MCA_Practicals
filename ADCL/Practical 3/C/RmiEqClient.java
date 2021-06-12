import java.rmi.Naming;
import java.util.Scanner;

public class RmiEqClient {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        try {
            int a = 0,b = 0;
            RmiEqIntf stub = (RmiEqIntf)Naming.lookup("rmi://localhost:1099/EqSolver");
            System.out.println("\n\nSolving Equation : (a-b)^2 = a^2 - 2*a*b + b^2");
            System.out.println("\nEnter value of a and b: \n");
            a = sc.nextInt();
            b = sc.nextInt();
            stub.setValue(a,b);
            System.out.println("Calling Server to solve the equation ...");
            System.out.println("Answer : "+stub.getAns());
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
