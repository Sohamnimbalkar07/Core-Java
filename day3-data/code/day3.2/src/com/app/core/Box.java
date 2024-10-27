package com.app.core;

public class Box {
	// state of the Box : tight encapsulation
	private double width, depth, height;// instance variables
	// 1. parameterized constructor to init complete state of the Box

	public Box(double w, double d, double height) {
		width = w;
		depth = d;
		// this keyword is used to un hide instance var from local var
		this.height = height;
	}

//2. add overloaded constr to init state of the cube
	public Box(double side) {
		// width=depth=height=side;
		this(side, side, side);// constr chaining
	}

//3. create initialized box with all of the sides set to -1 : constr
	public Box() {
		// width=depth=height=-1;
		this(-1);// constr chaining eg : from tester : Box b1=new Box();
	}

//behaviour : methods
	// write a non static (instance method) to return Box details in String form
	// (dimensions of Box)
	public String getBoxDimensions() {
		return "Box Dims " + width + " " + depth + " " + height;
	}

//write a non static method To return computed volume of the box.
	public double getBoxVolume() {
		return this.width * this.depth * this.height;
	}

//Add a method to Box class to compare equality of 2 boxes
	public boolean checkEquality(Box anotherBox) {
		// eg : b1.checkEquality(b2)
		return this.width == anotherBox.width && this.depth == anotherBox.depth && this.height == anotherBox.height;
	}

//Add a method to Box class to return a new Box with modified dims 
	public Box createNewBox(double wOffset, double dOffset, double hOffset) {
		Box newBox = new Box(this.width + wOffset, this.depth + dOffset, this.height + hOffset);
		return newBox;

	}

}