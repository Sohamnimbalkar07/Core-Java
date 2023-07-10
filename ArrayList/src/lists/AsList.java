package lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class AsList {
	public static void main(String[] args) {

	List<Integer> list =Arrays.asList(10,20,30,40,50);
	System.out.println(list);
	Collections.shuffle(list);
	System.out.println(list);
	ArrayList<Integer> list1 = new ArrayList<>(list);
	System.out.println(list1);
	}
}
