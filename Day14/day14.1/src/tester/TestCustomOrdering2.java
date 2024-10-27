package tester;

import static utils.CollectionUtils.populateList;

import java.util.ArrayList;
import java.util.Collections;

import com.app.core.Customer;
import java.util.*;

import cmparators.CustomerDobNameComparator;

public class TestCustomOrdering2 {

	public static void main(String[] args) {
		try {
			// get list of populated customers from utils
			ArrayList<Customer> customers = populateList();
			System.out.println("Original list");
			for (Customer c : customers)
				System.out.println(c);
			// custom ordering
			//new Comparator<Customer>() : instance of the ano inner class which imple Comparator
			Collections.sort(customers, new Comparator<Customer>() {
				@Override
				public int compare(Customer o1, Customer o2) {
					System.out.println("in ano inner's compare");
					int retVal = o1.getDob().compareTo(o2.getDob());
					if (retVal == 0)// => same DoB
						return o1.getName().compareTo(o2.getName());
					return retVal;
				}
			});
			System.out.println("Sorted  list of customers as per Dob n name ");
			for (Customer c : customers)
				System.out.println(c);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
