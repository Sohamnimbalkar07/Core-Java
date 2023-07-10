package com.app.core;

public class Student extends Person {

	private int gradYear;
	private String course;
	private double fees;
	private int marks;
	
	public Student(String first,String last,int gradYear, String course, double fees, int marks) {
		super(first,last);
		this.gradYear = gradYear;
		this.course = course;
		this.fees = fees;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return super.toString() +"Student [gradYear=" + gradYear + ", course=" + course + ", fees=" + fees + ", marks=" + marks + "]";
	}
	
	public void study()
	{
		//display student's first name studying in course name
		System.out.println(super.getFirstName()+" studying in Course "+course);
	}
	
	
	
}
