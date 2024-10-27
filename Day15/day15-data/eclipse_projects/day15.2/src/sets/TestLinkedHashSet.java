package sets;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		// create fixed size list of ints : 10,20 10,23,45,678,123,-10,11
		List<Integer> ints=Arrays.asList(10,20, 10,23,45,678,123,-10,11,10);
		System.out.println("list "+ints);//dups , ordered collection
	//	ints.add(0,12345);//exc
		//populate LinkedHashSet from the same n display it's contents.
		//Ctor : LinkedHashSet(Collection<? extends E> coll)
		//Meaning : This ctor can create populated , growable LinkedHashSet <Integer> from ANY Collection(LIst/Set)
		//of the generic type : Integer or it's subtype
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>(ints);
		//observe n conclude
		System.out.println("LHS contents "+lhs);
		lhs.add(4567);
		System.out.println(lhs);

	}

}
