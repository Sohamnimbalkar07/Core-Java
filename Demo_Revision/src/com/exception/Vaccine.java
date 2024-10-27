package com.exception;

public class Vaccine {

	
	private int adharNO;
	private String name;
	private int age;
	
	
	
	public Vaccine(int adharNO, String name, int age) {
		super();
		this.adharNO = adharNO;
		this.name = name;
		this.age = age;
	}



	public void validateAge() throws VaccineException
	{
		if(age<18)
		{
			System.out.println("---invalid age----");
			throw new VaccineException("Invalid Age:No vaccine");
		}else
		{
			System.out.println("Book vaccination");
			
		}
	}
	
	
}
