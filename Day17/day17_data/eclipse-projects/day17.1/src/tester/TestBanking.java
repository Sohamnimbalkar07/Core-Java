package tester;

import static utils.CollectionUtils.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

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
				System.out.println("Options 1. Create A/c 2. Display all accts 3. A/c summary 4. Transfer Funds "
						+ "5. Close A/C 6. Display accts by type 7. Display accts by balance 8. Remove loan accts"
						+ "9 Print a/cs sorted as per asc acct nos  10 Print a/cs sorted as per desc  acct nos 100 Exit");
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
					case 4: // funds transfer
						System.out.println("Enter src a/c no , dest a/c no , transfer amount");
						BankAccount src = findByAcctNo(sc.nextInt(), accts);
						// => src a/c exists
						BankAccount dest = findByAcctNo(sc.nextInt(), accts);
						// => dest a/c exists
						// proceed to transfer
						src.transferFunds(dest, sc.nextDouble());
						// => transfer success
						System.out.println("Funds transfer successful");
						break;
					case 5: // close a/c
						System.out.println("Enter a/c no");
						BankAccount a = accts.remove(sc.nextInt());
						if (a == null)
							throw new AccountHandlingException("A/C Closing Failed : invalid a/c no");
						System.out.println("Closed a/c " + a);
						break;
					case 6: // Display all account details of specific account type
						// searching criteria is value based , so had to convert map --> collection
						// view.
						System.out.println("Enter a/c type");
						AcType acctType = AcType.valueOf(sc.next().toUpperCase());
						System.out.println("Account details for A/C type " + acctType);
						for (BankAccount a1 : accts.values())
							if (a1.getType() == acctType)
								System.out.println(a1);
						break;
					case 7:// Search A/cs by balance > specific balance , display their details.
						System.out.println("Enter balance ");
						double bal = sc.nextDouble();
						// searching criteria is value based(balance) , so have to convert map -->
						// collection view.
						for (BankAccount a1 : accts.values())
							if (a1.getBalance() > bal)
								System.out.println(a1);
						break;
					case 8: // Remove all loan accounts.
						Collection<BankAccount> acctCollection = accts.values();
//						for(BankAccount a1 : acctCollection)
//							if(a1.getType() == AcType.LOAN)
//								acctCollection.remove(a1);	
						// attach explicit iterator
						Iterator<BankAccount> itr = acctCollection.iterator();
						while (itr.hasNext()) {
							if (itr.next().getType() == AcType.LOAN)
								itr.remove();
						}
						break;
					case 9: // Print a/cs sorted as per asc acct nos
						// since sorting criteria is key based(acct no) : can be done using TreeMap
//						//Ctor : TreeMap(Map<? extends K,? extends V> map)
						TreeMap<Integer, BankAccount> sortedAccts = new TreeMap<>(accts);
						// JVM invokes for sorting : Integer's compareTo
//						TreeMap<Integer, BankAccount> sortedAccts=new TreeMap<>();
//						//to populate the TreeMap from HM : putAll
//						sortedAccts.putAll(accts);
						System.out.println("Sorted accts as per asc acct no");
						for (BankAccount a1 : sortedAccts.values())
							System.out.println(a1);
						break;
					case 10: // Print a/cs sorted as per desc acct nos 
						//key based sorting BUT custom ordering
						//TreeMap(Comparator<? super K> comp)
						//new Comparator<Integer>() => instance of the class(ano inner) that imple Comparator
						TreeMap<Integer, BankAccount> sortedAccts2=new TreeMap<>(new Comparator<Integer>() {

							@Override
							public int compare(Integer o1, Integer o2) {
								System.out.println("in compare : desc acct no");
								return o2.compareTo(o1);
							}
						
						});
						System.out.println(sortedAccts2);//{}
						sortedAccts2.putAll(accts);//copies all entries from HM --> TM : JVM invokes ano inner cls's compare
						System.out.println("Sorted accts as per desc  acct no");
						for (BankAccount a1 : sortedAccts2.values())
							System.out.println(a1);
						
						break;
					case 11 : //Sort account details as per acct creation date
						//sorting criteria : creationDate : value based criteria => MUST convert it in collection view
						Collection<BankAccount> coll=accts.values();
						//coll : sorted or not sorted ? un sorted
						//coll --> ArrayList --Collections.sort(list,comp)
						ArrayList<BankAccount> list=new ArrayList<>(coll);
						//AL : sorted or un sorted : un sorted
						//Collections.sort(List<T> list,Comparator comp)
						Collections.sort(list, new Comparator<BankAccount>() {

							@Override
							public int compare(BankAccount o1, BankAccount o2) {
								// date based sorting
								return o1.getCreationDate().compareTo(o2.getCreationDate());
							}							
						});
						System.out.println("Accts as per creation date ");
						for(BankAccount a1 : list)
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
