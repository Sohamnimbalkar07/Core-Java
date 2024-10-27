package multi_dim_arrays;

import java.util.Arrays;
import static java.lang.System.out;//out ---> *

public class Test1 {
    public static int testData=4567;
	public static void main(String[] args) {
	//   int testData=1234;
	//   System.out.println("local var "+testData);
	   out.println("static var "+testData);
	//   System.out.println(this);
		double[][] data=new double[3][4];
		int value=100;
		//display array contents : for loop
		for(int i=0;i<data.length;i++)
			for(int j=0;j<data[i].length;j++)
				data[i][j]=value++;
		//easier way to print multi dim array contents ? YES
		out.println(Arrays.deepToString(data));
		Test1 t1=new Test1();
		t1.show();
	}
	private  void show()
	{
		System.out.println("in show : non static method");
		test();
	}
	private static void test()
	{
		System.out.println("in test : static method");
	}
	

}
