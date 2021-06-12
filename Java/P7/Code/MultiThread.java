class MultiThread extends Thread
{ 
	public void run()
	{
		int i =0;
		int num =0;
		int count1=1;
		for (i = 1; i <= 10; i++)
		{
			int counter=0;
			for(num =i; num>=1; num--)
			{
				if(i%num==0)
				{
					counter = counter + 1;
				}
			}
			if (counter ==2)
			{
				System.out.println(count1+" Prime number is :"+i+ " ");
				count1++;
			}
		}
	}
}
class startingeven extends Thread
{
	int count1=0;
	public void run()
	{
		for(int i=1;i<=10;i++) 
		{
			if(i%2==0) 
			{
				System.out.println(++count1+" even number is : "+i);
			}
		}
	}
}
class fibo extends Thread
{
	long a=0,b=1,c=0,n=1;
	public void run() 
	{
		while(a<10) 
		{
			System.out.println(n+"th" +" Fib no: = "+a);
			n++;
			c=a+b;
			a=b;
			b=c;
			try 
			{
				if(a==21) 
				{
					Thread.sleep(500);
				}
			}
			catch(Exception e)
			{}
		}
	}
}
class Main 
{
	public static void main(String[] args) 
	{
		MultiThread sp = new MultiThread();
		startingeven se = new startingeven();
		fibo fb = new fibo();
		sp.start();
		se.start();
		fb.start();
	}
}
