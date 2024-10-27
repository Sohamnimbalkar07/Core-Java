package com.exception;

import java.util.Scanner;

public class TEstVaccine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try
		{
		
			Scanner sc=new Scanner(System.in);
			int age=sc.nextInt();
		Vaccine candicate1=new Vaccine(101,"abc",age);
		
		System.out.println("---accept details---");
		candicate1.validateAge();
		System.out.println("---book vaccination slot---");
		}
		catch(VaccineException e)
		{
			System.err.println(e);
			e.printStackTrace();
		}
		
	}
	}


