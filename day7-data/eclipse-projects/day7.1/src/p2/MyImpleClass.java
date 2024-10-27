package p2;

public class MyImpleClass implements A, B {
	@Override
	public void show() {
		System.out.println("in show ");
	}

	@Override
	public void show(String mesg) {
		System.out.println("in show with mesg");
		
	}
	
}
