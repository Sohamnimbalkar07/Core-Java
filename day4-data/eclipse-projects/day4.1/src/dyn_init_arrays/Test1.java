package dyn_init_arrays;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		//dynamic init of array : cls loading([I) ,array obj created in heap , array inited
		int[] ints= {1,2,3,4,5};//javac adds implictly new int[]
		for(int i : ints)
			System.out.println(i);
		int[] ints2=new int[] {10,20,30};
//		for(int i : ints2)
//			System.out.println(i);
		System.out.println("Array contents "+Arrays.toString(ints2));
		

	}

}
