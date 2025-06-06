package com.app.core;
//emp id, first name , last name , email ,dept , join date , salary

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private int empId;
	private String firstName;
	private String lastName;
	private String email;
	private String deptId;
	private Date joinDate;
	private double salary;
	//add SDF for parsing(string--->Date) n format(Date--> String)
	public static SimpleDateFormat sdf;
	//static init : for initing sdf : day/mon/yr --pattern
	static {
		sdf=new SimpleDateFormat("dd/MM/yyyy");
	}
	

	public Employee(int empId, String firstName, String lastName, String email, String deptId, Date joinDate,
			double salary) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.deptId = deptId;
		this.joinDate = joinDate;
		this.salary = salary;
	}
	//override toString 

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", deptId=" + deptId + ", joinDate=" +sdf.format(joinDate) + ", salary=" + salary + "]";
	}
	//override equals for replacing ref equality by contents equality(PK : unique ID --emp id)
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in emp equals");
		if(o instanceof Employee)
			return this.empId ==((Employee)o).empId;
		return false;
	}
	

}
