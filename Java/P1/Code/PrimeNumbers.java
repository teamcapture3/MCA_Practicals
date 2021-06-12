import java.util.Scanner;
public class PrimeNumbers
{
  public static void main(String[] args)
  {
    //create scanner class object
    Scanner sc=new Scanner(System.in);
    //take input from user
    System.out.print("\nEnter the value of N : ");
    int N = sc.nextInt();
    System.out.println("\nPrime numbers between 1 and "+N+" are :\n");
    int count;
    //using loop to find and print all prime numbers between given range
    for(int i = 1 ; i <= N ; i++)
    {
      //logic for checking number is prime or not
      count = 0;
      for(int j = 1 ; j <= i ; j++) 
      {
        if(i % j == 0)
          count = count+1;
      }
      if(count == 2)
        System.out.println(i);
    }
    sc.close();
  }
}
