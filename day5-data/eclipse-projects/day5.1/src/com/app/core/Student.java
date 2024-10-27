package com.app.core;

public class Student extends Person {
	private int gradYear;
	private String course;
	private double fees;
	private int marks;

	// add a parameterized constr to init complete state of a Student
	public Student(String firstName, String lastName, int gradYear, String course, double fees, int marks) {
		super(firstName, lastName);// explicitly invoking immediate super cls's MATCHING constructor
		System.out.println("in student ctor");
		this.gradYear = gradYear;
		this.course = course;
		this.fees = fees;
		this.marks = marks;

	}

	// modifying the inherited method toString : overriding form of the method
	@Override
	public String toString() {
		return "Student " + super.toString() + " graduated in" + gradYear + " course : " + course + " fees " + fees
				+ " marks " + marks;
	}
	//add new behaviour : study
	public void study()
	{
		//display student's first name studying in course name
		System.out.println(super.getFirstName()+" studying in Course "+course);
	}

}
