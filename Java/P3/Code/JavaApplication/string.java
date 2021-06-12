package JavaApplication;
import java.util.*;
public class string
{
    public static void main(String[] args)
    {
        String s;
        Scanner s1=new Scanner(System.in);
        System.out.print("\n Enter string:");
        s=s1.nextLine();
        System.out.println("\n chatAt:" +s.charAt(2));
        System.out.println("\n concat:" +s.concat(" good"));
        System.out.println("\n toLowerCase:" +s.toLowerCase());
        System.out.println("\n toUpperCase:" +s.toUpperCase());
        System.out.println("\n length:" +s.length());
        System.out.println("\n replace:" +s.replace("hello","hi"));
        System.out.println("\n equalsIgnoreCase:" +s.equalsIgnoreCase("HEllo"));
        System.out.println("\n indexOf:" +s.indexOf("l"));
        System.out.println("\nsubstring:" +s.substring(4)+ "\n\n substring:" +s.substring(3,7));
     }
}
