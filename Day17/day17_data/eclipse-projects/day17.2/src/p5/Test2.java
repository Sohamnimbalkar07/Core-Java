package p5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {

	public static void main(String[] args) {
		//create a growable AL from a fixed size list of ints 
		List<Integer> ints= Arrays.asList(10,20,12,34,45,11,100,56,70);
		ArrayList<Integer> list=new ArrayList<>(ints);
		//remove all elems form list , > 40 n display the list again
		//higher order func/method
		//API of Collection i/f 
		//public default boolean removeIf(Predicate<? super T> filter)
		//Predicate : func i/f
		//SAM : public boolean test(T o)
//		list.removeIf(new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer t) {
//				// TODO Auto-generated method stub
//				return t > 40;
//			}
//			
//		});
		list.removeIf(i -> i > 40);
		list.forEach(i -> System.out.println(i));
	

	}

}
