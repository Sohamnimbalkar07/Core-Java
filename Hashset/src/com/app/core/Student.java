package com.app.core;

public class Student {

	
	private int rollNo;
	private String name;
	private String address;
	public Student(int rollNo, String name, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in student equals");
		if(o instanceof Student)
		{
			return this.rollNo == ((Student)o).rollNo;
		}
		return false;
	}
	
	@Override
	public int hashCode()
	{   
		System.out.println("in student HashCode");
		return 100;
	}
}
