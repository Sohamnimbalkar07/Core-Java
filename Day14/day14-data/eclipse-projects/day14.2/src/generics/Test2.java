package generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		//create a fixed size list of strings : hello , hi , bye, testing
		List<String> list1=Arrays.asList("hello","hi","bye","testing");
		//shuffle it n display the same
		Collections.shuffle(list1);
		System.out.println("shuffled  list "+list1);
		//create fixed size list of ints(10,29,45,67,11)  n shuffle it n display it.
		List<Integer> list2=Arrays.asList(10,29,45,67,11);
		Collections.shuffle(list2);
		System.out.println("shuffled  list "+list2);
		//reversing list elements
		Collections.reverse(list2);
		System.out.println("reversed list "+list2);
		

	}

}
