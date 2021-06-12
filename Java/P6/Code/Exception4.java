import java.util.*;
public class Exception4
{
	private static Scanner s;

	public static void main(String args[])
	{
		s = new Scanner(System.in);
		Account acct = new Account();
		int amt = 0;
		System.out.println("Current balance: " + acct.balance());
		System.out.println("Enter amount to be withdrawn: ");
		amt = s.nextInt();
		acct.withdraw(amt);
		System.out.println("Current balance: " + acct.balance());
		System.out.println("Enter amount to be withdrawn: ");
		amt = s.nextInt();
		acct.withdraw(amt); 
	}
}
class Account
{
	private int balance = 1000;
	public int balance()
	{
		return balance;
	}
	public void withdraw(int amount) throws	NotSufficientFundException
	{
		if (amount > balance)
		{ 
			throw new 
				NotSufficientFundException( String.format( "Current balance:"+ balance +" is less than requested amount:" +amount ));
		}
		balance = balance - amount;
	}
	public void deposit(int amount)
	{
		if (amount <= 0)
		{
			throw new IllegalArgumentException(String.format("Invalid deposit amount:"+ amount));
		}
	}
}
class NotSufficientFundException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	public NotSufficientFundException(String message)
	{
		this.message = message;
	}
	public NotSufficientFundException(Throwable cause, String message)
	{
		super(cause);
		this.message = message;
	}
	public String getMessage()
	{
		return message;
	}
}
