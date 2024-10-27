package p1;

public class Tester {

	public static void main(String[] args) {
		Printable printable=new MyImpleClass();//up casting
		printable.print("Some Mesg!!!!");
		Computable ref=new MyImpleClass();
		System.out.println("Result "+ref.compute(10, 20));

	}

}
