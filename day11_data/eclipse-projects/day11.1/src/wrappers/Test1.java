package wrappers;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		Integer i1=Integer.valueOf(1234);//boxing(int--->Integer) : performed by prog
		System.out.println("Integer's toString "+i1);//Integer's toString
		int data=i1.intValue();//un boxing(Integer--->int) : performed by prog
		System.out.println("int value "+data);
		Integer i2=200;//auto boxing : int ---> Integer : auto by javac
		data=i2;//auto un boxing : Integer ---> int : auto by javac
		String s=new String("12345");
		s += 10;//s = s+"10";
		System.out.println(s);
	//	s++;
		Date d1=new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(d1));
	//	d1++;
		StringBuilder sb=new StringBuilder("testing");
	//	sb++;
		i1++;//auto un boxing --inc --auto boxing
		System.out.println(i1);
		i1 += 10;//auto un boxing --inc by 10 --auto boxing
		System.out.println(i1);
		Double d2=123.45;//auto boxing(double --->Double)
		double dblValue=d2++;//auto un boxing ---assignment --inc --auto boxing
		System.out.println(dblValue);
		System.out.println(d2);

	}

}
