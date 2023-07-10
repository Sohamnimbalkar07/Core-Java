package lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test2 {

	

	public static void main(String[] args) {
		
		int[] ints = {30,11,2,3,34,-10,25,10};
		
		ArrayList<Integer> list = new ArrayList<>();
        for(int i : ints)
        {
        	list.add(i);
        }
        
        System.out.println(list);
        
        for(int i : list)
        {
        	System.out.print(i+ " ");
        }
        
        System.out.println();
        for(int i = 0; i<list.size();i++)
        {
        	System.out.print(list.get(i) + " " );
        }
        
        list.add(2,30);
        System.out.println();
        System.out.println(list.get(2));
        
        
        list.set(2, 2*list.get(2));
        
        list.remove(0);
        
        System.out.println(list.get(2));
        System.out.println(list);
        
        Collections.sort(list);
        System.out.println(list);
        
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext())
        {
        	System.out.print(itr.next() + " ");
        }
        
	}

}
