package Com.Day4;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.*;

public class FileInput {

	public static void main(String[] args) {
		try {
		
		FileOutputStream fout=new FileOutputStream("C:\\javaClass\\java.txt");
		ByteArrayOutputStream bout=new ByteArrayOutputStream();
		InputStream in =new FileInputStream("C:\\javaClass\\java1.txt");
		
		bout.write(in.readAllBytes());
		in.close();         
		bout.writeTo(fout);
		bout.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
