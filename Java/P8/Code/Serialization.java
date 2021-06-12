import java.io.*;
public class Serialization
{
	private static ObjectOutputStream outbr;
	public static void main(String[] args)
	{
		try
		{
			Student s1= new Student();
			s1.Students(33, "Ninad");
			FileOutputStream out=new FileOutputStream ("E:\\serialization.txt");
			outbr = new ObjectOutputStream(out);
			outbr.writeObject(s1);
			System.out.println("done ");
			outbr.flush();
			FileInputStream in =new FileInputStream("E:\\serialization.txt");
			ObjectInputStream br=new ObjectInputStream(in);
			Student s=(Student)br.readObject();
			System.out.println(s.id+" "+s.name);
			br.close();
			System.out.println("end");
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
	}
}
class Student implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	public void Students(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
}
