package p2;

interface Formula {
	double calculate(double a);// public n abstract
	// public

	default double sqrt(double a, double b) {
		System.out.println("in i/f def method");
		return Math.sqrt(a + b);
	}
}