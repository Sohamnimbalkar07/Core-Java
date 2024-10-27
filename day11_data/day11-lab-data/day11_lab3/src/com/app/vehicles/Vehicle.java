package com.app.vehicles;

import java.text.SimpleDateFormat;
import java.util.Date;

//state(data members)  : registrationNo : int , color : String , price : double
public class Vehicle {
	private int regNo;
	private String color;
	private double price;
	// Vehicle HAS-A Category
	private Category category;
	// Vehicle HAS-A manufacture date
	private Date manufactureDate;
	// Vehicle HAS-A DeliveryAddress //UDT : user defined type : class -- inner
	// class(to ensure composition)
	private DeliveryAddress address;
	//add SDF for parsing(string---> date) n formatting(date -->string)
	public static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("yyyy-MM-dd");
	}
	

//add a constr to init complete state of the vehicle produced.
	public Vehicle(int regNo, String color, double price, Category category, Date manufactureDate) {
		super();
		this.regNo = regNo;
		this.color = color;
		this.price = price;
		this.category = category;
		this.manufactureDate = manufactureDate;
	}

	// add overloaded constr to init unique id fields.
	public Vehicle(int regNo) {
		this.regNo = regNo;
	}

	// override toString to replace hashCode version by actual state details
	@Override
	public String toString() {
		String message=address==null?"Delivery Address Not Set" :address.toString();
		return "Vehicle [regNo=" + regNo + ", color=" + color + ", price=" + price + ", category=" + category
				+ ", manufactureDate=" + sdf.format(manufactureDate) + ", address=" +message;
	}

	// override equals to replace ref equality by contents equality (Unique ID)
	@Override
	public boolean equals(Object o) {
		System.out.println("in vehicle's equals");
		if (o instanceof Vehicle)
			return this.regNo == ((Vehicle) o).regNo;
		return false;
//		return this.regNo==o.regNo;

	}

	//add a method to assign delivery address to the curnt vehicle

	// add non static nested class(=inner class)
	class DeliveryAddress {
		// city ,state,country , zipCode : string
		private String city, state, country, zipCode;
		// constr n toString

		public DeliveryAddress(String city, String state, String country, String zipCode) {
			super();
			this.city = city;
			this.state = state;
			this.country = country;
			this.zipCode = zipCode;
		}

		@Override
		public String toString() {
			return "DeliveryAddress [city=" + city + ", state=" + state + ", country=" + country + ", zipCode="
					+ zipCode + "]";
		}

	}

}// outer class over
