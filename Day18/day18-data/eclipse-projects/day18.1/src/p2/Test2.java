package p2;

import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * 2. Create AL<Integer> , populate it. Convert it to seq stream & display elems
		 */
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(10,23,45,12,11,90,-89));
		System.out.println("Attaching seq . strm to a list --> displaying elems");
		//attach seq stream
		//Collection i/f method : Stream<T> stream()
		list.stream() //Stream<Integer>
		.forEach(i -> System.out.print(i+" "));
		System.out.println("Attaching  strm for  parallel processing ,  to a list --> displaying elems");
		//attach seq stream
		//Collection i/f method : Stream<T> parallelstream()
		list.parallelStream() //Stream<Integer>
		.forEach(i -> System.out.print(i+" "));
		
		
		

	}

}
