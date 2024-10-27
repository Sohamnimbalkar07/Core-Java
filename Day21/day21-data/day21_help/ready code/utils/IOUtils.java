package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.stream.Stream;

import com.app.core.Student;

public class IOUtils {
	//add a static method to store sorted student details , in text file , using buffer
	public static void storeData(String fileName,ArrayList<Student> list) throws IOException
	{
		//Java App ---> PW ---> FW --> Text File
		try(PrintWriter pw=new PrintWriter(new FileWriter(fileName)))
		{
			//write student details from the strm ---> PW ---> FW --> text file
			list.forEach(s -> pw.println(s));
		}
	}

}
