package p3;

interface Formula {
	double calculate(double a);// public n abstract
	// public

	default double sqrt(double a, double b) {
		System.out.println("in i/f def method");
		return Math.sqrt(a + b);
	}
	//can static methods be added in i/f : YES
	static void show()
	{
		System.out.println("in show : static method of i/f");
	}
}