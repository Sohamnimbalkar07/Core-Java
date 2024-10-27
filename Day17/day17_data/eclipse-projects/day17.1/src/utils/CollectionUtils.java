package utils;

import java.time.LocalDate;
import java.util.HashMap;

import com.app.banking.AcType;
import com.app.banking.BankAccount;

import custom_exceptions.AccountHandlingException;

import static com.app.banking.AcType.*;
import static java.time.LocalDate.parse;

public class CollectionUtils {
	// add a static method to return populated map of bank a/cs
	public static HashMap<Integer, BankAccount> populateMap() {
		// create empty map
		HashMap<Integer, BankAccount> map = new HashMap<>();
		// int acctNo, AcType type, double balance, LocalDate creationDate, String
		// customerName
		System.out
				.println("added : put " + map.put(10, new BankAccount(10, LOAN, 5000, parse("2010-04-23"), "Reema")));
		System.out.println(
				"added : put " + map.put(101, new BankAccount(101, CURRENT, 3500, parse("2011-06-21"), "Sameer")));

		System.out.println("added : put " + map.put(76, new BankAccount(76, LOAN, 150000, parse("2009-04-01"), "Mohan")));

		System.out
				.println("added : put " + map.put(56, new BankAccount(56, SAVING, 7800, parse("2020-04-07"), "Meera")));

		System.out
				.println("added : put " + map.put(10, new BankAccount(10, SAVING, 9500, parse("2015-11-23"), "Riya")));

		System.out.println(map);// {4 entries}
		return map;

	}
	//add a static method to return a/c details or throw exc
	public static BankAccount findByAcctNo(int accNo,HashMap<Integer, BankAccount> map) throws AccountHandlingException
	{
		BankAccount a=map.get(accNo);
		if(a == null)
			throw new AccountHandlingException("Invalid A/C No!!!!!!!!!!!");
		return a;
	}

}
