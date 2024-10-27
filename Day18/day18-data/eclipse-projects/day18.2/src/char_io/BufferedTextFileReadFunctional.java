package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BufferedTextFileReadFunctional {

	public static void main(String[] args) {
		System.out.println("Enter file name");
		try (Scanner sc = new Scanner(System.in);
				// Java App <---- BR <--- FR <-----Text file
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
			br.lines() //Stream<String> 
			.forEach(System.out::println);
			System.out.println("data read over");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
