package p5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test1 {

	public static void main(String[] args) {
		//create a fixed size list of ints 
		List<Integer> ints= Arrays.asList(10,20,12,34,45,11,100,56,70);
		//display it using a higher order func : forEach : ano inner class
		//Is List Iterable ? YES 
		//API : Iterable : public void forEach(Consumer ref)
		ints.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
			
		});
		//replace ano inner cls by lambda expr
		System.out.println("using lambda expr");
		ints.forEach(i -> System.out.println(i));

	}

}
