package generics;

import java.util.Arrays;
import java.util.List;

public class TestGenericMethod {

	public static void main(String[] args) {
		//API of Arrays class
		//generic method : public static <T> List<T> asList(T... args)
		//create fixed size list of ints : 10, 20,30,40,50
		List<Integer> intList=Arrays.asList(10, 20,30,40,50);//int--> Integer : auto boxing
		System.out.println(intList);
	//	intList.add(60);//exc : fixed size list : 
	//	intList.remove(0);
		System.out.println("replaced "+intList.set(0,999));
		System.out.println(intList);
	}

}
