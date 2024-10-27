package wrappers;

public class Test2 {

	public static void main(String[] args) {
		int i1=123;
		double d1=i1;//int --> double : widening (auto promotion) : javac
//		Double d2=1234;//auto boxing(int--->Integer) ----X---Double
		Double d2=(double)1234;//auto boxing (double --->Double)
		d1=23.45f;//float --> double : widening (auto promotion) : javac
	//	d2=23.45f;//auto boxing(float--->Float) ----X --Double
		d2=(double)23.45f;
		Number n1=123.456f;//auto boxing(float--->Float) ---> upcasting ---> Number
		n1=1234;
		n1=12.34567;
		Object o=false;//auto boxing(boolean-->Boolean) --> upcasting --> Object
		o=123.45;
		o=12345;
		o=12345678990l;
		o="hello";//String IS -A Object : upcasting
		/*
		 * Is Java 100 % Object oriented language : NO
		 * Can you access any type (primitive type or ref type) using Object type of the reference ? YES
		 */
	}

}
