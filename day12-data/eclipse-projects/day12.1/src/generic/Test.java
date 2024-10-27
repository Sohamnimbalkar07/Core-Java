package generic;

public class Test {

	public static void main(String[] args) {
		// create holder class instance to hold an int : 12345
		//diamond operator => generic type of the RHS is deduced from type of the LHS
		Holder<Integer> intHolder=new Holder<>(12345);//auto boxing(int -->Integer)		
		//get data from the holder : getter
		int data=intHolder.getReference();//auto unboxing (Integer ---> int)
		
		// create another holder class instance to hold a string : "hello"
		Holder<String> stringHolder=new Holder<>("hello");//NO implicit conversion
			//get data from the holder : getter
		String s=stringHolder.getReference();
		//intHolder=stringHolder;//who has detected type mismatch err ? javac
		//Holder<String> h=new Holder<> ("dafdgadf");
		
		
		

	}

}
