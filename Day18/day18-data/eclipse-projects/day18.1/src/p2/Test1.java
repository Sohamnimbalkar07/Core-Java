package p2;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		// 1.Create int[] ---> IntStream & display its contents.
		int[] data= {10,23,45,12,11,90,-89};
		//API Help
		//Arrays class method
		//public IntStream stream(int[] ints)
		//IntStream method : public void forEach(IntConsumer consumer)
		//Streams : src ---intermediate ops(0...n) ---terminal op
		System.out.println("printing arrary contents ---> IntStream --> forEach -- lambda expr");
		Arrays.stream(data) //IntStream : src
		.forEach(i -> System.out.println(i));//terminal op
		System.out.println("printing arrary contents ---> IntStream --> forEach -- meth ref");
		Arrays.stream(data) //IntStream : src
		.forEach(System.out::println);
		
	}

}
