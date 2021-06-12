import java.io.*;
public class CharacterStream
{
	public static void main(String x[]) throws IOException
	{
		FileReader s_stream = null;
		try
		{
			s_stream = new FileReader("E:\\ninad.txt");
			int temp;
			while ((temp = s_stream.read()) != -1)
			System.out.print((char)temp + " ");
		}
		finally
		{
			if (s_stream != null)
				s_stream.close();
		}
	}
}
