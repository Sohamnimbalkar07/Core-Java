package p2;

public class MyImpleClass implements Formula,Formula2 {

	@Override
	public double calculate(double a) {
		// TODO Auto-generated method stub
		return a*a;
	}
	//in case of dup def methods , to avoid the ambiguity : javac FORCES the prog to override dup def method

	@Override
	public double sqrt(double a, double b) {
		//how to access inherited def method ?
		Formula2.super.sqrt(a, b);
		return Formula.super.sqrt(a, b);
	}
	

}
