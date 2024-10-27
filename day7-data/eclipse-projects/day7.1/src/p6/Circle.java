package p6;

public class Circle extends BoundedShape {
	private double radius;
	

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return PI*radius*radius;
	}

	@Override
	public double calcPerimeter() {
		// TODO Auto-generated method stub
		return 2*PI*radius;
	}

	@Override
	public String toString() {
		return "Circle "+super.toString()+" radius=" + radius;
	}
	

}
