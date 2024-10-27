package p1;

public class AnotherFormula implements Formula {

	@Override
	public double calculate(double a) {
		System.out.println("another imple of abstract method");
		return a+5;
	}
	//Can imple class override inherited def method ? YES

	@Override
	public double sqrt(double a, double b) {
		System.out.println("overrding def method imple");
		return Math.sqrt(a*b);
	}
	

}
