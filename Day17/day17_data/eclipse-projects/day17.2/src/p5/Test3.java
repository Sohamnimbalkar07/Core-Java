package p5;
import static utils.CollectionUtils.populateMap;

import java.util.HashMap;

import com.app.banking.BankAccount;

public class Test3 {

	public static void main(String[] args) {
		// get populated map of accts from utils
		HashMap<Integer, BankAccount> map = populateMap();
		//display all entries (key n value pair) from the map : using higher order func : forEach
		System.out.println("Map entries : ");
		map.forEach((k,v) -> System.out.println(k +":"+v));

	}

}
