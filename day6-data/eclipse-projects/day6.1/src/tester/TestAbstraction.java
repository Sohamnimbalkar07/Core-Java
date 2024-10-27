package tester;

import shapes.BoundedShape;
import shapes.Circle;
import shapes.Rectangle;

public class TestAbstraction {

	public static void main(String[] args) {
//		BoundedShape[] shapes=new BoundedShape[3];//array of references of type BoundedShape
//		shapes[0]=new Circle(0, 0, 0);
		// int[] data=new int[] {1,2,3,4,5};
		// dynamic init array
		BoundedShape[] shapes = { new Circle(50, 100, 5.6), new Circle(10, 20, 10.5),
				new Rectangle(45, 55, 10.0, 5.8) };// 4 objects (1 array , c1,c2,r1)
		// display complete details of each shape + area
		for (BoundedShape s : shapes) // up casting
			System.out.println(s + " Area " + s.area());// 1st iterations : toString area : Circle , last itr : Rect
														// ---run time poly.
	}

}
