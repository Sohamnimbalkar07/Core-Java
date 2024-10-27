package com.racing;

public class Car {
 int modelno;
 String color;
 String name;

public Car(int modelno,String name,String color)
{
	this.modelno=modelno;
	this.name=name;
	this.color=color;
}
//overriding:same fun name with same signature and same return type
public void speed()
{
System.out.println("  car speed=50km/hr");	
}

public void display()
{
	System.out.println(modelno+"  "+name+"   "+color);
}

public Car getCarDetails()
{
	return this;
}




}
