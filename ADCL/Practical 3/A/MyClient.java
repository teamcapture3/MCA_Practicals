import java.rmi.Naming;
import java.util.Scanner;

public class MyClient {
    public static void main(String args[])
    {
        try
        {
            double a;
            double b;
            System.out.println("Enter two numbers: ");
            Scanner in = new Scanner(System.in);
            a = in.nextDouble();
            b = in.nextDouble();
            int opt;
            Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/sonoo");
            do
            {
                System.out.println("Choose a valid option: \n1. Add\n2. Sub\n3. Mul\n4. Div\n5. Modulo\n6. Exit");
                opt = in.nextInt();
                switch(opt)
                {
                    case 1:
                        System.out.println("Addition:\t"+stub.add(a,b));
                        break;
                    case 2:
                        System.out.println("Subtraction:\t"+stub.sub(a,b)); 
                        break;
                    case 3:
                        System.out.println("Multiplication:\t"+stub.mul(a,b));
                        break;
                    case 4:
                        System.out.println("Division:\t"+stub.div(a,b));
                        break;
					case 5:
                        System.out.println("Modulo:\t"+stub.mod(a,b));
						break;
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("Select a proper option.");
                        break;
                }
            }
            while(opt != 6);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    } 
}
