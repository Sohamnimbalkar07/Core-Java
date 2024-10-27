package p1;

import java.util.Arrays;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		//integer list of the fixed size
		List<Integer> list=Arrays.asList(10,23,1,2,3,456);
		//display the elems using lambda expression
		System.out.println("printing list via lambda expr");
		list.forEach(i -> System.out.println(i));
		System.out.println("printing list via method ref");
		//can above lambda expression be replaced by meth ref ? YES
		list.forEach(System.out::println);
		System.out.println("printing list on the same line via lambda expr");
		list.forEach(i -> System.out.print(i+" "));
		//can above lambda expression be replaced by meth ref ? NO !!!!
	

	}

}
