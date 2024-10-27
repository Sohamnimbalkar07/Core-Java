package com.payroll;

import com.contract.MyPrintable;

public class Employee  implements MyPrintable{
	
	private int empid;
	private String name;
	private String email;
	
	
	
	public Employee(int empid, String name, String email) {
		super();//
		this.empid = empid;
		this.name = name;
		this.email = email;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	@Override
	public boolean equals(Object obj) {

//one emp equal with another
		if(obj instanceof Employee)
		{
		Employee emp=(Employee)obj;//dwn Casting
		return (this.empid==emp.empid && this.email.equals(emp.email));
		}
		return false;
		
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", email=" + email + "]";
	}
	@Override
	public void print() {
		System.out.println("---Emp----");
	}
	
	
	

}
