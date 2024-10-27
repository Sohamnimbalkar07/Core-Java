package com.app.core;

public class Person {
	private String firstName, lastName;

	public Person(String firstName, String lastName) {
		System.out.println("in person's ctor");
		//super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
	//Can Person class modify(override) , inherited form of  toString method ? YES
	public String toString()
	{
		return firstName+" "+lastName;
	}
	
}
