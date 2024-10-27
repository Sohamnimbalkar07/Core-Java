package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class BufferedFileCopyFunctional {

	public static void main(String[] args) {
		System.out.println("Enter src  file name");
		System.out.println("Enter dest file name");
		try (Scanner sc = new Scanner(System.in);
				// Java App <---- BR <--- FR <-----src Text file
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()));
				//Java App ---> PW ---> FW ---> dest text file
				PrintWriter pw=new PrintWriter(new FileWriter(sc.nextLine(), true)) //append mode
				) {
			br.lines() //Stream<String> 
			.forEach(s -> pw.println(s));//pw::println
			System.out.println("data copy over");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
