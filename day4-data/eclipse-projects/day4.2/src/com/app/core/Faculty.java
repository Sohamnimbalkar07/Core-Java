package com.app.core;

public class Faculty extends Person {
	private int yrsOfExperience;
	private String sme;

	public Faculty(String fn, String ln, int yrs, String sme) {
		super(fn, ln);// explicitly invoking immediate super cls's MATCHING constructor
		System.out.println("in faculty constr");
		yrsOfExperience = yrs;
		this.sme = sme;
	}

	 //modifying the inherited method toString from Person
	public String toString() {
		return "Faculty " + super.toString() + " teaching for " + yrsOfExperience + " expert in " + sme;
	}

}
