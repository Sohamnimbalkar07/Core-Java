package p6;

public class Tester {

	public static void main(String[] args) {
		BoundedShape[] shapes = { new Circle(10, 20, 5.5), new Rectangle(50, 60, 10, 20.5) };
		for(BoundedShape shape : shapes)
		{
			System.out.println(shape);
			System.out.println("Area "+shape.calcArea()+" Perimeter "+shape.calcPerimeter());
			
		}

	}

}
