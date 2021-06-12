import java.util.*;
public class Exception2
{
	private static int total;
	private static String name;
	private static int roll;
	private static Scanner s;
	public static void main(String x[])
	{
		int subj1 = 0,subj2 = 0,subj3 = 0;
		double per = 0;
		s = new Scanner(System.in);
		try
		{
			System.out.println("Enter Roll Number: ");
			setRoll(Integer.parseInt(s.next()));
			System.out.println("Enter Name: ");
			setName(s.next());
			System.out.println("Enter marks for 3 Subjects: ");
			subj1 = Integer.parseInt(s.next());
			subj2 = Integer.parseInt(s.next());
			subj3 = Integer.parseInt(s.next());
		}
		catch(Exception e)
		{
			System.out.println("Error" + e);
		}
		per = (subj1 + subj2 + subj3)/300.0;
		System.out.println("Percentage: "+ per*100);
	}
	public static int getTotal()
	{
		return total;
	}
	public static void setTotal(int total)
	{
		Exception2.total = total;
	}
	public static String getName()
	{
		return name;
	}
	public static void setName(String name)
	{
		Exception2.name = name;
	}
	public static int getRoll()
	{
		return roll;
	}
	public static void setRoll(int roll)
	{
		Exception2.roll = roll;
	}
}
