package JavaApplication;
public class wrapper
{
    public static void main(String[] args)
    {
        int a=33;
        float f=21.45F;
        Integer i=Integer.valueOf(a);  
        Float j=Float.valueOf(f);   
        System.out.println("\nAddition: " +(i+j));
        System.out.println("\nSubstraction: " +(i-j));
        System.out.println("\nMultiplication: " +(i*j));
        System.out.println("\nDivision: " +(i/j));
        System.out.println("\nModolous: " +(i%j));
    }
}
