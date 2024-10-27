package p2;

import java.util.stream.IntStream;

public class Test6 {

	public static void main(String[] args) {
		// Display sum of all even nos between 1-100 .
		System.out.println("Sum of even nos between 1-100 =" + IntStream.rangeClosed(1, 100)// 1-100
				.filter(i -> i % 2 == 0)
				.sum());

	}

}
