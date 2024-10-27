package com.app.core;

public class Person {
	private String firstName, lastName;

	public Person(String firstName, String lastName) {
		//super(); javac implicitly add super()
		System.out.println("in person's ctor");
		
		this.firstName = firstName;
		this.lastName = lastName;
	}
//	public Person() {
//		
//	}
	//Can Person class modify(override) , inherited form of  toString method ? YES
	@Override
	public String toString()
	{
		return firstName+" "+lastName;
	}
//	//add a getter for firstName of the person
//	public String getFirstName()
//	{
//		return this.firstName;
//	}
	public String getFirstName() {
		return firstName;
	}


	
	
}
