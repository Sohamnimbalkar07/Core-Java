package utils;
import java.util.Collections;
import com.app.core.BankAccount;
import java.util.HashMap;

public class CollectionUtils {

	public static HashMap<Integer,BankAccount> populateMap(){
		
		HashMap<Integer,BankAccount> accts = new HashMap<>();
		accts.put(103, new BankAccount(103,"soham","Saving",90000));
		accts.put(104, new BankAccount(104,"Gaurav","Current",70000));
		accts.put(101, new BankAccount(101,"Siddhart","Saving",60000));
		accts.put(102, new BankAccount(102,"Abhishek","Current",20000));
		accts.put(105, new BankAccount(105,"Mayur","Saving",50000));
		
		return accts;
	}
	
}
