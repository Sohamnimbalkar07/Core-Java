package com.racing;

public class TestRacing {
public static void startRace(Car obj)
{
	System.out.println(obj.getClass());
	obj.speed();// overriden method
	if(obj instanceof Nano)
	{
	((Nano)obj).nanoFeatures();	
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Car c=new Car(101, "BasicCar", "Black");
//		c.speed();
//		c.display();
		Nano n=new Nano(202,"Nano","White");
		n.speed();//nano class
		n.display();//car class
		n.nanoFeatures();//nano
		startRace(n);//Car obj=nano;//upcasting
		
		BMW b=new BMW(909, "BMW", "Black", true);
		b.speed();//car
		b.display();
		b.abs();//BMW
		
		
		Ferrari f=new Ferrari(707, "Ferrari", "Red", 90);
		f.speed();
		f.display();
		f.nosSupport();
		
		
		

	}

}
