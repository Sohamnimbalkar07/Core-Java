package com.contract;

import com.payroll.Employee;
import com.racing.Ferrari;


public class TestInterface {
public static void showPrint(MyPrintable mp)
{
	mp.print();
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee emp=new Employee(1, "a", "a@gmail");
		emp.print();
		
		
		Ferrari f=new Ferrari(1, "aa", "red", 90);
		f.print();
		
		MyPrintable mp ;
		mp=new Employee(90, "aa", "aa");
		mp.print();
		
		showPrint(f);
		showPrint(emp);
		
	}

}
