package shapes;

public abstract class BoundedShape {
	//state
	private int x,y;
	public BoundedShape(int x,int y) {
		//super()
		this.x=x;
		this.y=y;
	}
	//toString : to ret x n y
	@Override
	public String toString()
	{
		return "x="+x+" y="+y;
	}
	//add abstract method : supply method declaration
	public abstract double area();

}
