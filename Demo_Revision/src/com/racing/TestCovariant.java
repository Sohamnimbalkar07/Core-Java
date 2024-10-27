package com.racing;

public class TestCovariant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car c=new Car(101, "Car", "Red");
		
	Car obj=c.getCarDetails();
		
	obj.display();
	
	Nano n=new Nano(202, "Nano", "Black");
	Car nObj= n.getCarDetails();
	
	
	BMW b=new BMW(909, "BMW", "Red", true);
	
   BMW bObj=     b.getCarDetails();

	//will i get airBags Details using bObj
	
	Ferrari f= new Ferrari(900, "Ferrari", "Red", 90);
	 
	
	
	
	
	
	
	
	}

}
