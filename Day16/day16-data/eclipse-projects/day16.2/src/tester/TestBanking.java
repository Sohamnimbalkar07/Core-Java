package tester;

import static utils.CollectionUtils.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import com.app.banking.AcType;
import com.app.banking.BankAccount;

import custom_exceptions.AccountHandlingException;
import custom_exceptions.DupAccountException;
import static utils.BankValidationRules.validateBalance;
import static java.time.LocalDate.parse;

public class TestBanking {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// invoke populate map
			HashMap<Integer, BankAccount> accts = populateMap();
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"Options 1. Create A/c 2. Display all accts 3. A/c summary 4. Transfer Funds "
						+ "5. Close A/C 6. Display accts by type 100 Exit");
				System.out.println("Enter your option");
				try {
					switch (sc.nextInt()) {
					case 1: // Create A/c
						System.out.println("Enter a/c no");
						int acctNo = sc.nextInt();
						if (accts.containsKey(acctNo)) // int ---> auto boxing --> Integer --> Object
							// => dup a/c no
							throw new DupAccountException("A/c NO already exists!!!!!");
						// => new a/c no
						System.out.println("Enter a/c  type,  balance,  creationDate(yr-mon-day),  customerName");
						accts.put(acctNo, new BankAccount(acctNo, AcType.valueOf(sc.next().toUpperCase()),
								validateBalance(sc.nextDouble()), parse(sc.next()), sc.next()));
						System.out.println("A/c created ...");
						break;
					case 2:
						System.out.println("All a/c details");
						for (BankAccount a : accts.values())
							System.out.println(a);
						break;
					case 3:
						System.out.println("Enter A/C no ");
						System.out.println("Bank A/C summary " + findByAcctNo(sc.nextInt(), accts));
						break;
					case 4: //funds transfer
						System.out.println("Enter src a/c no , dest a/c no , transfer amount");
						BankAccount src = findByAcctNo(sc.nextInt(), accts);
						//=> src a/c exists
						BankAccount dest= findByAcctNo(sc.nextInt(), accts);
						// => dest a/c exists
						//proceed to transfer
						src.transferFunds(dest, sc.nextDouble());
						//=> transfer success
						System.out.println("Funds transfer successful");
						break;
					case 5 : //close a/c
						System.out.println("Enter a/c no");
						BankAccount a = accts.remove(sc.nextInt());
						if(a == null)
							throw new AccountHandlingException("A/C Closing Failed : invalid a/c no");
						System.out.println("Closed a/c "+a);						
						break;
					case 6: //Display all account details of specific account type
						//searching criteria is value based , so had to convert map --> collection view.
						System.out.println("Enter a/c type");
						AcType acctType=AcType.valueOf(sc.next().toUpperCase());
						System.out.println("Account details for A/C type "+acctType);
						for(BankAccount a1 : accts.values())
							if(a1.getType() == acctType)
								System.out.println(a1);									
						break;

					case 100:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				// read off pending i/ps from scanner
				sc.nextLine();
			}
		}

	}

}
