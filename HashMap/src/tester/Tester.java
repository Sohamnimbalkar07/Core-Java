package tester;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.ArrayList;
import com.app.core.BankAccount;
import static utils.CollectionUtils.populateMap;
import java.util.Scanner;
;public class Tester 
{

public static void main(String[] args) 
{
		
HashMap<Integer,BankAccount> acctMap = populateMap();
Scanner sc = new Scanner(System.in);
boolean exit = false;
int count = 0;
int choice;
while(!exit)
{
	System.out.println(
			"Options 1. create account 2. Display All account details 3.get specifird account details 4. transfer account "
					+ "5. delete account 6.display specific account type 7. sort account as per account No. 8. Sort account as balance");
	
	System.out.println("Enter Choice");
	choice = sc.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("enter account number,customer name, account type,balance");
		int accountNo = sc.nextInt();
		if(acctMap.containsKey(accountNo))
		{
			System.out.println("account no already present");
		}
		acctMap.put(accountNo, new BankAccount(accountNo, sc.next(),sc.next(),sc.nextInt()));
		break;
	
	case 2:
		for(BankAccount acc : acctMap.values())
		{
			System.out.println(acc);
		}
		break;
		
	case 3:
		System.out.println("enter a account number");
		BankAccount a = acctMap.get(sc.nextInt());
		System.out.println(a);
		break;
		
	case 4:
		System.out.println("enter source account no and destination account no and amount");
		
		int src = sc.nextInt();
		int dest  = sc.nextInt();
		int amount = sc.nextInt();
		BankAccount scr = acctMap.get(src);
		BankAccount dect = acctMap.get(dest);
		scr.transferFunds(dect,amount);
		break;
	case 5:
		System.out.println("enter a account number");
		acctMap.remove(sc.nextInt());
		break;
	case 6:
		System.out.println("enter a account Type");
		String type = sc.next();
		for(BankAccount a1 : acctMap.values())
		{
		    	if(a1.getAccountType().equals(type))
		    	{
		    		System.out.println(a1.getCustomerName());
		    	}
		}
		break;
		
	case 7:
		TreeMap<Integer,BankAccount> sortedMap = new TreeMap<>(acctMap);
		
		for(BankAccount a2 : sortedMap.values())
		{   System.out.println("in case 7 for loop");
			System.out.println(a2);
		}
        break;
		
	case 8:
		
		Collection<BankAccount> accountCollection = acctMap.values();
		ArrayList<BankAccount> list = new ArrayList<>(accountCollection);
		Collections.sort(list, new Comparator<BankAccount>() {
			@Override
			public int compare(BankAccount a1, BankAccount a2)
			{    
				return ((Integer)a1.getBalance()).compareTo(a2.getBalance());
				
			}
		});
		
		for(BankAccount a1 : list)
		{   
			System.out.println(a1);
		}
		break;
	}
}
}



}
