public class Duplicate
{
  public static void main(String[] args)
    {
        int array[] = {2, 4, 8, 12, 8, 16, 4, 2};
 
        for (int i = 0; i < array.length-1; i++)
        {
            for (int j = i+1; j < array.length; j++)
            {
                if ((array[i] == array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+array[j]);
                }
            }
        }
    }    
}