package cmparators;

import java.util.Comparator;

import com.app.core.Customer;

public class CustomerDobNameComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		System.out.println("in compare");
		int retVal=o1.getDob().compareTo(o2.getDob());
		if(retVal == 0)//=> same DoB
			return o1.getName().compareTo(o2.getName());
		return retVal;
	}
	

}
