package Streams;

import java.util.Arrays;
import java.util.List;

public class test {

	public static void main(String[] args) {
		
		int [] arr = {2,3,6,1,9,7,5,8};
		
		
        List<Integer> myList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Arrays.stream(arr)
		.filter((i) -> i%2 == 0)
		.filter((i) -> i > 5)
		.forEach((i) -> System.out.println(i));
		
		int sumarray = myList.stream()
		.filter((i) -> i%2 == 0)
		.mapToInt(Integer::intValue)
		.sum();

	    System.out.println(sumarray);
	}

}
