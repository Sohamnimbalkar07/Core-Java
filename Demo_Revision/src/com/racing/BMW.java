package com.racing;

public class BMW extends Car {

	 boolean airBag;
	
	public BMW(int modelno,String name,String color,boolean airBag) {
		super(modelno,name,color);
		this.airBag=airBag;
	}
	
	public void abs()
	{
	System.out.println("BMW ABS and AirBags");	
		
	}
	
	public void speed()//BMW is hiding/overiding speed of Car class
	{
		System.out.println("---BMW speed 280km/hr---");
	}
	public BMW getCarDetails()
	{
		return this;
	}
}












