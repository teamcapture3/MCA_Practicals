import java.io.*;
public class BufferWrite
{
	public static void main(String[] args) throws Exception
	{
		FileWriter writer = new FileWriter("E:\\ninad.txt");
		BufferedWriter buffer = new BufferedWriter(writer);
		buffer.write("Hello World!!");
		buffer.close();
		System.out.println("Write Successful");
	}
}
