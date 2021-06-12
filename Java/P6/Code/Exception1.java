import java.util.*;
public class Exception1
{
	private static int i;
	private static Scanner s;
	private static int arrs[];
	public static void main(String a[])
	{
		setI(0);
		System.out.print("Enter value:");
		s = new Scanner(System.in);
		int size = s.nextInt();
		try
		{
			 setI(100/size);
			setArrs(new int[size]);
		}
		catch(ArithmeticException e)
		{
			System.out.print("Divide by Zero Exception: " +e);	
		}
		catch(NegativeArraySizeException e) {
			System.out.print("\nNegative Array Size Exception: " +e);	
		}
	}
	public static int getI()
	{
		return i;
	}
	public static void setI(int i)
	{
		Exception1.i = i;
	}
	public static int[] getArrs()
	{
		return arrs;
	}
	public static void setArrs(int arrs[])
	{
		Exception1.arrs = arrs;
	}
}
