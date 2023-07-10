package com.app.core;

public class Faculty extends Person {
	
	private int yrsOfExperience;
	private String sme;
	public Faculty(String first,String last,int yrsOfExperience, String sme) {
		super(first,last);
		this.yrsOfExperience = yrsOfExperience;
		this.sme = sme;
	}
	@Override
	public String toString() {
		return super.toString() +"Faculty [yrsOfExperience=" + yrsOfExperience + ", sme=" + sme + "]";
	}
	
	public void teach()
	{
		System.out.println(getFirstName()+" expert in "+sme);
	}

	
}
