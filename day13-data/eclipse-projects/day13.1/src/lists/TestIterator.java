package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
		int[] data = { 12, 34, 45, 1, 345, 10, 20, 56 };
		// create empty AL n populate iot with array data
		ArrayList<Integer> list = new ArrayList<>();
		for (int i : data)// i=data[0] ,i=data[1] : no implicit conversion!!!!
			list.add(i);// int --->Integer(list.add(Integer.valueOf(i)) : auto boxing

		// for printing the list contents : can u attach for-each(implicit iterator) to
		// the list ? YES
		for (int i : list)// Integer ---> int(intValue) : auto un boxing
			System.out.println(i);
		// Can you attach an Iterator explicitly ? YES
		// HOW ?
		// attach iterator
		Iterator<Integer> itr = list.iterator();// position of this itr : before the 1st elem
		System.out.println("List elems via Iterator");
		while (itr.hasNext()) {
			System.out.println(itr.next());// rets next element n advances the iterator .
		}
		// System.out.println(itr.next());//NoSuchElementException
		// java.util.Collections ---helper class for searching / sorting/shuffling...on
		// collections
		// public static void sort(List<T> list)
		// Will you be able to sort the elements of
		// AL/LinkedList/Vector/HashSet/LinkedHashSet/TreeSet/HashMap/LinkedHashMap/TreeMap
		// ,using above method?
		//ANS : AL/LinkedList/Vector
		Collections.sort(list);
		System.out.println(list);
		
	}

}
