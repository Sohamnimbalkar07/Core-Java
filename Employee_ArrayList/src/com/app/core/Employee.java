package com.app.core;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String firstName;
	private String lastName;
	private String email;
	private String department;
	private double salary;
	
	public Employee(int empId, String firstName, String lastName, String email, String Department, double salary) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.department = Department;
		this.salary = salary;
	}
	public Employee()
	{
		
	}
	
	
	
	public boolean equals(Object o)
	{
	System.out.println("in emp equals");
	if(o instanceof Employee)
	{
		return this.empId == ((Employee)o).empId;
	}
		return false;
	}
	
	

	public Employee(int empId) {
	super();
	this.empId = empId;
      }

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", Department=" + department + ", salary=" + salary + "]";
	}
	
	@Override
	public int compareTo(Employee anotherEmp)
	{
		System.out.println("in compare to");
		if(this.empId<anotherEmp.getEmpId())
			return -1;
		if(this.empId == anotherEmp.getEmpId())
			return 0;
		return 1;
	}
	
}
