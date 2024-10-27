package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/*
 * Read data from text file using buffer , till EOF(end of file) , filter lines having  line length > 50  , upper case contents n then display it.
br --> stream(lines) ---> filter --> map --> forEach
 */
public class BufferedTextFileReadFunctional2 {

	public static void main(String[] args) {
		System.out.println("Enter file name");
		try (Scanner sc = new Scanner(System.in);
				// Java App <---- BR <--- FR <-----Text file => chain of i/o strms
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
			br.lines() // Stream<String>
			.filter(s -> s.length() > 50) //Stream<String> : filtered
			.map(String::toUpperCase)//Strem<String> : mapped to upper case : s -> s.toUpperCase()
					.forEach(System.out::println);
			System.out.println("data read over");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
