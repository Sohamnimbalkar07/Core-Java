package tester;

import static utils.CollectionUtils.populateList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.app.core.Customer;

public class TestCustomOrdering3 {

	public static void main(String[] args) {
		try {
			// get populated list of customers
			ArrayList<Customer> list = populateList();
			System.out.println("Original list");
			for (Customer c : list)
				System.out.println(c);
			// custom ordering using ano inner class
			Collections.sort(list, new Comparator<Customer>() {

				@Override
				public int compare(Customer o1, Customer o2) {
					System.out.println("ano inner class : compare : reg amt");
//					if (o1.getRegAmount() < o2.getRegAmount())
//						return -1;
//					if (o1.getRegAmount() == o2.getRegAmount())
//						return 0;
//					return 1;
					return ((Double)o1.getRegAmount()).compareTo(o2.getRegAmount());
					
				}

			});
			System.out.println("List of custs sorted as per reg amount");
			for (Customer c : list)
				System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
