package test;

public class Test4 extends Hello {
	
	void xxx() {
		System.out.println("1111111111");
	}
	
public static void main(String[] args) {
//	Test4 h =(Test4) new Hello();
	Hello h = new Hello(5);
     h.xxx();
}
}

class Hello{
	//private int x;
	private final int y;
	
	public Hello(int x) {
		y=x;
	}
	void xxx() {
		System.out.println("fbdsfdfbds");
	}
}
