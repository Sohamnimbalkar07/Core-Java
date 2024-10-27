package tester;

public class TestCheckedException2 {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("Before");

		Thread.sleep(5000);// InterruptedException -- chked exc --javac forces handling of the chked exc

		System.out.println("After");

	}

}
