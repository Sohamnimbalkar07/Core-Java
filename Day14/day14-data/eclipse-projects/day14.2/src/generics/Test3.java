package generics;

import java.util.Arrays;
import java.util.List;
import static generics.GenericUtils.*;

public class Test3 {

	public static void main(String[] args) {
		List<String> list1=Arrays.asList("hello","hi","bye","testing");
		System.out.println("printing string list");
		printList(list1);
		List<Integer> list2=Arrays.asList(10,29,45,67,11);
		System.out.println("printing integer list");
		printList(list2);
		List<Emp> emps=Arrays.asList(new Emp(),new Emp(),new Emp());
		System.out.println("printing emp list");
		printList(emps);
		System.out.println("printing string list again");
		printList2(list1);

	}

}
