package sets;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TestTreeSet1 {

	public static void main(String[] args) {
		// create fixed size list of ints : 10,20 10,23,45,678,123,-10,11
				List<Integer> ints=Arrays.asList(10,20, 10,23,45,678,123,-10,11,10);
				System.out.println("list "+ints);//dups , ordered collection
				//add these elements to the TreeSet n display the same.
				//TreeSet(Collection<? extends E> collection)
				TreeSet<Integer> intSet=new TreeSet<>(ints);
				System.out.println("TS contents "+intSet);//no dups, growable , sorted(asc)
				//arrange the ints in desc order using TreeSet , Comparator : ano inner class

	}

}
