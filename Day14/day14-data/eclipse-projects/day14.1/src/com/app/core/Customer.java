package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer implements Comparable<Customer>{
	private String name;
	private String email;
	private String password;
	private Date dob;
	private double regAmount;
	public static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("dd-MM-yyyy");
	}
	
	public Customer(String name, String email, String password, Date dob, double regAmount) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.regAmount = regAmount;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", password=" + password + ", dob=" + sdf.format(dob)
				+ ", regAmount=" + regAmount + "]";
	}
	@Override
	public int compareTo(Customer o) {
		System.out.println("in compareTo");
		return this.email.compareTo(o.email);
	//	return o.email.compareTo(this.email);
	}
	//getter for dob
	public Date getDob()
	{
		return this.dob;
	}
	public String getName() {
		return name;
	}
	public double getRegAmount() {
		return regAmount;
	}
	
	
	

}
