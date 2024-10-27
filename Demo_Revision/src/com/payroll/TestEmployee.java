package com.payroll;

public class TestEmployee {
public static void main(String[] args) {
	
	
	Employee emp1=new Employee(101,"vaishali", "vaishali@gmail.com");
	
	System.out.println(emp1);
	
	Employee emp2=new Employee(202, "Sonali", "Soali@gmail");
	System.out.println(emp2);
	
	Employee emp3=new Employee(202, "Sonali", "Soali@gmail");
	
	System.out.println(emp1.hashCode() +"   "+emp2.hashCode());
	//parent obj=child class
	
	
	
	if(emp2.equals(emp3))//Upcasting Object obj=new Employee()
	{
		System.out.println("Same");
	}
	else
	{
		System.out.println("not same");
	}
}
}
