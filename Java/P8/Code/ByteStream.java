import java.io.*;
public class ByteStream {
	private static FileOutputStream t_stream;

	public static void main(String[] args) throws IOException{
		FileInputStream s_stream = null;
		setT_stream(null);
		try	{
			s_stream = new FileInputStream("E:\\ninad.txt");
			int temp;
			while ((temp = s_stream.read()) != -1)
				System.out.print((byte)temp+ " ");
		}
		finally	{
			if (s_stream != null)
				s_stream.close();
		}
	}

	public static FileOutputStream getT_stream() {
		return t_stream;
	}

	public static void setT_stream(FileOutputStream t_stream) {
		ByteStream.t_stream = t_stream;
	}
}
