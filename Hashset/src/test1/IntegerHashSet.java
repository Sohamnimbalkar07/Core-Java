package test1;
import java.util.HashSet;
public class IntegerHashSet {
	
public static void main(String[] args) 
   
    {
		 HashSet<Integer> intset = new HashSet<>();
		 int[] data = {12,34,7,21,56,34,87};
		 for(int i : data)
		 {
			 intset.add(i);
		 }
	   System.out.println(intset);
	   System.out.println(intset.contains(12));
	   System.out.println(intset.contains(9));
	   System.out.println(intset.add(12));
	   
	
	}
	

}


