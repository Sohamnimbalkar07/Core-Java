package com.racing;

import com.contract.MyPrintable;

public class Ferrari extends Car implements MyPrintable {

	public Ferrari(int modelno, String name, String color,int nos) {
		super(modelno, name, color);
		this.nos=nos;
	}

	 int nos;
	
	public void nosSupport()
	{
		System.out.println("Ferrari NOS feature to get best speed");
	}
	
	@Override
	public void speed()//Ferrari is hiding/overiding speed of Car class
	{
		System.out.println("---Ferrari speed 380km/hr---");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
	System.out.println("---ferrari---");	
	}
	
	
}
