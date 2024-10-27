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
	//add overloaded constr to init unique id fields.
	public Student(int rolNo, String subject) {
		super();
		this.rolNo = rolNo;
		this.subject = subject;
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

	public int getRolNo() {
		return rolNo;
	}

	public void setRolNo(int rolNo) {
		this.rolNo = rolNo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
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

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
	
	

}
