package custom_ordering;

import java.util.Comparator;

import com.app.core.Employee;

public class EmployeeLastNameComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1,Employee e2)
	{
		System.out.println("in compare");
		//sorting criteria : lastName -- getLastName
		//simply call string's compareTo
		return e1.getLastName().compareTo(e2.getLastName());// < 0 or 0 or > 0
	}

}
