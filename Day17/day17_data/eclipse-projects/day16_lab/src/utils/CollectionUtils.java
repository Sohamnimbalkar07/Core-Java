package utils;

import java.util.HashMap;

import com.app.cms.Customer;

import custom_exceptions.CustomerHandlingException;

public class CollectionUtils {
//add static method for customer validation(login)
	public static Customer authenticateCustomer(String email, String pwd, HashMap<String, Customer> map)
			throws CustomerHandlingException {
		// email validation , email : PK , get
		Customer cust = map.get(email);
		if (cust == null)
			throw new CustomerHandlingException("Invalid Login : invalid email!!!!");
		//=> email is valid , chk password
		if(!cust.getPassword().equals(pwd))
			throw new CustomerHandlingException("Invalid Login : invalid password!!!!");
		return cust;
	}
}
