package test_static;

import static java.lang.System.out;//out ---> *

public class Test1 {

	public static int testData;
	private int id;
	static {
		System.out.println("1");
		testData=100;
	}
	static {
		System.out.println("2");
		testData++;
		test();
	}
	//non static init block
	{
		System.out.println("in non static (instance) initializer block");
	}
	Test1(int id)
	{
		System.out.println("in ctor");
		this.id=id;
	}
	

	public static void main(String[] args) {
		// int testData=1234;
		// System.out.println("local var "+testData);
		out.println("in main : static var " + testData);
		// System.out.println(this);
		Test1 ref1=new Test1(10);
		Test1 ref2=new Test1(20);

		
	}

//	private void show() {
//		System.out.println("in show : non static method");
//		test();
//	}

	private static void test() {
		System.out.println("in test - static method "+testData);
		testData++;
	}

}
