package com.app.vehicles;

//state(data members)  : registrationNo : int , color : String , price : double
public class Vehicle {
	private int regNo;
	private String color;
	private double price;

	public Vehicle(int regNo, String color, double price) {
		this.regNo = regNo;
		this.color = color;
		this.price = price;
	}

	// override toString to replace hashCode version by actual state details
	@Override
	public String toString() {
		return "Vehicle [regNo=" + regNo + ", color=" + color + ", price=" + price + "]";
	}

	// override equals to replace ref equality by contents equality (Unique ID)
	//@Override
//	public boolean equals(Object o) {
//		System.out.println("in vehicle's equals");
//		if (o instanceof Vehicle)
//			return this.regNo == ((Vehicle) o).regNo;
//		return false;
public boolean equals(Vehicle o) {
	return regNo==o.regNo;
	}

}
