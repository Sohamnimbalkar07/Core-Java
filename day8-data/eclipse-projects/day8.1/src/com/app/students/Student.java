package com.app.students;



//Student's attributes - rollNo (int) , subject (String), firstName , lastName , gpa(grade point average)
public class Student {

	private int rolNo;
	private String subject;
	private String firstName;
	private String lastName;
	private double gpa;
	public Student(int rolNo, String subject, String firstName, String lastName, double gpa) {
		super();
		this.rolNo = rolNo;
		this.subject = subject;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student [rolNo=" + rolNo + ", subject=" + subject + ", firstName=" + firstName + ", lastName="
				+ lastName + ", gpa=" + gpa + "]";
	}
	//replace ref equality by content(rollNo n subject) equality
	@Override
	public boolean equals(Object o)
	{
		System.out.println("in student equals");
		if(o instanceof Student)
		{
			Student s=(Student)o;
			return this.rolNo==s.rolNo && this.subject.equals(s.subject);
		}
		return false;
		
		
	}
	
	
	

}
