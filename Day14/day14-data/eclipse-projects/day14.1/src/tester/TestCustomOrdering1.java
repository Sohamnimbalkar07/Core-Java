package tester;

import static utils.CollectionUtils.populateList;

import java.util.ArrayList;
import java.util.Collections;

import com.app.core.Customer;

import cmparators.CustomerDobNameComparator;

public class TestCustomOrdering1 {

	public static void main(String[] args) {
		try {
			// get list of populated customers from utils
			ArrayList<Customer> customers = populateList();
			System.out.println("Original list");
			for(Customer c : customers)
				System.out.println(c);
			//custom ordering 
			Collections.sort(customers,new CustomerDobNameComparator());
			System.out.println("Sorted  list of customers as per Dob n name ");
			for(Customer c : customers)
				System.out.println(c);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
