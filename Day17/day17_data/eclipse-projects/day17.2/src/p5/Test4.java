package p5;

import static utils.CollectionUtils.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.app.banking.BankAccount;

public class Test4 {

	public static void main(String[] args) {
		//get list of accts from the utils
		ArrayList<BankAccount> acctList = populateList(populateMap());
		// sort the list of bank accounts , as per account balance : using custom ordering : Comparator based
//		Collections.sort(acctList, new Comparator<BankAccount>() {
//
//			@Override
//			public int compare(BankAccount o1, BankAccount o2) {
//				// TODO Auto-generated method stub
//				return ((Double)o1.getBalance()).compareTo(o2.getBalance());
//			}
//			
//		});
		Collections.sort(acctList,(o1,o2) -> ((Double)o1.getBalance()).compareTo(o2.getBalance()));
		System.out.println("Sorted accts as per balance ");
		acctList.forEach(a -> System.out.println(a));

	}

}
