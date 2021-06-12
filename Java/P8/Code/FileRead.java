import java.io.*;
import java.lang.NumberFormatException;
import java.util.Scanner;
public class FileRead
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in); 
		try
		{
			String newName = null ;
			long newNumber = 0 ;
			System.out.print("Enter Name: ");
			s.nextLine();
			System.out.print("Enter ID: ");
			s.nextInt();
			String nameNumberString;
			String name;
			long number;
			int index;
			File file = new File("E:\\empdetails.txt");
			if (!file.exists())
			{
				file.createNewFile();
			}
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			boolean found = false;
			while (raf.getFilePointer() < raf.length())
			{
				nameNumberString = raf.readLine();
				index = nameNumberString.indexOf('!');
				name = nameNumberString.substring(0, index);
				number = Long.parseLong(nameNumberString.substring(index + 1));
				if (name == newName || number == newNumber)
				{
					found = true;
					break; 
				}
			}
			if (found == false)
			{
				nameNumberString = newName+"!"+ String.valueOf(newNumber);
				raf.writeBytes(nameNumberString);
				raf.writeBytes(System.lineSeparator());
				System.out.println(" Employee added. ");
				raf.close();
			}
			else
			{
				raf.close();
				System.out.println(" The entered employee" + " already exists. ");
			}
		}
		catch (IOException ioe)
		{
			System.out.println(ioe);
		}
		catch (NumberFormatException nef)
		{
			System.out.println(nef);
		}
	}
}
