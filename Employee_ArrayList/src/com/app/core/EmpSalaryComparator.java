package com.app.core;

import java.util.Comparator;

public class EmpSalaryComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2)
	{   System.out.println("in compare");
//		if(e1.getSalary() < e2.getSalary())
//			return -1;
//		if(e1.getSalary() == e2.getSalary())
//			return 0;
//		return 1;
	
	return ((Double)e1.getSalary()).compareTo(e2.getSalary());
	}
}
