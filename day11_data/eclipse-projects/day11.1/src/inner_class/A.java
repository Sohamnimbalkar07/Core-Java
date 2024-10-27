package inner_class;

public class A {
	private int i;
	private static int j;
	static {
		j = 100;
	}

	public A(int i) {
		this.i = i;
	}
	//add static method
	public static void show()
	{
		System.out.println("in static method : show , j="+j);
	}
	//add non static (instance) method
	public void print()
	{
		System.out.println("in non-static print : i="+i+" j="+j);
		//can outer class's non static method , access private  inner class members ? NO
	//	System.out.println("inner's members "+k+" "+l);
		System.out.println("inner's static data member :  "+B.k);
		//create inner class instance
		B b1=new B(12);
		System.out.println("inner's non-static data member :  "+b1.l);
	}
	//can you add a nested class def ? YES --non static nested class : inner class
	class B
	{
		//can you add static data member in the inner class ? : NO
		
//		private static int k;
		//JDK 1.8 onwards : can u declare static final data member : YESS
		private static final int k=1234;
		//can u declare non static (instance) data members ? : YES
		private int l;
//		static {
//			
//		}
		//can u declare static methods in inner class ? NO
//		public static void test()
//		{
//			
//		}
		// can u add constr/s in the inner class : YES
		public B(int l) {
			this.l=l;
		}
		//can u add non static method in the inner class ? YES
		public void innerShow()
		{
			//what all u can access directly from inner's method : outer as well as inner class members : DIRECTLY
			System.out.println("from inner's show "+i+" "+j+" "+k+" "+l);
		}
		
	}
	

}
