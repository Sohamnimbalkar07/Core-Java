package tester;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import com.app.cms.Customer;
import com.app.cms.CustomerPlan;

import custom_exceptions.CustomerHandlingException;
import static utils.CollectionUtils.authenticateCustomer;

public class CustomerManagementSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// empty map to store customer details
			HashMap<String, Customer> customerMap = new HashMap<>();// size=0, capa=16, L.F=0.75
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"Options 1. Register Customer 2. Display registered customer details 3.Customer Login 100.Exit");
				System.out.println("Choose an option");
				try {
					switch (sc.nextInt()) {
					case 1: // user reg
						System.out.println("Enter customer email");
						String email = sc.next();
						if (customerMap.containsKey(email))
							throw new CustomerHandlingException("Dup Email ID , Please Choose a new one!!!!");
						// => new email
						System.out.println("Enter  name,  password,  plan,  dob(yr-mon-day),  regAmount");
						customerMap.put(email,
								new Customer(sc.next(), email, sc.next(), CustomerPlan.valueOf(sc.next().toUpperCase()),
										LocalDate.parse(sc.next()), sc.nextDouble()));
						System.out.println("Customer reg successful!");

						break;
					case 2:
						System.out.println("All customer details ");
						for(Customer c : customerMap.values())
							System.out.println(c);
						
						break;
					case 3 : //login
						System.out.println("Enter customer email n password for login");
						Customer c=authenticateCustomer(sc.next(),sc.next(),customerMap);
						System.out.println("Login Successful , Your details : "+c);
						break;

					case 100:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				sc.nextLine();

			}
		}

	}

}
