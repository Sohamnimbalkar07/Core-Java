package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
		
		System.out.println("enter file names in two different lines");
		
		try(
			Scanner sc = new Scanner(System.in);
			BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()));
			PrintWriter pw = new PrintWriter(new FileWriter(sc.nextLine()));
			)
		{
//			String s = null;
//			while((s= br.readLine()) != null)
//			{
//				pw.println(s);
//			}
//			System.out.println("File copy done!");
			
			br.lines()// Stream<String>
		    .forEach(line -> pw.println(line));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
