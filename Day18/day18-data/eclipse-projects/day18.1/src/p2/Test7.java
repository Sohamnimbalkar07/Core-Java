package p2;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Test7 {

	public static void main(String[] args) {
		// Display average of all odd nos between 1-100 .
		OptionalDouble optional=IntStream.range(1, 101)
		.filter(i -> i % 2 != 0)
		.average();
		if(optional.isPresent())
			System.out.println("Avg ="+optional.getAsDouble());
		else
			System.out.println("Empty optional");
		//10 20 30 40 50
		System.out.println("Avg = "+IntStream.of(10, 20, 30 ,40 ,50,31)
		.filter(i -> i % 2 != 0)
		.average().getAsDouble());

	}

}
