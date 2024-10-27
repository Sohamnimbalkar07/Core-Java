package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Test13 {

	  public static void main(String[] args) {
		  ArrayList<Integer> arr = new ArrayList<>();
		 arr.add(1);
		 arr.add(3);
		 arr.add(5);
		 arr.add(6);
		 arr.add(8);
		 ArrayList<Integer> low = new ArrayList<>();
		 low.add(2);
		 
		 ArrayList<Integer> high = new ArrayList<>();
		 high.add(6);
		    System.out.println(count(arr, low, high));
		  }

		  public static int count(List<Integer> arr ,List<Integer> l,List<Integer> r ) {
			  int count=0;
			 int low = l.get(0);
			 int high = r.get(0);
			 for(int i : arr ) {
				 if(i>=low && i<=high)
					 count++;
			 }
		    return count;
		  }


}
