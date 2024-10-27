package p3;

public class MyFormula implements Formula {

	@Override
	public double calculate(double a) {
		System.out.println("imple abstract method");
		return a*5;
	}
	//can you override a static method : NO
	//BUT can u re-declare the static method in a class ? YES
//	@Override
	static void show()
	{
		System.out.println("in show : static method in a class");
	}

}
