package com.app.core;
//rollNo(string: unique ID),name,dob(Date),subject(enum),gpa(double)

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	private String rollNo;
	private String name;
	private Date dob;
	private Subject subject;
	private double gpa;
	public static SimpleDateFormat sdf;

	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public Student(String rollNo, String name, Date dob, Subject subject, double gpa) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dob = dob;
		this.subject = subject;
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", dob=" + sdf.format(dob) + ", subject=" + subject
				+ ", gpa=" + gpa + "]";
	}

	public String getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

	public Subject getSubject() {
		return subject;
	}

	public double getGpa() {
		return gpa;
	}

}
