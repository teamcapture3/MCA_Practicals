public class Exception3
{
	public static void main(String args[])
	{  
		try
		{
			try
			{  
				System.out.println("Divide by Zero:");  
				@SuppressWarnings("unused")
				int b =3/0;  
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}  
			try
			{  
				int a[]=new int[5];  
				a[5]=3;  
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}  
			System.out.println("Code 1....");  
		}
		catch(Exception e)
		{
			System.out.println("Outer catch Exception");
		}  
		System.out.println("Normal flow..");  
	}  
}  
