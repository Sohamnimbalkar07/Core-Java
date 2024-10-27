package utils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import com.app.core.Customer;
import static com.app.core.Customer.sdf;

public class CollectionUtils {
	//add a static method to return populated list of customers
	public static ArrayList<Customer> populateList() throws ParseException
	{
		//create empty list
		ArrayList<Customer> customers=new ArrayList<>();
		//String name, String email, String password, Date dob, double regAmount
		customers.add(new Customer("Rama", "rama@gmail.com","12345",sdf.parse("12-5-1993") ,500));
		customers.add(new Customer("Kiran", "kiran@gmail.com","72345",sdf.parse("1-5-1992") ,600));
		customers.add(new Customer("Amit", "amit@gmail.com","18345",sdf.parse("12-10-1992") ,550));
		customers.add(new Customer("Suraj", "suraj@gmail.com","82345",sdf.parse("1-5-1992") ,590));
		customers.add(new Customer("Rekha", "rekha@gmail.com","10345",sdf.parse("1-5-1992") ,790));
		return customers;
	}
	

}
