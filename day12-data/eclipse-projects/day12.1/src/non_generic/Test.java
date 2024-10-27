package non_generic;

public class Test {

	public static void main(String[] args) {
		// create holder class instance to hold an int : 12345
		Holder intHolder=new Holder(12345);//int --> Integer(auto boxing) --> Number ---> Object (up casting)
		//get data from the holder : getter
		int data=(Integer)intHolder.getReference();//downcasting : prog , auto un boxing : javac
		// create another holder class instance to hold a string : "hello"
		Holder stringHolder=new Holder("hello");//string ---> object : upcasting
		String s=(String)stringHolder.getReference();//explicit downcast 
		intHolder=stringHolder;
		data=(Integer)intHolder.getReference();//class cast exc
		System.out.println(data);
		

	}

}
