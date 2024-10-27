package tester;
import static utils.CollectionUtils.populateMap;

import java.util.HashMap;

import com.app.banking.BankAccount;
import static java.util.Map.Entry;

public class TestCollectionView {

	public static void main(String[] args) {
		// get populated sample map
		HashMap<Integer, BankAccount> map = populateMap();
		//extract n display only keys : keySet
		System.out.println("Keys : ");
		for(int i : map.keySet()) //auto un boxing : by javac
			System.out.print(i+" ");
		System.out.println();			
		//extract n display only values
		System.out.println("Values : ");
		for(BankAccount a : map.values())
			System.out.println(a);
		System.out.println("Entries : ");
		//extract display both : k n v : in a single iteration : entrySet : Set<Map.Entry<K,V>>
		for(Entry<Integer, BankAccount> e : map.entrySet())
			System.out.println(e.getKey()+":"+e.getValue());
		
		

	}

}
