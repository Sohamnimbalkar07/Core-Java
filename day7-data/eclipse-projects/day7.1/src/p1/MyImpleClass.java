package p1;

public class MyImpleClass implements Printable, Computable {
	@Override
	public void print(String mesg) {
		System.out.println("Print a mesg : "+mesg+TEST_DATA);
	}

	@Override
	public double compute(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	

}
