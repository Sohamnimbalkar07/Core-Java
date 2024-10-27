package lists;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {

	public static void main(String[] args) {
		int[] ints= {30,11,2,3,34,-10,25,10};
		//create empty AL n populate it with array data
		ArrayList<Integer> list=new ArrayList<>();
		for(int i : ints)
			list.add(i);//auto boxing
		System.out.println("Display list via toString "+list);
		System.out.println("Display list via for-each");
		//Can you attach an Iterator to the AL ? YES , implicit form of Iterator : for-each
		for(int i : list)//Integer---->int : auto done by javac : auto un boxing
			System.out.print(i+" ");//for-each iterates over size of the collection
		//double value of elem if elem > 20
		System.out.println("\ndoubling the values");
		for(int i=0;i<list.size();i++)
			if(list.get(i) > 20)
				System.out.println("Replaced "+list.set(i,list.get(i)*2));
		System.out.println("list again "+list);
		list.remove(1);
		System.out.println("list after remove "+list);//[60, 2, 3, 68, -10, 50, 10]
		ArrayList<Integer> list2=new ArrayList<>();
		int[] ints2= {11,10,2,3};
		for(int i : ints2)
			list2.add(i);
		System.out.println("list 2 "+list2);//[11,10,2,3]
		list.retainAll(list2);
		System.out.println("list after retain all "+list);//retains common elems  : [2, 3, 10]
		list.add(0,10);// [10,2, 3, 10]
		System.out.println("index "+list.indexOf(55)+" last index "+list.lastIndexOf(10));//0 3
		list.add(112);
		list.add(50);
		list.add(-10);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		
		
				
		
			

	}

}
