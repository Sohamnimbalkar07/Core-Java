package com.app.cms;

import java.time.LocalDate;
import java.time.Period;

//Customer : name,email(PK), password , plan (enum : SILVER,GOLD,DIAMOND,PLATINUM) , dob (LocalDate), reg amount (double)
public class Customer {
	private String name;
	private String email;
	private String password;
	private CustomerPlan plan;
	private LocalDate dob;
	private double regAmount;

	public Customer(String name, String email, String password, CustomerPlan plan, LocalDate dob, double regAmount) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.plan = plan;
		this.dob = dob;
		this.regAmount = regAmount;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", password=" + password + ", plan=" + plan + ", dob="
				+ dob + ", regAmount=" + regAmount + "]";
	}

	public String getPassword() {
		return password;
	}
	//add a public method to compute age of a customer
	public int getAge()
	{
		return Period.between(dob,LocalDate.now()).getYears();
	}
	

}
