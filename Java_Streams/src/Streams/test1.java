package Streams;

import java.util.stream.IntStream;

public class test1 {

	public static void main(String[] args) {
		
		IntStream intstream = IntStream.range(5,50)
		.filter((i) -> i %2 == 0);
		
		
		intstream.forEach((i) -> System.out.println(i));
		
		intstream.forEach((i) -> System.out.println(i) );
		
		

	}

}
