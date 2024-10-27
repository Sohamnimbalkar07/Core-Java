package com.racing;

public class Nano  extends Car{

	public Nano(int modelno, String name, String color) {
		super(modelno, name, color);//car pConstr invoked
		
	}

	public void nanoFeatures()
	{
		System.out.println("---Nano features----");
	}
	
	public void speed()//Nano is hiding/overiding speed of Car class
	{
		System.out.println("---nano speed 80km/hr---");
	}
	
}
