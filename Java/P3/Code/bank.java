import java.util.*;
interface bank
{
    void open();
    void deposit();
    void withdraw();
    void close();
}
class SBI implements bank
{  
    int dep,with,temp,temp1; 
    int acc_no;
	private Scanner s;
	private Scanner s2;
	private Scanner s3;
	private Scanner s4;
    
    public void open()
    {
        s = new Scanner(System.in);
        System.out.print("\nEnter account no to open account:");
        acc_no=s.nextInt();
        
        System.out.println("\nAccount number:" +acc_no);
    }
    public void deposit()
    {
        s2 = new Scanner(System.in);
        
        System.out.print("\nEnter account no to deposit cash:");
        acc_no=s2.nextInt();

        System.out.print("\nDeposit amount:");
        dep = s2.nextInt();
        
        System.out.print("\nDeposited cash is:" +dep);

    }
    public void withdraw()
    {
        s3 = new Scanner(System.in);

        System.out.print("\n\nEnter account no to withdraw cash:");
        acc_no=s3.nextInt();
        
        System.out.print("\nWithdraw cash:");
        with=s3.nextInt();
        if(with<dep)
        {
            dep=dep-with;
            System.out.println("\nWithdrew cash is:" +with);
            System.out.println("\nBalance cash is:" +dep);
        }
        else
        {
            System.out.print("\nNo funds");
        }
    }
    public void close()
    {
         s4 = new Scanner(System.in);

        System.out.print("\nEnter account to close account:");
        acc_no=s4.nextInt();
        
        System.out.println("\nAccount Closed");
        System.exit(0);
                
    }
}
class bank1
{
    public static void main(String[] args)
    {
        SBI obj = new SBI();
        obj.open();
        obj.deposit();
        obj.withdraw();
        obj.close();
    }
}
