package tester;

public class TestCheckedException {

	public static void main(String[] args) {
		System.out.println("Before");
		try {
			Thread.sleep(5000);// InterruptedException -- chked exc --javac forces handling of the chked exc
		} catch (InterruptedException e) {
			System.out.println("err occurred...");
		}
		System.out.println("After");

	}

}
