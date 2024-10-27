package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import com.app.core.Student;

public interface IOUtils {
//add a static method to store stream of student in a text file , using buffer
	static void storeStudentDetails(Stream<Student> students,String fileName) throws IOException
	{
		//Java App ---> PW ---> FW ---> Text file
		try(PrintWriter pw=new PrintWriter(new FileWriter(fileName)))
		{
			students.forEach(pw :: println);//s -> pw.println(s)
		}
	}
}
