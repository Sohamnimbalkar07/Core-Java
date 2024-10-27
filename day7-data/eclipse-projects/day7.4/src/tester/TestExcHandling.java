package tester;

public class TestExcHandling {

	public static void main(String[] args) {
		try {
			int a = 100;
			int b = 10;
			System.out.println("result " + (a / b));
			System.out.println("end of try....");
		} catch (ArithmeticException e) {
			System.out.println("exc occurred!!!!!");
		}
		System.out.println("code continues...");

	}

}
