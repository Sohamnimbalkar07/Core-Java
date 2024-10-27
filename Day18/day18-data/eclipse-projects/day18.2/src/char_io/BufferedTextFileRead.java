package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BufferedTextFileRead {

	public static void main(String[] args) {
		System.out.println("Enter file name");
		try (Scanner sc = new Scanner(System.in);
				// Java App <---- BR <--- FR <-----Text file
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
			String line = null;
			while ((line = br.readLine()) != null)
				System.out.println(line);
			System.out.println("data read over");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
