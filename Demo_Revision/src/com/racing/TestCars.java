package com.racing;

import java.util.Scanner;

public class TestCars {

	public static void main(String[] args) {

		// nano bmw ferrari .. ... ... ... ... ..
		Scanner sc = new Scanner(System.in);
		Car[] myCars = new Car[4];
int index=0;
boolean flag=true;
while(flag==true)
{
		System.out.println("1:Nano 2:BMW   3:Ferrari 4:Display");
		System.out.println("Enter Choice");
		int ch = sc.nextInt();

		switch (ch) {
		case 1: System.out.println("ModelNo  Name   Color"); 
			 Nano n=new Nano(sc.nextInt(), sc.next(), sc.next());
			 myCars[index]=n;
			 index++;
			break;
		case 2:
			 System.out.println("ModelNo  Name   Color AirBags"); 
			 BMW b=new BMW(sc.nextInt(), sc.next(), sc.next(),sc.nextBoolean());
			 myCars[index]=b;
			 index++;
			break;
		case 3:
			if(index<myCars.length)
			{
			System.out.println("ModelNo  Name   Color NOS"); 
			 
			 myCars[index]=new Ferrari(sc.nextInt(), sc.next(), sc.next(),sc.nextInt());;
			 index++;
			}
			else
			{
				System.out.println("full");
			}
			break;
		case 4:
			//base class can hold ref of derived class
			for(Car c:myCars)
			{
				if(c!=null)
				{ 
					System.out.println(c.getClass());
					c.speed();//car speed at compile 
				//chk the type at the time of execution RTTI
				if(c instanceof Ferrari)
					((Ferrari)c).nosSupport();//downcast
				
				else if(c instanceof BMW)
					((BMW)c).abs();
				else if(c instanceof Nano)
					((Nano)c).nanoFeatures();
				}
				
			}
			break;
			
		default:flag=false;
			break;
		}
}

	}

}
