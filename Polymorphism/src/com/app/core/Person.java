package com.app.core;

public class Person {

	private String firstName;
	private String lastName;
	
	public Person()
	{
		
	}
	
	public Person(String first,String last)
	{
		firstName = first;
		lastName = last;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
